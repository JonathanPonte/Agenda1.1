package com.example.jonat.agenda.auth.network

import android.util.Log
import com.example.jonat.agenda.auth.module.User
import io.reactivex.Scheduler
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory

object AuthNetwork {

    private fun getRetrofit(): Retrofit {
        return Retrofit.Builder()
                .baseUrl("https://api-agenda-unifor.herokuapp.com")
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .build()
    }

    val authAPI by lazy {

        getRetrofit().create(AuthAPI::class.java)

    }


    fun cadastrarUsuario(user : User, onSuccess: (user : User) -> Unit, onError: () -> Unit){


        authAPI.cadastrarUsuario(user)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe({
                    //se tudo deu certo

                    it.data?.let {

                        Log.d("tag", "Deu certooooooooooOOOOOO, ${it.email}")
                        onSuccess(it)

                    }

                },{
                    Log.d("tag", "Deu ruim, ${it.message}")
                    onError()
                })

    }




    fun efetuarLogin(user: User, onSuccess: (user: User) -> Unit, onError: () -> Unit){

        Log.d("tag", "efetuarLogin")

        authAPI.loginUsuario(user)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe({response ->

                    Log.d("tag", "responser")

                   response.body()!!.data?.let { user ->

                      Log.d("tag", "user")

                      user.uid = response.headers().get("uid")
                      user.client = response.headers().get("client")
                      user.acessToken = response.headers().get("access-token")
                      onSuccess(user)

                  }

                }, {
                    Log.d("tag", "${it.message}")
                    onError()
                })


    }



}
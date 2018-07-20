package com.example.jonat.agenda.auth.agenda.contatos.network

import com.example.jonat.agenda.auth.agenda.contatos.module.Contato
import io.reactivex.Scheduler
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory

object ContatoNetwork {



    private fun getRetrofit(): Retrofit {
        return Retrofit.Builder()
                .baseUrl("https://api-agenda-unifor.herokuapp.com")
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .build()
    }


    val contatosAPI by lazy {

        getRetrofit().create(ContatosAPI::class.java)

    }



    fun listarContatos(uid : String, client : String, accesstoken : String, onSuccess:  (contatos : List<Contato>) -> Unit, onError: () -> Unit){

    contatosAPI.listarContatos(uid, client, accesstoken)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe({

                it?.let {

                    onSuccess(it)

                }


            }, {

                onError()

            })

    }




}
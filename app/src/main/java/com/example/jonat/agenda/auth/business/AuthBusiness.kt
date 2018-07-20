package com.example.jonat.agenda.auth.business

import android.provider.ContactsContract
import android.util.Log
import com.example.jonat.agenda.auth.database.AuthDatabase
import com.example.jonat.agenda.auth.module.User
import com.example.jonat.agenda.auth.network.AuthNetwork

object AuthBusiness {

    fun cadastrarUsuario(email: String, password: String, onSuccess: () -> Unit, onError: () -> Unit){

        val user = User()

        user.email = email
        user.password = password
        user.passwordConfirmation = password

        Log.d("tag", "to no business, ${user.email}")

        AuthNetwork.cadastrarUsuario(user,{user ->
           onSuccess()
        }, {
            onError()
        } )


    }


    fun efetuarLogin(email: String, password: String, onSuccess: (user : User) -> Unit, onError: () -> Unit){

        val user = User()

        user.email = email
        user.password = password

        AuthNetwork.efetuarLogin(user,{user ->
            AuthDatabase.salvarUsuario(user){
                Log.d("tag", "Entrei,, ${user.acessToken}")

            }
             onSuccess(user)
        }, {
            Log.d("tag", "Socorro")
            onError()
        })




    }



}
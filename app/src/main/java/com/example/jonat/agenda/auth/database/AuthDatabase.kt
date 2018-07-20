package com.example.jonat.agenda.auth.database

import android.util.Log
import com.example.jonat.agenda.auth.module.User
import io.realm.Realm

object AuthDatabase {

    fun salvarUsuario(user : User, onSuccess: () -> Unit){

        Log.d("tag", "Lambida efetuar Login")
        Realm.getDefaultInstance().use { realm ->

            realm.beginTransaction()
            realm.copyToRealmOrUpdate(user)
            realm.commitTransaction()
            onSuccess()

        }

    }


}
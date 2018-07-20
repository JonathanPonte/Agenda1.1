package com.example.jonat.agenda.auth.agenda.contatos.databese

import com.example.jonat.agenda.auth.agenda.contatos.module.Contato
import com.example.jonat.agenda.auth.module.User
import io.realm.Realm

object ContatoDataBase {


    fun salvarContatos(contatos : List<Contato>, onSuccess: () -> Unit){

        Realm.getDefaultInstance().use {realm ->

            realm.beginTransaction()
            realm.copyToRealmOrUpdate(contatos)
            realm.commitTransaction()
            onSuccess()

        }


    }



    fun recuperarUsuario(id : Int, onSuccess: (user : User) -> Unit){



            val realm = Realm.getDefaultInstance()

            val usuario = realm.where(User::class.java).equalTo("id", id).findFirst()

            usuario?.let {


                onSuccess(it)


            }



    }






}
package com.example.jonat.agenda.auth.agenda.contatos.databese

import com.example.jonat.agenda.auth.agenda.contatos.module.Contato
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



}
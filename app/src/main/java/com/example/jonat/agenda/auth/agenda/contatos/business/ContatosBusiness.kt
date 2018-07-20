package com.example.jonat.agenda.auth.agenda.contatos.business

import com.example.jonat.agenda.auth.agenda.contatos.databese.ContatoDataBase
import com.example.jonat.agenda.auth.agenda.contatos.module.Contato
import com.example.jonat.agenda.auth.agenda.contatos.network.ContatoNetwork

object ContatosBusiness {


    fun lisatarContatos(uid : String, client: String , accesstoken: String, onSuccess: () -> Unit, onError: () -> Unit){

        ContatoNetwork.listarContatos(uid, client, accesstoken, {contatos ->
            ContatoDataBase.salvarContatos(contatos){



            }

        }, {

            onError()

        })



    }





}
package com.example.jonat.agenda.auth.agenda.contatos.business

import com.example.jonat.agenda.auth.agenda.contatos.databese.ContatoDataBase
import com.example.jonat.agenda.auth.agenda.contatos.module.Contato
import com.example.jonat.agenda.auth.agenda.contatos.network.ContatoNetwork

object ContatosBusiness {


    fun lisatarContatos(id : Int, onSuccess: () -> Unit, onError: () -> Unit){

        ContatoDataBase.recuperarUsuario(id){

            ContatoNetwork.listarContatos(it.uid.toString(), it.client.toString(), it.acessToken.toString(), {contatos ->
                ContatoDataBase.salvarContatos(contatos){



                }

            }, {

                onError()

            })


        }


    }





}
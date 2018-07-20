package com.example.jonat.agenda.auth.agenda.contatos.view.activity

import android.support.v7.widget.RecyclerView
import android.view.ViewGroup
import com.example.jonat.agenda.auth.agenda.contatos.business.ContatosBusiness
import com.example.jonat.agenda.auth.agenda.contatos.module.Contato
import io.realm.Realm

class ContatosAdapter: RecyclerView.Adapter<ContatosViewHolder>() {




    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContatosViewHolder {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getItemCount(): Int {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onBindViewHolder(holder: ContatosViewHolder, position: Int) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }



    fun listarContatos(uid : String, client : String, accessToken : String, onSuccess: () -> Unit){

        ContatosBusiness.lisatarContatos(uid, client, accessToken, {





        },{


        })




    }





}
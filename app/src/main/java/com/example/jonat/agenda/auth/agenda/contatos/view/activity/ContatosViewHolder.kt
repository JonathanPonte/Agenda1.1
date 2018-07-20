package com.example.jonat.agenda.auth.agenda.contatos.view.activity

import android.support.v7.widget.RecyclerView
import android.view.View
import com.example.jonat.agenda.auth.agenda.contatos.module.Contato
import kotlinx.android.synthetic.main.viewholder_contatos.view.*

class ContatosViewHolder(val view : View) : RecyclerView.ViewHolder(view) {


    fun bind(contato : Contato){

        with(view){

            nomeContato.text = contato.name
            telefoneContato.text = contato.phone
            emailContato.text = contato.email
            imagemContato.text = contato.picture

        }

    }


}
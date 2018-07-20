package com.example.jonat.agenda.auth.agenda.contatos.view.activity

import android.support.v7.widget.RecyclerView
import android.view.View
import kotlinx.android.synthetic.main.viewholder_contatos.view.*

class ContatosViewHolder(val view : View) : RecyclerView.ViewHolder(view) {


    fun bind(nome : String){

        with(view){

            nomeContato.text = nome
          //  telefoneContato.text = telefone
          //  emailContato.text = email
           // imagemContato.text = image

        }

    }


}
package com.example.jonat.agenda.auth.agenda.contatos.view.activity

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import com.example.jonat.agenda.R
import com.example.jonat.agenda.auth.agenda.contatos.business.ContatosBusiness
import io.realm.Realm

class ContatosActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_contatos)



        Realm.init(this)


        //var id = intent.getIntExtra("id", 0)





    }



    fun listarContatos(uid : String, client : String, accessToken : String, onSuccess: () -> Unit){

        ContatosBusiness.lisatarContatos(uid, client, accessToken, {





        },{


        })




    }





}
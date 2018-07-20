package com.example.jonat.agenda.auth.agenda.contatos.view.activity

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import com.example.jonat.agenda.R
import io.realm.Realm

class ContatosActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_contatos)




        var id = intent.getIntExtra("id", 0)




    }

}
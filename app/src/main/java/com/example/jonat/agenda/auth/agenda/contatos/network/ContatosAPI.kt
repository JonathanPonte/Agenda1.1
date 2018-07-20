package com.example.jonat.agenda.auth.agenda.contatos.network

import com.example.jonat.agenda.auth.agenda.contatos.module.Contato
import io.reactivex.Observable
import retrofit2.http.GET
import retrofit2.http.Header


interface ContatosAPI {

    @GET("/contacts")
    fun listarContatos(@Header("uid") uid : String,
                       @Header("client") client : String,
                       @Header("access-token") accesstoken : String): Observable<List<Contato>>




}
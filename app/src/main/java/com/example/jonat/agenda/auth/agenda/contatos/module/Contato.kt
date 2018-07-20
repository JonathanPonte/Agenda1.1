package com.example.jonat.agenda.auth.agenda.contatos.module

import io.realm.RealmObject
import io.realm.annotations.PrimaryKey

open class Contato : RealmObject(){


    @PrimaryKey var id : Int? = null
    var  name : String? = ""
    var birth : Long? = null
    var email : String? = ""
    var phone : String? = ""
    var picture : String = ""

}
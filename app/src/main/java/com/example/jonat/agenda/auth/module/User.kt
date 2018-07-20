package com.example.jonat.agenda.auth.module

import com.google.gson.annotations.SerializedName
import io.realm.RealmObject
import io.realm.annotations.PrimaryKey

open class User: RealmObject(){

  @PrimaryKey  var id : Int? = null

    var email : String? = ""

    var password : String? = ""

    @SerializedName("password_confirmation")
    var passwordConfirmation : String? = ""



    var uid : String? = ""

    var client : String? = ""

    var acessToken : String? = ""

}
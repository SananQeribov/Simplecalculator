package com.example.simple_project

import androidx.lifecycle.MutableLiveData

class Repository {

    var mathresult = MutableLiveData<String>()
    init {
        mathresult = MutableLiveData("0")
    }
    fun getmathresult ():MutableLiveData<String>{
        return mathresult
    }
    fun top(alinansay1:String,alinansay2:String){

        val say1 = alinansay1.toInt()
        val sayi2 = alinansay2.toInt()
        val toplam = say1 + sayi2
        mathresult.value = toplam.toString()

    }
    fun vur(alinansay1:String,alinansay2:String){

        val say1 = alinansay1.toInt()
        val sayi2 = alinansay2.toInt()
        val vurma = say1 * sayi2
        mathresult.value = vurma.toString()

    }
}
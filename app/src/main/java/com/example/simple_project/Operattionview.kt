package com.example.simple_project

import android.view.View
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.recyclerview.widget.RecyclerView.ViewHolder

class Operattionview() :ViewModel() {
    var rep = Repository()
    var result =MutableLiveData<String>()
    init {
        result = rep.getmathresult()
    }
    fun toplama(alinansay1:String,alinansay2:String){

    rep.top(alinansay1,alinansay2)

    }
    fun vurma(alinansay1:String,alinansay2:String){

        rep.vur(alinansay1,alinansay2)

    }
}
package com.blackpuppydev.bppgame.listener

import java.text.FieldPosition

interface FragmentListener {

    fun onSuccess(result:String)
    fun onPage(page:String,position:Int)

}
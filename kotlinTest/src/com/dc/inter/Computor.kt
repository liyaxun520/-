package com.dc.inter

class Computor(){

    lateinit var  usbStorage:IMobileStorage


    fun readData(){
        usbStorage.readData()
    }

    fun writeData(){
        usbStorage.writeData()
    }
}
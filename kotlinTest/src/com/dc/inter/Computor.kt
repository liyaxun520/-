package com.dc.inter

class Computor(){

    lateinit var  usbStorage:IMobileStorage


//    constructor(usbStorage: IMobileStorage) {
//        this.usbStorage = usbStorage
//    }


    fun readData(){
        usbStorage.readData()
    }

    fun writeData(){
        usbStorage.writeData()
    }
}
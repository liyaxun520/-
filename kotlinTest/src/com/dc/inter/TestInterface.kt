package com.dc.inter

import com.dc.inter.`super`.SuperStorage
import com.dc.inter.`super`.SuperStorageAdapter
import com.dc.inter.son.FlashStorage
import com.dc.inter.son.HardStorage
import com.dc.inter.son.Mp3Storage

fun main() {

    var computor = Computor()
    //闪存
    println("---------闪存-----------------")
    var flashStorage = FlashStorage()
    computor.usbStorage = flashStorage
    computor.readData()
    computor.writeData()

    //Mp3
    println("---------Mp3-----------------")
    var mp3Storage = Mp3Storage()
    computor.usbStorage = mp3Storage
    computor.readData()
    computor.writeData()

    //硬盘
    println("---------硬盘-----------------")
    var hardStorage = HardStorage()
    computor.usbStorage = hardStorage
    computor.readData()
    computor.writeData()

    println("---------超级硬盘（适配器模式）-----------------")
    var storageAdapter = SuperStorageAdapter()
    var superStorage = SuperStorage()
    storageAdapter.superStorage = superStorage
    computor.usbStorage = storageAdapter
    computor.readData()
    computor.writeData()
}
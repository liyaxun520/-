package com.dc.inter.`super`

import com.dc.inter.IMobileStorage

class SuperStorageAdapter :IMobileStorage{

    lateinit var superStorage: SuperStorage


    override fun readData() {
        superStorage.rd()
    }

    override fun writeData() {
        superStorage.wt()
    }
}
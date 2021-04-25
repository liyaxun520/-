package com.dc.inter.son

import com.dc.inter.IMobileStorage

class Mp3Storage :IMobileStorage {
    override fun readData() {
        println("Mp3存储设备读取数据")
    }

    override fun writeData() {
        println("Mp3存储设备写入数据")
    }
}
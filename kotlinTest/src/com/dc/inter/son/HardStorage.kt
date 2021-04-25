package com.dc.inter.son

import com.dc.inter.IMobileStorage

class HardStorage :IMobileStorage {
    override fun readData() {
        println("硬盘设备读取数据")
    }

    override fun writeData() {
        println("硬盘设备写入数据")
    }
}
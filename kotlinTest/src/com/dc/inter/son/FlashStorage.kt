package com.dc.inter.son

import com.dc.inter.IMobileStorage

class FlashStorage :IMobileStorage {
    override fun readData() {
        println("闪存设备读取数据")
    }

    override fun writeData() {
        println("闪存设备写入数据")
    }
}
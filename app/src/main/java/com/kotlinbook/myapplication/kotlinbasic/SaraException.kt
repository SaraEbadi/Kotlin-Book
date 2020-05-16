package com.kotlinbook.myapplication.kotlinbasic

class SaraException : RuntimeException() {
    fun ebadi(){
        throw SaraException()
    }
}

class Sara2Exception : Exception(){
    fun ebadi2(){
        throw Sara2Exception()
    }
}
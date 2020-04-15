package com.kotlinbook.myapplication.kotlinbasic

/**
 * Start with a keyword, and you may (or may not) put the type after the variable name.
 * Just as with expression-body functions, if you don’t specify the type, the compiler analyzes
 * and uses its type as the variable type.
 */
val question = "The Ultimate Question of Life, the Universe, and Everything"
val answer = 42
val yearsToCompute = 7.5e6
var isTrue = true


/**
 * A val variable must be initialized exactly once during the execution of the block where it’s defined.
 * But you can initialize it with different values depending on some condition, if the compiler can
 * ensure that only one of the initialization statements will be executed.
 */
fun getMessage() {
    val message: String
    if(isTrue){
        message ="Success"
    }else{
        message = "Failure"
    }
}

/**
 * Even though a val reference is itself immutable but the object that it point to may be mutable.
 */
fun getLanguage(){
    val languages = arrayListOf("java")
    languages.add("kotlin")
}

/**
 * Even though a var variable is mutable but it's type is fixed.
 */
fun getAnswer(){
    val answer = 42
    //answer = "answer"
}

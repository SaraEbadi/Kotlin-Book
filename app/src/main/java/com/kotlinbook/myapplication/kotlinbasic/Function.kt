package com.kotlinbook.myapplication.kotlinbasic

import android.graphics.Color.*

/**
 * Functions declare in top-level file without put it in the class.
 * it's followed by parameter list in parentheses and return type after input parameters.
 * "if" is an expression with a result value, not statement.
 * The difference between a statement and an expression is that an expression has a value,
 * which can be used as part of another expression, whereas a statement is always a top-level element
 * in its enclosing block and doesn't have its own value.
 */
fun max(a: Int, b: Int): Int {
    return if (a > b) a else b
}

/**
 * It's body consists of a single expression and you can remove curly braces.
 * If a function written with its body and curly braces, this function has a block body,
 * and if it return an expression it has an expression body.
 */
fun max2(a: Int, b: Int): Int = if (a > b) a else b

/**
 * Expression vs Statement:
 * An expression is a combination of one or more explicit values,
 * constants, variables, operators and functions that interprets and computes to produce another value.
 * A statement is the smallest standalone element of an imperative programming language that
 * expresses some action to be carried out.
 */
//val a = 10 --> its statement not an expression
//a = 11  --> property assignment is not an expression
//class A{}  --> Local class declaration is not an expression
//sumOf(1,2,3)  --> expression


/**
 * All Kotlin functions calls are expressions, because they return at least Unit but Java functions
 * that do not defined any return type are not expressions. Kotlin value assignment (a = 1) is not
 * an expression in Kotlin, while it is in Java because over there it returns assigned value
 * (in Java you can do a = b = 2 or a = 2 * (b = 3)). All usages of control structures (if, switch)
 * in Java are not expressions, while Kotlin allowed if, when and try to return values:
 */
fun Animal(a: Boolean,b: Boolean){
    val zara = false
    val bird = if(a > b) a else b
    val color = when {
        bird -> GREEN
        zara -> YELLOW
        else -> BLUE
    }
}

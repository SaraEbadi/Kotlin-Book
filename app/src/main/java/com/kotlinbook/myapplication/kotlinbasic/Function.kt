package com.kotlinbook.myapplication.kotlinbasic

/**
 * Functions declare in top-level file without put it in the class.
 * it's followed by parameter list in parentheses and return type after input parameters.
 * "if" is an expression with a result value, not statement.
 * The difference between a statement and an expression is that an expression has a value,
 * which can be used as part of another expression, whereas a statement is always a top-level element
 * in its enclosing block and doesn't have its own value.
 */
fun max(a: Int, b: Int) : Int {
    return if (a > b) a else b
}
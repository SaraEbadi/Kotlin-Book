package com.kotlinbook.myapplication.kotlinbasic

/**
 * Classes of this type (containing only data but no code) are often called "value objects".
 * In Kotlin, public is the default visibility, so we can omit it.
 */
class person(
    //Read-only property: generates a field and a trivial getter
    val name: String,
    //Writable property: a field, a getter, and a setter
    var isMarried: Boolean
)

/**
 * Call the constructor without the “new” keyword.
 * You access the property directly, but the getter is invoked.
 */
//val person = Person("Bob", true)
//println(person.name)Bob
//println(person.isMarried)true
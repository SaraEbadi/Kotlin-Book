package com.kotlinbook.myapplication.kotlinbasic

/**
 * 1-Declare dataClass with two parameters: name and age
 */
data class Person(
    val name: String,
    //2- Nullable type(Int?);the age property is null by default (if it isn't specified).
    val age: Int? = null
)

/**
 * 3-Top-level function in kotlin
 */
fun main(args:Array<String>){
    //4- Named argument; create list of people, omit bob's age so default value null is used.
    val persons = listOf(
        Person("bob"),
        Person("sara", 16)
    )

    //5- Lambada expression; "elvis" operator.
    // use the function maxBy to find the oldest person in the list. The lambda expression passed to
    // the function takes one parameter, and you use it as the default name of that parameter.
    // The Elvis operator?:returns zero if age isnull. Because Alice’s age isn’t specified,
    // the Elvis operator replaces it with zero, so Bob wins the prize of being the oldest person.
    val oldest = persons.maxBy { it.age ?: 0}

    //6- String template.
    println("the oldest is : $oldest")


    //7- Autogenerated 'toString'.
    // The oldest is: Person(name=Bob,age=29)
}
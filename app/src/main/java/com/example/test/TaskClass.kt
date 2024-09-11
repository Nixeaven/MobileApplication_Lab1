package com.example.test
import kotlin.random.Random

class TaskClass (var initialString: String){
    var initialArray: List<Int>? = null
    init {
        if (initialString == "") {
            initialArray = List(10, {Random.nextInt(100)})
        } else {
            initialArray = initialString.split(" ").map { it.toInt() }
        }
    }

    fun generateInitialString(): String {
        return initialArray!!.map { it.toString() }.reduce { result, nr -> "$result $nr" }
    }

    fun task(): Double {
        var result: Double = 0.0
        var countEvenNumsInOddPlacement: Int = 0
        initialArray?.forEachIndexed() { index, el ->
            if ((index % 2 == 0) && (el % 2 == 0)) {
                countEvenNumsInOddPlacement++
                result += el
            }
        }
        if (countEvenNumsInOddPlacement == 0) return 0.0
        else return result/countEvenNumsInOddPlacement
    }
}
package com.zepben.evolvemapping.services

import com.zepben.evolvemapping.models.sincal.StdTwoWindingTransformer

class SincalService(private val stdTwoWindingTransformerMap: MutableMap<Int, StdTwoWindingTransformer> = mutableMapOf())
{
    fun addStdTwoWindingTransformer(stdTwoWindingTransformer: StdTwoWindingTransformer) {
        stdTwoWindingTransformerMap[stdTwoWindingTransformer.elementId] = stdTwoWindingTransformer
    }

    fun printTwoWindingTransformerList(){
        print(stdTwoWindingTransformerMap.forEach{ (_, v)-> println(v)})
    }
}



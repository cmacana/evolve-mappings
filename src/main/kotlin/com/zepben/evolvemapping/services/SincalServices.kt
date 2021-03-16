package com.zepben.evolvemapping.services

internal class SincalServices(
    val StdTwoWindingTransformerMap: MutableMap<String, SincalElement> = mutableMapOf()
){

}



internal data class SincalElement(
    val Element_ID: String
)


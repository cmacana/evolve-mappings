package com.zepben.evolvemapping.services

internal class SincalServices(
    val byElementId: MutableMap<String, SincalElement> = mutableMapOf()
)

internal data class SincalElement(val elementId: String)
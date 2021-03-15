package com.zepben.evolvemapping.services

internal class ServicesStore(
    val cim : CimServices = CimServices(),
    val sincal: SincalServices = SincalServices()
)

package com.zepben.evolvemapping.services

internal class ServiceStore {
    internal class ServicesStore(
        val cim : CimServices = CimServices(),
        val sincal: SincalService = SincalService()
    )
}
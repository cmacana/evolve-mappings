package com.zepben.evolvemapping.services

import com.zepben.evolve.services.network.NetworkService


internal class CimServices(
    private val networkService: NetworkService = NetworkService()
){
    fun services() = listOf(networkService)
}
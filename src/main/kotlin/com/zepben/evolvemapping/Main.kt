package com.zepben.evolvemapping

import com.zepben.evolvemapping.config.StdLineReader
import org.slf4j.LoggerFactory
import java.nio.file.Path
import java.nio.file.Paths
import java.text.ParseException
import kotlin.system.exitProcess


private val logger = LoggerFactory.getLogger("xml-rdf-network-importer")

fun main() {
    val dbPath = "F:\\Data\\EssentialEnergy\\SINCAL\\LineTypesV16.mdb"

    val p = Paths.get(dbPath)
    print(p.fileName)
    print(p.toString())

    val stdLineReader = StdLineReader()
    val records = stdLineReader.readMsAccessStdLineRecords(p)

}



package com.zepben.evolvemapping

import com.zepben.evolvemapping.config.StdLineReader
import org.slf4j.LoggerFactory
import java.nio.file.Path
import java.nio.file.Paths
import java.text.ParseException
import kotlin.system.exitProcess


private val logger = LoggerFactory.getLogger("xml-rdf-network-importer")

/**
 * Run Mapping from SINCAL V16 Master db to produce an EWB Sqlite db.
 */

fun main(args: Array<String>) {
    val dbPath = args[0] // args = Path to the acces database needs to be provide as an unique argument
    val stdLineReader = StdLineReader()
    val records = stdLineReader.readMsAccessStdLineRecords(Paths.get(dbPath))
    println(records)

}



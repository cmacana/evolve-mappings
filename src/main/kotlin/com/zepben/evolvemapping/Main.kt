package com.zepben.evolvemapping

import com.zepben.evolvemapping.config.StdLineReader
import com.zepben.evolvemapping.config.StdTwoWindingTransformerReader
import com.zepben.evolvemapping.services.SincalService
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
    val dbPath = args[0] // args = Path to the access database needs to be provide as an unique argument
    val sincalService = SincalService()
    StdTwoWindingTransformerReader(path = Paths.get(dbPath), sincalService = sincalService).readMsAccessStdTwoWindingTransformer()
    sincalService.printTwoWindingTransformerList()
}



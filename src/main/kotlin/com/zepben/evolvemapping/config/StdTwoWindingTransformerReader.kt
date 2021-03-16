package com.zepben.evolvemapping.config

import com.zepben.evolvemapping.models.sincal.StdTwoWindingTransformer
import com.zepben.evolvemapping.services.SincalService
import java.nio.file.Path
import java.sql.DriverManager

class StdTwoWindingTransformerReader(private val path: Path, private val sincalService: SincalService) {

    fun readMsAccessStdTwoWindingTransformer(): SincalService {

        Class.forName("net.ucanaccess.jdbc.UcanaccessDriver")
        val url = "jdbc:ucanaccess://$path"
        val connection = DriverManager.getConnection(url)
        val statement = connection.createStatement()
        val resultSet = statement.executeQuery("SELECT * FROM StdTwoWindingTransformer")
        while (resultSet.next()){
            val stdTwoWindingTransformer =  StdTwoWindingTransformer(
                elementId = resultSet.getInt("Element_ID")
            )
            sincalService.addStdTwoWindingTransformer(stdTwoWindingTransformer)
        }
        return sincalService
    }
}

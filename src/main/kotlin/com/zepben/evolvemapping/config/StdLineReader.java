package com.zepben.evolvemapping.config;

import java.io.IOException;
import java.nio.file.Path;
import java.sql.*;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import static java.lang.Math.round;

public class StdLineReader {

    public Set<StdLineRecord> readMsAccessStdLineRecords(Path path) throws SQLException, ClassNotFoundException {
        final Set<StdLineRecord> records = new HashSet<>();
        // Load driver
        Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
        String url = "jdbc:ucanaccess://" + path.toString();
        try (
                final Connection connection = DriverManager.getConnection(url);
                final Statement statement = connection.createStatement();
                final ResultSet resultSet = statement.executeQuery("SELECT * FROM Stdline")
        ) {
            while (resultSet.next()) {
                records.add(
                        new StdLineRecord(
                                resultSet.getInt("Element_ID"),
                                resultSet.getDouble("r"),
                                resultSet.getDouble("x"),
                                resultSet.getDouble("r0"),
                                resultSet.getDouble("x0"),
                                resultSet.getDouble("Ith")
                        ));
            }
            return records;
        }
    }

    final public static class StdLineRecord {

        final int elementId;
        final double r;
        final double x;
        final double r0;
        final double x0;
        final double ith;

        public StdLineRecord(int elementId, double r, double x, double r0, double x0, double ith) {
            this.elementId = elementId;
            this.r = r;
            this.x = x;
            this.r0 = r0;
            this.x0 = x0;
            this.ith = ith;
        }
    }

}

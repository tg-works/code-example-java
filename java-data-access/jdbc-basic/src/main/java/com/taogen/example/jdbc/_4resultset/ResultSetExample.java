package com.taogen.example.jdbc._4resultset;

import com.taogen.example.jdbc._3statement.StatementUtil;
import com.taogen.example.jdbc.constant.StatementSQL;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.sql.ResultSet;
import java.sql.SQLException;

import static com.taogen.example.jdbc._4resultset.ResultSetUtil.getUpdatableResultSet;

public class ResultSetExample {

    private static final Logger logger = LogManager.getLogger();

    public static void printResultSet() throws SQLException {
        ResultSet resultSet = StatementUtil.executeDqlSql(StatementSQL.SELECT_SQL);
        while (resultSet.next()) {
            int id = resultSet.getInt("id");
            String name = resultSet.getString("name");
            logger.info("{} \t {}", id, name);
        }
    }


    public static void updateAllRowsInResultSet(String newname) throws SQLException {
        ResultSet resultSet = getUpdatableResultSet();
        while (resultSet.next()) {
            resultSet.updateString("name", newname);
            resultSet.updateRow();
        }
    }

    public static void insertNewRowInResultSet(String name) throws SQLException {
        ResultSet resultSet = getUpdatableResultSet();
        resultSet.moveToInsertRow();
        resultSet.updateString("name", name);
        resultSet.insertRow();
    }
}

package com.taogen.example.jdbc.ii.connection;

import org.junit.Test;

import java.io.IOException;
import java.sql.SQLException;

import static org.junit.Assert.assertNotNull;

public class ConnectionExampleTest {

    private ConnectionExample connectionExample = new ConnectionExample();

    @Test
    public void getConnection() throws IOException, SQLException {
        assertNotNull(connectionExample.getConnection());
    }
}
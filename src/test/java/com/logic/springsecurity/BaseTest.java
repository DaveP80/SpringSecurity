package com.logic.springsecurity;

import org.testcontainers.containers.MySQLContainer;

public abstract class BaseTest {

    static MySQLContainer mySQLContainer = (MySQLContainer) new MySQLContainer("mysql:latest")
            .withDatabaseName("springyoutube")
            .withUsername("testuser")
            .withPassword("pass")
            .withReuse(true);

    static {
        mySQLContainer.start();
    }
}

package com.primus.security;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Main entry point for the Spring Boot application.
 * The @SpringBootApplication annotation enables auto-configuration, component scanning, and configuration properties.
 */
@SpringBootApplication
public class SpringSecurityJwtApplication {
    public static void main(String[] args) {
        // Starts the Spring Boot application
        SpringApplication.run(SpringSecurityJwtApplication.class, args);
    }
}
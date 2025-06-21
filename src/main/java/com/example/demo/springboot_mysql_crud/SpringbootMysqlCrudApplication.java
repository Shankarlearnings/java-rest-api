package com.example.demo.springboot_mysql_crud;
// Defines the package name where this class resides. Organizes classes into namespaces.

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
// Imports necessary Spring Boot classes to run the application and auto-configure it.

/**
 * Main class to bootstrap the Spring Boot application.
 * Annotated with @SpringBootApplication which enables:
 * - @Configuration: Marks this class as a source of bean definitions.
 * - @EnableAutoConfiguration: Enables Spring Boot’s auto-configuration.
 * - @ComponentScan: Scans for components (like @RestController, @Service, etc.) in the package.
 */
@SpringBootApplication
public class SpringbootMysqlCrudApplication {

	// Main method: This is the entry point of the Spring Boot application.
	public static void main(String[] args) {
		// Starts the Spring Boot application by creating the application context and initializing beans.
		SpringApplication.run(SpringbootMysqlCrudApplication.class, args);
	}

}

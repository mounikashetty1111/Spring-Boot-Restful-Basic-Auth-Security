package com.debu.techtalk.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@ComponentScan({ "com.controller.package1, com.controller.package2, com.controller.package3, com.controller.packageN", "controller", "service" }) // If our Controller class or Service class is not in the same packages we have //to add packages's name like this...directory(package) with main class

public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}

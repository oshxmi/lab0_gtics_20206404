package com.pucp.lab0;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Lab0Application {

	public static void main(String[] args) {
		SpringApplication.run(Lab0Application.class, args);
        System.out.println("Actualizar en el main");
        System.out.println("----------------------");
        System.out.println("Para hacer el merge con la rama main");
        System.out.println("----------------------");
        System.out.println("Para hacer el 2do merge con la rama main");
        System.out.println("----------------------");
        System.out.println("Segundo merge");
	}

}

package com.projectinventory.veggtables;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class VeggtablesApplication {

	public static void main(String[] args) {
		SpringApplication.run(VeggtablesApplication.class, args);
		
		saludar();
	}
	
	public static void saludar() {
	    		System.out.println("Hola soy Daniel");
	    		
	}

}

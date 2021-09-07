package com.cts;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.cts.beans.Car;

@SpringBootApplication
public class SbAutoWiringApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctext = SpringApplication.run(SbAutoWiringApplication.class, args);
		 Car car = ctext.getBean(Car.class);
		 car.drive();
	}

}

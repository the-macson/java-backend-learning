package com.macson.SpringBoot;

import com.macson.SpringBoot.model.Alien;
import com.macson.SpringBoot.model.Laptop;
import com.macson.SpringBoot.service.LaptopService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
	   	ApplicationContext context = SpringApplication.run(Application.class, args);
		//System.out.println("Hello World!");
//		Alien obj = new Alien();
//		obj.code();
//		DI using spring
//		Alien obj = context.getBean(Alien.class);
//		obj.code();

//		Service Class
		LaptopService service = context.getBean(LaptopService.class);

		Laptop lap = context.getBean(Laptop.class);
		service.addLaptop(lap);
	}

}

package com.example.obrestordenadores;

import com.example.obrestordenadores.entities.Laptop;
import com.example.obrestordenadores.repository.LaptopRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.Date;

@SpringBootApplication
public class ObrestordenadoresApplication {

	public static void main(String[] args) {
		ApplicationContext  context=SpringApplication.run(ObrestordenadoresApplication.class, args);
		LaptopRepository repositoryLaptop = context.getBean(LaptopRepository.class);

		Laptop laptop1 = new Laptop(null,"LENOVO","INTEL CORE I5",8,254,2015);
		Laptop laptop2 = new Laptop(null,"HP","INTEL CORE I7",8,1000,2015);
		Laptop laptop3 = new Laptop(null,"TOSHIBA","INTEL CORE I3",4,800,2012);

		//CUANTAS LAPTOPS HAY?
		System.out.println("# libros en base de datos: "+repositoryLaptop.findAll().size());

		repositoryLaptop.save(laptop1);
		repositoryLaptop.save(laptop2);
		repositoryLaptop.save(laptop3);

		System.out.println("# libros en base de datos: "+repositoryLaptop.findAll().size());

	}

}

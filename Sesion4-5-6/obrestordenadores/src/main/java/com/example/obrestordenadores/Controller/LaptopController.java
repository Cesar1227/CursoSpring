package com.example.obrestordenadores.Controller;

import com.example.obrestordenadores.entities.Laptop;
import com.example.obrestordenadores.repository.LaptopRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class LaptopController {

    //Atributos
    private LaptopRepository laptopRepo;

    //Constructor
    public LaptopController(LaptopRepository laptopRepo) {
        this.laptopRepo = laptopRepo;
    }

    //CRUD

    //LISTAR TODOS LAS LAPTOPS

    /**
     * http://localhost:8081/api/laptops
     * @return
     */
    @GetMapping("/api/laptops")
    public List<Laptop> findAll(){
        return laptopRepo.findAll();
    }


    //Guardar Laptop
    /**
     * http://localhost:8081/api/laptops
     * @return
     */
    @PostMapping("/api/laptop")
    public Laptop guardarLaptop(@RequestBody Laptop laptop){
        return laptopRepo.save(laptop);
    }
}

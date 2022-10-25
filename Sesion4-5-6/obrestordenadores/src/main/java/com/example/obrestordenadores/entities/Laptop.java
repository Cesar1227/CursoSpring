package com.example.obrestordenadores.entities;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "laptops")
public class Laptop {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String marca;
    private String procesador;
    private Integer memoriaRAM;
    private Integer memoriaROM;
    private Integer añoLanzamiento;

    public Laptop() {
    }

    public Laptop(Long id, String marca, String procesador, Integer memoriaRAM, Integer memoriaROM, Integer añoLanzamiento) {
        this.id = id;
        this.marca = marca;
        this.procesador = procesador;
        this.memoriaRAM = memoriaRAM;
        this.memoriaROM = memoriaROM;
        this.añoLanzamiento = añoLanzamiento;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getProcesador() {
        return procesador;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }

    public Integer getMemoriaRAM() {
        return memoriaRAM;
    }

    public void setMemoriaRAM(Integer memoriaRAM) {
        this.memoriaRAM = memoriaRAM;
    }

    public Integer getMemoriaROM() {
        return memoriaROM;
    }

    public void setMemoriaROM(Integer memoriaROM) {
        this.memoriaROM = memoriaROM;
    }

    public Integer getAñoLanzamiento() {
        return añoLanzamiento;
    }

    public void setAñoLanzamiento(Integer añoLanzamiento) {
        this.añoLanzamiento = añoLanzamiento;
    }
}

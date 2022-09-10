package com.modelo;

import org.springframework.stereotype.Component;

@Component
public class NotificationService {

    public NotificationService(){
    }

    public String imprimirSaludo(){
        return "Hola, bienvenido!";
    }


}

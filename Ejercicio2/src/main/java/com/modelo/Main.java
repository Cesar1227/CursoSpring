package com.modelo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;

public class Main {

    public static void main(String [] args){

        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        UserService objUserService = (UserService) context.getBean("userService");

        System.out.println(objUserService.objNotiService.imprimirSaludo());

    }
}

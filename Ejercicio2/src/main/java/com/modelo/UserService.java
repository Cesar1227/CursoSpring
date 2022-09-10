package com.modelo;

import org.springframework.stereotype.Component;

@Component
public class UserService {

    NotificationService objNotiService;

    public UserService(NotificationService objNotiService){
        this.objNotiService=objNotiService;
    }


}

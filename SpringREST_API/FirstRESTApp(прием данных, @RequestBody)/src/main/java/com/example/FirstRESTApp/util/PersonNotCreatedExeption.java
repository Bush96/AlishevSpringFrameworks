package com.example.FirstRESTApp.util;

public class PersonNotCreatedExeption extends RuntimeException{
    public PersonNotCreatedExeption (String msg){
        super(msg);
    }
}

package com.kevin.projectspatterns.facade.app1;

import com.kevin.projectspatterns.singleton.SingletonEager;

public class CepApi {


    private static CepApi instance = new CepApi();

    public static CepApi getInstance() {
        return instance;
    }

    public String recoverCity(String cep) {
        return "Araraquara";
    }

    public String recoverState(String cep) {
        return "SP";
    }
}

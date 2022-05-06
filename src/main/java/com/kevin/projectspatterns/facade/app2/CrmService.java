package com.kevin.projectspatterns.facade.app2;

public class CrmService {

    public static void saveClient(String name, String cep, String city, String state) {

        System.out.println("Client salvo no sistema de CRM.");
        System.out.println(name + "\n" + cep  + "\n" + city + "\n" + state + "\n");
    }
}

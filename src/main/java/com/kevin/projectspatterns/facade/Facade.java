package com.kevin.projectspatterns.facade;

import com.kevin.projectspatterns.facade.app1.CepApi;
import com.kevin.projectspatterns.facade.app2.CrmService;

public class Facade {

    public static void clientMigration(String name, String cep) {

        String city = CepApi.getInstance().recoverCity(cep);
        String state = CepApi.getInstance().recoverState(cep);

        CrmService.saveClient(name, cep, city, state);
    }
}

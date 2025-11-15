package nbo;

import nbo.controllers.Client;
import nbo.services.IService;
import nbo.services.IServiceImpl;

public class Main {
    public static void main(String[] args) {
        IService iService = new IServiceImpl();
        Client client = new Client();

        client.setService(iService);
        System.out.println("Result : " + client.perform(20));
    }
}

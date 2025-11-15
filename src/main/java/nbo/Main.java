package nbo;

import nbo.controllers.Client;
import nbo.proxy.ProxyCache;
import nbo.services.IService;
import nbo.services.IServiceImpl;

public class Main {
    public static void main(String[] args) {
        //IService iService = new IServiceImpl();
        IService proxy = new ProxyCache();
        Client client = new Client();
        client.setService(proxy);
        System.out.println("Result : " + client.perform(20));
        System.out.println("Result : " + client.perform(20));
        System.out.println("Result : " + client.perform(20));
    }
}

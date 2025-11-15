package nbo;

import nbo.controllers.Client;
import nbo.proxy.ProxyCache;
import nbo.proxy.SecuredProxy;
import nbo.services.IService;
import nbo.services.IServiceImpl;

public class Main {
    public static void main(String[] args) {
        //IService iService = new IServiceImpl();
        IService proxy = new ProxyCache();

        //IService service = new IServiceImpl();
        var securedProxy = new SecuredProxy();
        var proxyCache = new ProxyCache();

        securedProxy.setTarget(proxy);
        securedProxy.setPassword("1234");
        Client client = new Client();

        client.setService(securedProxy);
        System.out.println("Result : " + client.perform(20));
        System.out.println("Result : " + client.perform(20));
        System.out.println("Result : " + client.perform(20));
    }
}

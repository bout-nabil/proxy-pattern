package nbo.proxy;

import nbo.services.IService;
import nbo.services.IServiceImpl;

import java.util.HashMap;
import java.util.Map;

public class ProxyCache implements IService {

    private IServiceImpl serviceImpl;
    private Map<Integer, Double> cache = new HashMap();

    @Override
    public double compute(int t) {
        if (serviceImpl == null) {
            serviceImpl = new IServiceImpl();
        }
        if(!cache.containsKey(t)){
            double result = serviceImpl.compute(t);
            cache.put(t,result);
            return result;
        }else {
            return cache.get(t);
        }
    }
}

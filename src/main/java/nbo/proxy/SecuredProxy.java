package nbo.proxy;

import nbo.services.IService;

public class SecuredProxy implements IService {
    private IService target;
    private String password;

    @Override
    public double compute(int t) {
        if (password == "1234") {
            return target.compute(t);
        }else {
            throw new RuntimeException("Not authorized");
        }
    }

    public void setTarget(IService target) {
        this.target = target;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

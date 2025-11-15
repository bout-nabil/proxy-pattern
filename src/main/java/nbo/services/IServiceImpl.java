package nbo.services;

public class IServiceImpl implements IService {
    @Override
    public double compute(int t) {
        return t * Math.cos(t*Math.PI/180);
    }
}

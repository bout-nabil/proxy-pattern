package nbo.services;

public class IServiceImpl implements IService {
    @Override
    public double compute(int t) {
        System.out.println("compute ...........");
        return t * Math.cos(t*Math.PI/180);
    }
}

package template;

public abstract class Template {
    public double perform(int a, int b){
        int n = param();
        double sum = 0;
        for(int i = 0; i < n; i++){
            double step = compute(a,b);
            sum += step;
        }
        return sum;
    }

    protected abstract int param();
    protected abstract double compute(int a, int b);
}

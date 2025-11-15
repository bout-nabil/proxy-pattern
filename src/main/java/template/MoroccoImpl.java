package template;

public class MoroccoImpl extends Template{

    @Override
    public int param() {
        return 3;
    }

    @Override
    public double compute(int a, int b) {
        return Math.sqrt(a*a + b*b);
    }
}

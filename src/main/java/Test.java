import template.MoroccoImpl;
import template.Template;

public class Test {
    public static void main(String[] args) {
        Template template = new MoroccoImpl();
        System.out.println(template.perform(2,5));
    }
}

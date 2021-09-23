package circleCyliner;

public class Test {
    public static void main(String[] args) {
        Circle circle = new Circle(8,"red");
        System.out.println(circle);
        Cylinder cylinder = new Cylinder(5,"yellow", 7.7);
        System.out.println(cylinder);
    }
}

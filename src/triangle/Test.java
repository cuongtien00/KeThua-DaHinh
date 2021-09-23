package triangle;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Moi ban nhap mau sac");
        Shape shape = new Shape(scanner.nextLine());
        System.out.println(shape);
        System.out.println("Moi ban nhap do dai 3 canh tam giac");
        Triangle triangle = new Triangle(scanner.nextDouble(),scanner.nextDouble(),scanner.nextDouble());
//        triangle.setSide1();
//        triangle.setSide2();
//        triangle.setSide3();
//
        System.out.println("Area of triangle is " + triangle.getArea());
        System.out.println(triangle);

    }
}

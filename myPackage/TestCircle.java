package myPackage;

import java.util.List;

public class TestCircle {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println("Площадь круга с радиусом "
                + circle.getRadius() + " равна " + circle.getArea());

        Circle circle2 = new Circle(25);
        System.out.println("Площадь круга с радиусом "
                + circle.getRadius() + " равна " + circle.getArea());

        Circle circle3 = new Circle();
        System.out.println("Площадь круга с радиусом "
                + circle.getRadius() + " равна " + circle.getArea());

        List.of(new Circle(),new Circle(25),new Circle(100))
                .forEach((object)->{
                    System.out.println("Площадь круга с радиусом"+
                            object.getRadius()+"равна"+object.getArea());
                });

    }
}

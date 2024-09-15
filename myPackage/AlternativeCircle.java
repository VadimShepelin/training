package myPackage;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Arrays;
import java.util.List;

@NoArgsConstructor
public class AlternativeCircle {

    @Getter
    @Setter
    private double radius;

    public static void main(String[] args) {
//        AlternativeCircle circle1 = new AlternativeCircle();
//        System.out.println("Площадь круга с радиусом "
//                + circle1.getRadius() + " равна " + circle1.getArea());
//
//        AlternativeCircle circle2 = new AlternativeCircle(25);
//        System.out.println("Площадь круга с радиусом "
//                + circle1.getRadius() + " равна " + circle1.getArea());
//
//        AlternativeCircle circle3 = new AlternativeCircle(100);
//        System.out.println("Площадь круга с радиусом "
//                + circle1.getRadius() + " равна " + circle1.getArea());

    }

    public double getArea() {
        return this.radius*this.radius*Math.PI;
    }

    public double getPerimeter() {
        return this.radius*2*Math.PI;
    }

    public AlternativeCircle(double radius) {
        this.radius = radius;
    }
}

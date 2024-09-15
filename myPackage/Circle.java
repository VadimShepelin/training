package myPackage;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@NoArgsConstructor
public class Circle {

    @Getter
    private double radius=0;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return this.radius*this.radius*Math.PI;
    }

    public double getPerimeter() {
        return this.radius*2*Math.PI;
    }




}
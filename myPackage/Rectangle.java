package myPackage;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Rectangle {

    private double height =  -1;
    private double weight = -1;

    public double getArea() {
        return this.height*this.weight;
    }

    public double getPerimeter() {
        return (this.height*2)+(this.weight*2);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "height=" + this.height +
                ", weight=" + this.weight +
                ", area=" + this.getArea() +
                ", perimeter=" + this.getPerimeter()+
                '}';
    }
}

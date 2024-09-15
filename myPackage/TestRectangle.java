package myPackage;

import java.util.List;

public class TestRectangle {

    public static void main(String[] args) {
        List.of(new Rectangle(4,40),new Rectangle(3.5,35.9))
                .forEach((object)->{
                    System.out.println(object.toString());
                });
    }
}

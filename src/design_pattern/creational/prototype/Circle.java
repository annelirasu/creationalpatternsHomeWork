package design_pattern.creational.prototype;

public class Circle extends Shape {

    public Circle(){
        type = "Circle";
    }

    @Override
    public void draw() {
        System.out.println("Method draw inside of Circle class");
    }
}

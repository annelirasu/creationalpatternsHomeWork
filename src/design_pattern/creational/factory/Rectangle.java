package design_pattern.creational.factory;

public class Rectangle implements Shape {

   @Override
   public void draw() {
      System.out.println("Draw method from Rectangle object");
   }

   @Override
   public int calculateArea() {
      return 0;
   }
}

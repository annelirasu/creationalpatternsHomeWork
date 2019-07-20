package design_pattern.creational.singleton.simple;

public class SingleObject {


   private static SingleObject instance = new SingleObject();

   private SingleObject(){}

   public static SingleObject getInstance(){
      return instance;
   }

}
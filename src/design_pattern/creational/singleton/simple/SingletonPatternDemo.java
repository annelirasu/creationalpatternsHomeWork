package design_pattern.creational.singleton.simple;


public class SingletonPatternDemo {
   public static void main(String[] args) {

      //SingleObject object = new SingleObject();


      SingleObject object = SingleObject.getInstance();
      System.out.println(object);
      SingleObject object2 = SingleObject.getInstance();
      System.out.println(object2);
   }
}
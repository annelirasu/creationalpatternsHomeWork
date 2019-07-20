package design_pattern.creational.abstract_factory;

public class Blue implements Color {
  @Override
  public void fill() {
    System.out.println("Inside Blue::fill() method.");
  }
}

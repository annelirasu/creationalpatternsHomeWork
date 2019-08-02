package design_pattern.AnnelisHomework.SamplesOfCreationalPattern.AbstractFactoryExample;

import java.sql.SQLOutput;
import java.util.Objects;

public class FurnitureFactoryDemo {
    public static void main(String[] args) {
        FurnitureFactory victorianFurnitureFactory=FurnitureFactoryProducer.getFurnitureFactory("victorian");
        Chair victorianChair=victorianFurnitureFactory.createChair();
        CoffeeTable victorianCoffeeTable=victorianFurnitureFactory.createCoffeeTable();
        Sofa victorianSofa=victorianFurnitureFactory.createSofa();

        FurnitureFactory modernFF=FurnitureFactoryProducer.getFurnitureFactory("modern");
        Chair modernChair=modernFF.createChair();
        CoffeeTable modernCoffeeTable=modernFF.createCoffeeTable();
        Sofa modernSofa=modernFF.createSofa();


                System.out.println("Victorian chair: "+victorianChair.toString()+"\n"
        +"Modern chair: "+modernChair.toString()+"\n"
        +"Victorian coffee table: "+victorianCoffeeTable.toString()+"\n"
        +"Modern coffee table: "+modernCoffeeTable.toString()+"\n"
        +"Victorian sofa: "+victorianSofa.toString()+"\n"
        +"Modern sofa: "+modernSofa.toString()+"\n");
    }
}

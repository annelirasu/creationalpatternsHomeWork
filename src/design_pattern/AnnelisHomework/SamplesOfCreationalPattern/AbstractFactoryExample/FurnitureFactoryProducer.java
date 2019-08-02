package design_pattern.AnnelisHomework.SamplesOfCreationalPattern.AbstractFactoryExample;

import design_pattern.creational.abstract_factory.AbstractFactory;
import design_pattern.creational.abstract_factory.ColorFactory;

public class FurnitureFactoryProducer {

    public static FurnitureFactory getFurnitureFactory(String choice){
        if(choice.equalsIgnoreCase("VICTORIAN")){
            return new VictorianFurnitureFactory();
        }else if(choice.equalsIgnoreCase("MODERN")){
            return new ModernFurnitureFactory();
        }
        return null;
    }
}

package design_pattern.AnnelisHomework.SamplesOfCreationalPattern.FactoryExample;

public class AnimalShapedBalloon implements Balloon {


    private BalloonAnimalShape animalShape;
    private boolean isBlown=false;

    public AnimalShapedBalloon() {
        animalShape=BalloonAnimalShape.GIRAFFE;
    }

    @Override
    public void blow() {
        isBlown=true;
        System.out.println("A new animal shaped balloon is blown and also twisted, it now looks like " +animalShape);

    }
//always same volume
    @Override
    public double calculateVolume() {
        return 50;
    }
}

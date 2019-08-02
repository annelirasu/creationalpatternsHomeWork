package design_pattern.AnnelisHomework.SamplesOfCreationalPattern.FactoryExample;

public class BalloonFactoryDemo {
    public static void main(String[] args) {
        BalloonFactory balloonFactory=new BalloonFactory();

        Balloon blueBalloon=balloonFactory.getBalloon("blue");
        Balloon heartShapedBalloon=balloonFactory.getBalloon("heart");
        Balloon animalShapedBalloon=balloonFactory.getBalloon("animal");

        blueBalloon.blow();
        double  volumeofAllBalloons=blueBalloon.calculateVolume();
        heartShapedBalloon.blow();
        volumeofAllBalloons+=heartShapedBalloon.calculateVolume();
        animalShapedBalloon.blow();
        volumeofAllBalloons+=animalShapedBalloon.calculateVolume();
        System.out.println("Volume of all balloons is "+volumeofAllBalloons);
    }
}

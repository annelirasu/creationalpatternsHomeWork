package design_pattern.AnnelisHomework.SamplesOfCreationalPattern.PrototypeExample;

import java.util.Hashtable;

public class BalloonCache {

    private static Hashtable<String, Balloon> balloonMap  = new Hashtable<String, Balloon>();

    public static Balloon getBalloon(String balloonName){
        Balloon cachedBalloon=balloonMap.get(balloonName);
        return (Balloon)cachedBalloon.clone();
    }

    public static void loadBalloonMap(){
        BlueBalloon blueBalloon=new BlueBalloon("blue");
        balloonMap.put(blueBalloon.getName(),blueBalloon);

        HeartShapedBalloon heartShapedBalloon=new HeartShapedBalloon("heart");
        balloonMap.put(heartShapedBalloon.getName(),heartShapedBalloon);

        AnimalShapedBalloon animalShapedBalloon=new AnimalShapedBalloon("animal");
        balloonMap.put(animalShapedBalloon.getName(),animalShapedBalloon);
    }
}

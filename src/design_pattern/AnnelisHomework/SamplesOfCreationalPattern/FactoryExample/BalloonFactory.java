package design_pattern.AnnelisHomework.SamplesOfCreationalPattern.FactoryExample;

public class BalloonFactory {

    public Balloon getBalloon(String balloonType) {
        if (balloonType == null) {
            return null;
        }
        if (balloonType.equalsIgnoreCase("blue")) {
            return new BlueBalloon();
        } else if (balloonType.equalsIgnoreCase("heart")) {
            return new HeartShapedBalloon();
        } else if (balloonType.equalsIgnoreCase("animal")) {
            return new AnimalShapedBalloon();

        } else {
            System.out.println("Balloon type not recognized.");
            return null;
        }

    }
}

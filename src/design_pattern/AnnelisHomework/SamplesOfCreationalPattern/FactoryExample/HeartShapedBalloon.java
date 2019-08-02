package design_pattern.AnnelisHomework.SamplesOfCreationalPattern.FactoryExample;

public class HeartShapedBalloon implements Balloon {
    private BalloonColor color;
    private double volume;
    private boolean isBlown=false;

    public HeartShapedBalloon() {
        this.color = BalloonColor.GOLDEN;
    }

    public HeartShapedBalloon(BalloonColor color) {
        this.color = color;
    }

    @Override
    public void blow() {
        isBlown=true;
        System.out.println("Heart shaped balloon is now blown, it's color is "+color);

    }
// heartShaped Balloon has always the same size
    @Override
    public double calculateVolume() {
        return this.volume=(double)3./4.*Math.PI*Math.pow(10,3)-20;
    }
}

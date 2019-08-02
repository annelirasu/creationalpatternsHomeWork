package design_pattern.AnnelisHomework.SamplesOfCreationalPattern.FactoryExample;

public class BlueBalloon implements Balloon {
   private double radius;
   private double volume;
   private boolean isBlown=false;


    public BlueBalloon() {
        this.radius = 15.;
    }

    public BlueBalloon(double radius) {
        this.radius = radius;
    }

    @Override
    public void blow() {
        isBlown=true;
        System.out.println("Blue ballon is now blown.");

    }

    @Override
    public double calculateVolume() {
        return this.volume=(double)3./4.*Math.PI*radius*radius*radius;
    }
}

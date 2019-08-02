package design_pattern.AnnelisHomework.SamplesOfCreationalPattern.PrototypeExample;

public class BalloonPrototypeDemo {
    public static void main(String[] args) {
        BalloonCache.loadBalloonMap();
        Balloon blue=BalloonCache.getBalloon("blue");
        blue.blow();

        Balloon blue2=BalloonCache.getBalloon("blue");
        blue2.blow();
        blue2.twist();

        Balloon heartShaped=BalloonCache.getBalloon("heart");
        heartShaped.blow();

        Balloon heartShaped2=BalloonCache.getBalloon("heart");
        heartShaped2.blow();
        heartShaped2.twist();

        Balloon animalShaped=BalloonCache.getBalloon("animal");
        animalShaped.twist();
        animalShaped.blow();
        animalShaped.twist();




        System.out.println(blue.toString()+
                "\n "+blue2.toString()+
                "\n "+heartShaped.toString()+
                "\n "+heartShaped2.toString()+
                "\n "+animalShaped.toString());


    }
}

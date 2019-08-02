package design_pattern.AnnelisHomework.SamplesOfCreationalPattern.PrototypeExample;

public class HeartShapedBalloon extends Balloon {
    private boolean isBlown;

    public HeartShapedBalloon(String name) {
        setName(name);
        type="heart shaped balloon";
        isBlown=false;
    }


    @Override
    void blow() {
        isBlown=true;
        System.out.println("The heart shaped balloon is blown.");
    }

    @Override
    void twist() {
        if(isBlown) {
            isBlown = false;
            System.out.println("Twisting an heart shaped balloon makes it flat again - ouch!");
        }
    }

    @Override
    public String toString() {
        return "HeartShapedBalloon{" +
                "isBlown=" + isBlown +
                ", type='" + type + '\'' +
                '}';
    }
}

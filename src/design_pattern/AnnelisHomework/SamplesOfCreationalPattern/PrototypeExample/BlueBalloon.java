package design_pattern.AnnelisHomework.SamplesOfCreationalPattern.PrototypeExample;

public class BlueBalloon extends Balloon {
    private boolean isBlown;
    private boolean isBroken;


//constructor
    public BlueBalloon(String name) {
        setName(name);
        type = "Blue balloon";
        isBlown=false;
    }


    @Override
    void blow() {
       isBlown=true;
        System.out.println("The blue balloon is blown.");
    }

    @Override
    void twist() {
        isBroken=true;
        isBlown=false;
        System.out.println("Twisting a blue balloon breaks it - ouch!");
    }

    @Override
    public String toString() {
        return "BlueBalloon{" +
                "isBlown=" + isBlown +
                ", isBroken=" + isBroken +
                ", type='" + type + '\'' +
                '}';
    }
}

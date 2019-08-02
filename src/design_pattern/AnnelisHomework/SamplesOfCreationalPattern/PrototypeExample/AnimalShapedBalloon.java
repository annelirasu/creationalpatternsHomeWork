package design_pattern.AnnelisHomework.SamplesOfCreationalPattern.PrototypeExample;

public class AnimalShapedBalloon extends Balloon {
    private boolean isBlown;
    private boolean isTwisted;

    public AnimalShapedBalloon(String name) {
        setName(name);
        type="animal shaped balloon";
        isBlown=false;
        isTwisted=false;
    }

    @Override
    void blow() {
        isBlown=true;
        System.out.println("The animal shaped balloon is blown.");
    }

    public void twist(){
        if(!isBlown){
            System.out.println("This animal shaped balloon is not yet blown, can't twist, blow first.");
        }else {
            isTwisted=true;
            System.out.println("The animal shaped balloon is now twisted, and it took an animal shape.");
        }
    }

    @Override
    public String toString() {
        return "AnimalShapedBalloon{" +
                "isBlown=" + isBlown +
                ", isTwisted=" + isTwisted +
                ", type='" + type + '\'' +
                '}';
    }
}

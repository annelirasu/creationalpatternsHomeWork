package design_pattern.AnnelisHomework.SamplesOfCreationalPattern.SingeltonExample;

public class UniqueIDForCat {

    private static int id=1;

    private UniqueIDForCat() {

    }

    private static UniqueIDForCat instance=new UniqueIDForCat();

    public static UniqueIDForCat getInstance(){
        id+=5;
        return instance;
    }

    public static int getId() {
        return id;
    }
}

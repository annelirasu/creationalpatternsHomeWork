package design_pattern.AnnelisHomework.SamplesOfCreationalPattern.SingeltonExample;

public class UniqueIDForCatDemo {

    public static void main(String[] args) {
        UniqueIDForCat UIDforCat1 = UniqueIDForCat.getInstance();

        Cat cat1 = new Cat("Miisu", UniqueIDForCat.getId());

        UniqueIDForCat UIDforCat2 = UniqueIDForCat.getInstance();

        Cat cat2 = new Cat("Nurri", UIDforCat2.getId());

        UniqueIDForCat UIDforCat3 = UniqueIDForCat.getInstance();

        Cat cat3 = new Cat("Mörr", UIDforCat3.getId());

        System.out.println(cat1 +
                "\n" + cat2 +
                "\n" + cat3
        );

    }
}

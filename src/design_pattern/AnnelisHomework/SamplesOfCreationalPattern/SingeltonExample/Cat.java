package design_pattern.AnnelisHomework.SamplesOfCreationalPattern.SingeltonExample;

public class Cat {
    private String name;
    private final int id;

    public Cat(String name, int id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}

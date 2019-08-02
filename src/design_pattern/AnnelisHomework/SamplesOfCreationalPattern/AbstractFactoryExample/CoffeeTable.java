package design_pattern.AnnelisHomework.SamplesOfCreationalPattern.AbstractFactoryExample;

public abstract class CoffeeTable {
    private double price;
    private String characteristics;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getCharacteristics() {
        return characteristics;
    }

    public void setCharacteristics(String characteristics) {
        this.characteristics = characteristics;
    }
    @Override
    public String toString() {
        return "This coffee table has price = " + getPrice() + " and it looks " + getCharacteristics() + "." ;
    }
}

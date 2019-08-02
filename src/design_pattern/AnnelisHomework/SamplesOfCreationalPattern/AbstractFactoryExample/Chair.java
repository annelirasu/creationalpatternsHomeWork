package design_pattern.AnnelisHomework.SamplesOfCreationalPattern.AbstractFactoryExample;


public abstract class Chair {
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

    public String toString() {
        return " This chair has price " + getPrice() + " and it looks " + getCharacteristics() + "." ;
    }

}

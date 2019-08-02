package design_pattern.AnnelisHomework.SamplesOfCreationalPattern.PrototypeExample;

public abstract class Balloon implements Cloneable {

    private String name;
    protected String type;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

  // public void setType(String type) {
    //    this.type = type;
    //}

    abstract void blow();
    abstract void twist();

    public Object clone() {
        Object clone = null;
        try {
            clone = super.clone();

        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
    }

}

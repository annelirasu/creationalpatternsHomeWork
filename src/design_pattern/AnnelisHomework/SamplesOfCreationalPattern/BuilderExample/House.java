package design_pattern.AnnelisHomework.SamplesOfCreationalPattern.BuilderExample;

public class House {
    private double basementSquaremeters;
    private int numberOfFloors;
    private BuildingMaterial buildingMaterial;
    private HeatingSystem heatingSystem;
    private boolean basementIsBuilt;
    private boolean wallsAreBuilt;
    private boolean roofIsBuilt;
    private boolean windowsAndDoorsAreSet;
    private boolean waterSystemIsBuilt;
    private boolean heatingSystemIsBuilt;
    private boolean interiorIsDecorated;

    @Override
    public String toString() {
        return "House{" +
                "\n\t basementSquaremeters=" + basementSquaremeters +
                ", numberOfFloors=" + numberOfFloors +
                ",\n\t buildingMaterial=" + buildingMaterial +
                ", heatingSystem=" + heatingSystem +
                ",\n\t basementIsBuilt=" + basementIsBuilt +
                ", wallsAreBuilt=" + wallsAreBuilt +
                ",\n\t roofIsBuilt=" + roofIsBuilt +
                ", windowsAndDoorsAreSet=" + windowsAndDoorsAreSet +
                ",\n\t waterSystemIsBuilt=" + waterSystemIsBuilt +
                ", heatingSystemIsBuilt=" + heatingSystemIsBuilt +
                ", interiorIsDecorated=" + interiorIsDecorated +
                '}';
    }

    public static class HouseBuilder{
        //required
        private final double basementSquaremeters;
        private final int numberOfFloors;
        private final BuildingMaterial buildingMaterial;
        private final HeatingSystem heatingSystem;

        //optional
        private boolean basementIsBuilt=false;
        private boolean wallsAreBuilt=false;
        private boolean roofIsBuilt=false;
        private boolean windowsAndDoorsAreSet=false;
        private boolean waterSystemIsBuilt=false;
        private boolean heatingSystemIsBuilt=false;
        private boolean interiorIsDecorated=false;

        public HouseBuilder(double basementSquaremeters,
                            int numberOfFloors,
                            BuildingMaterial buildingMaterial,
                            HeatingSystem heatingSystem) {
            this.basementSquaremeters = basementSquaremeters;
            this.numberOfFloors = numberOfFloors;
            this.buildingMaterial = buildingMaterial;
            this.heatingSystem = heatingSystem;
        }

        public HouseBuilder buildBasement(){
            this.basementIsBuilt=true;
            return this;
        }

        public HouseBuilder buildWalls(){
            if(!basementIsBuilt){
                System.out.println("Missing basement, build it first!");
                return null;
            }else{
                this.wallsAreBuilt=true;
                return this;
            }
        }

        public HouseBuilder buildRoof(){
            if(!basementIsBuilt){
                System.out.println("Missing basement, build it first!");
                return null;
            }else if(!wallsAreBuilt){
                System.out.println("Basement is built but walls are missing, build them first!");
                return null;
            }else {
                this.roofIsBuilt=true;
                return this;
            }

        }

        public HouseBuilder setWindowsAndDoors(){
            if(!basementIsBuilt){
                System.out.println("Missing basement, build it first!");
                return null;
            }else if(!wallsAreBuilt){
                System.out.println("Basement is built but walls are missing, build them first!");
                return null;
            }else if(!roofIsBuilt) {
                System.out.println("Basement and walls are built,roof is missing, build it first!");
                return null;
            }else{
                this.windowsAndDoorsAreSet=true;
                return this;
            }
        }

        public HouseBuilder buildWaterSystem(){
            if(!basementIsBuilt){
                System.out.println("Missing basement, build it first!");
                return null;
            }else if(!wallsAreBuilt){
                System.out.println("Basement is built but walls are missing, build them first!");
                return null;
            }else if(!roofIsBuilt) {
                System.out.println("Basement and walls are built,roof is missing, build it first!");
                return null;
            }else if(!windowsAndDoorsAreSet){
                System.out.println("Without doors and windows cold can break your water system, build it first!");
                return null;
            }else {
                this.waterSystemIsBuilt=true;
                return this;
            }

        }

        public HouseBuilder buildHeatingSystem(){
            if(!basementIsBuilt){
                System.out.println("Missing basement, build it first!");
                return null;
            }else if(!wallsAreBuilt){
                System.out.println("Basement is built but walls are missing, build them first!");
                return null;
            }else if(!roofIsBuilt) {
                System.out.println("Basement and walls are built,roof is missing, build it first!");
                return null;
            }else if(!windowsAndDoorsAreSet){
                System.out.println("Without doors and windows cold can break your water system, build it first!");
                return null;
            }else if(!waterSystemIsBuilt) {
                System.out.println("Dont build heating system before water system, build water system first!");
                return null;
            }else {
                this.heatingSystemIsBuilt=true;
                return this;
            }

        }

        public HouseBuilder decorateInterior(){
            if(!basementIsBuilt){
                System.out.println("Missing basement, build it first!");
                return null;
            }else if(!wallsAreBuilt){
                System.out.println("Basement is built but walls are missing, build them first!");
                return null;
            }else if(!roofIsBuilt) {
                System.out.println("Basement and walls are built,roof is missing, build it first!");
                return null;
            }else if(!windowsAndDoorsAreSet){
                System.out.println("Without doors and windows cold can break your water system, build it first!");
                return null;
            }else if(!waterSystemIsBuilt) {
                System.out.println("Dont build heating system before water system, build water system first!");
                return null;
            }else if (!heatingSystemIsBuilt){
                System.out.println("Without heating system the moist can ruin your interior design, build it first!");
                return null;
            }else{
                this.interiorIsDecorated=true;
                return this;
            }
        }

        public House handOverHouse(){
            return new House(this);
        }
    }

    private House (HouseBuilder builder){
        this.basementSquaremeters=builder.basementSquaremeters;
        this.numberOfFloors=builder.numberOfFloors;
        this.buildingMaterial=builder.buildingMaterial;
        this.heatingSystem=builder.heatingSystem;
        this.basementIsBuilt=builder.basementIsBuilt;
        this.wallsAreBuilt=builder.wallsAreBuilt;
        this.roofIsBuilt=builder.roofIsBuilt;
        this.windowsAndDoorsAreSet=builder.windowsAndDoorsAreSet;
        this.waterSystemIsBuilt=builder.waterSystemIsBuilt;
        this.heatingSystemIsBuilt=builder.heatingSystemIsBuilt;
        this.interiorIsDecorated=builder.interiorIsDecorated;
    }


}

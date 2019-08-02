package design_pattern.AnnelisHomework.SamplesOfCreationalPattern.BuilderExample;

public class HouseBuilderDemo {
    public static void main(String[] args) {

        House halfDonehouse=new House.HouseBuilder(60,
                2,
                BuildingMaterial.WOOD,
                HeatingSystem.GROUND_HEATING)
                .buildBasement()
                .buildWalls()
                .buildRoof()
                .handOverHouse();
        System.out.println(halfDonehouse);

        House readyHouse=new House.HouseBuilder(88,
                3,
                BuildingMaterial.BRICK,
                HeatingSystem.CENTRAL_HEATING)
                .buildBasement()
                .buildWalls()
                .buildRoof()
                .setWindowsAndDoors()
                .buildWaterSystem()
                .buildHeatingSystem()
                .decorateInterior()
                .handOverHouse();

        System.out.println(readyHouse);

        try {
            House wronglyBuiltHouse=new House.HouseBuilder(33,4,BuildingMaterial.STRAW,HeatingSystem.STOVE_HEATING)
                    .buildRoof()
                    .buildHeatingSystem()
                    .buildWalls()
                    .handOverHouse();
        } catch (NullPointerException e) {
            System.out.println("Something went very wrong by building, house not existing!");
        }

    }
}

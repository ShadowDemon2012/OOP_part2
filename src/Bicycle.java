public class Bicycle extends VehicleType {

    public void updateTyre() {
        System.out.print(" Меняем покрышку ");
    }

    public Bicycle(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

}

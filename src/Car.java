public class Car extends VehicleType {

    public void updateTyre() {
        System.out.print("Меняем покрышку ");
    }

    public void checkEngine() {
        System.out.println("Проверяем двигатель");
    }

    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

}
public class Truck extends VehicleWithEngine {
    public Truck(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    public void checkTrailer() {
        System.out.println("Проверяем прицеп");
    }

    @Override
    public void service(Vehicle vehicle) {
        super.service(vehicle);
        this.checkTrailer();
    }
}

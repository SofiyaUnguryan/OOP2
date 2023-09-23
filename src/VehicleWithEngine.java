public abstract class VehicleWithEngine extends Vehicle{

    public void checkEngine() {
        System.out.println("Проверяем двигатель");
    }

    public VehicleWithEngine(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public void service(Vehicle vehicle) {
        super.service(vehicle);
        this.checkEngine();
    }
}

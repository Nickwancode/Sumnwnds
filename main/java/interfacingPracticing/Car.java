package interfacingPracticing;

public class Car implements Vehicle {
    @Override
    public void startVehicle() {
        System.out.println("starting car");

    }

    @Override
    public void stopVehicle() {
        System.out.println("Stoping car");

    }
}

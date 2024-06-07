package interfacingPracticing;

public interface Vehicle {
    void startVehicle ();
    void stopVehicle();



    default  void printMilesPerHour(){
        System.out.println("This vehicle goes 100 miles per hour");
    }

    static void startEngine(Vehicle vehicle){

        vehicle.startVehicle();


    }



}

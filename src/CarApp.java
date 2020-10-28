public class CarApp {
  
  public static void main(String[] args) {
    
    Car blueCar = Car.getCar();
    Car redCar  = Car.getCar();
    
    // The Car class have only one single instance. We use only that instance whenever we are in need.
    // Check if the instances are the same.
    if (blueCar == redCar) {
      System.out.println("blueCar and redCar are SAME instance.");
    }
    
    // Compile Time Error: The constructor Car() is not visible
    // Car redCar = new Car();
    
  }
  
}

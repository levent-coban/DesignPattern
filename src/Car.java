public class Car {
  
  // For prevent to creation of the singleton instance until the getCar() method call,
  // here use Lazy initialization. Otherwise, an object of the singleton class will always be instantiated.
  // Create an instance (object) of Car
  private static Car _car;
  
  // to prevent the use of "new", make the constructor private
  private Car() {}
  
  // This nested class will be referenced after getCar() is called
  private static class SingletonHelper {
      // instantiation of utility class Car
      private static final Car _car = new Car();
  }
  
  public static Car getCar() {
      if (_car == null) {
          _car = SingletonHelper._car;
          System.out.println("New Car instance created.");
      } else {
          System.out.println("You already have a Car instance.");
      }
      return _car;
  }
  
  
}

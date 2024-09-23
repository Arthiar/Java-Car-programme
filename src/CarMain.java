import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CarMain {
    private static final Logger logger = Logger.getLogger(CarMain.class.getName());

    public static void main(String[] args) {
        try {
            // Create an array of Car objects
            Car[] cars = new Car[3];
            cars[0] = new Car(1, "Toyota", "Corolla", 2010, "Red", 5000, "XYZ123");
            cars[1] = new Car(2, "Honda", "Civic", 2012, "Blue", 7000, "ABC456");
            cars[2] = new Car(3, "Ford", "Focus", 2015, "White", 10000, "DEF789");

            // Save cars by year and pric
            CarFileSever.saveCarsByYearAndPrice(cars, 2015, 8000, "expensive_2015_cars.txt");

        } catch (IOException e) {
            logger.log(Level.SEVERE, "An IO exception occurred", e);
        }
    }
}

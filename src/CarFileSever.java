import java.io.FileWriter;
import java.io.IOException;

public class CarFileSever {

    public static void saveCarsByYearAndPrice(Car[] cars, int year, double price, String fileName) throws IOException {
        FileWriter writer = new FileWriter(fileName);  // This writes to the file
        for (Car car : cars) {
            if (car.getYear() == year && car.getPrice() > price) {
                writer.write(car.toString() + "\n");
                System.out.println(car);  // This will print the car to the console
            }
        }
        writer.close();  // Make sure to close the file
        System.out.println("Cars from year " + year + " with price higher than " + price + " have been saved to " + fileName);
    }
}

package patterns.creational.builder;
import java.util.*;
public class   Main {

    public static void main(String... args)
    {
        Car.CarBuilder builder = new Car.CarBuilder();

        Car car1 = builder.setEngine("V8")
                .setColor("Red")
                .setSunroof(true)
                .build();

        System.out.println(car1);

        Car car2 = builder.setEngine("V9")
                .setColor("Black")
                .setSeats(10)
                .setWheels(4)
                .setSunroof(true)
                .setNavigationSystem(true)
                .build();

        System.out.println(car2);
    }
}

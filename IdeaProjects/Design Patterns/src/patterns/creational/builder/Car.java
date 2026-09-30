package patterns.creational.builder;

public class Car {

    private String engine;
    private int wheels;
    private int seats;
    private String color;
    private boolean sunroof;
    private boolean navigationSystem;

    private Car(CarBuilder builder) {
        this.engine = builder.engine;
        this.wheels = builder.wheels;
        this.seats = builder.seats;
        this.color = builder.color;
        this.sunroof = builder.sunroof;
        this.navigationSystem = builder.navigationSystem;
    }

    public String getEngine() {
        return engine;
    }

    public int getWheels() {
        return wheels;
    }

    public int seats() {
        return seats;
    }

    public String getColor() {
        return color;
    }

    public boolean getSunroof() {
        return sunroof;
    }

    public boolean navigationSystem() {
        return navigationSystem;
    }

    class CarBuilder {

        String engine;
        //Default values
        int wheels = 4;
        int seats = 5;
        String color = "Black";
        boolean sunroof = false;
        boolean navigationSystem = false;

        public CarBuilder setEngine(String engine) {
            this.engine = engine;
            return this;
        }

        public CarBuilder setWheels(int wheels) {
            this.wheels = wheels;
            return this;
        }

        public CarBuilder setSeats(int seats) {
            this.seats = seats;
            return this;
        }

        public CarBuilder setColor(String color) {
            this.color = color;
            return this;
        }

        public CarBuilder setRunroof(boolean sunroof) {
            this.sunroof = sunroof;
            return this;
        }

        public CarBuilder setNavigationSystem(boolean navigationSystem) {
            this.navigationSystem = navigationSystem;
            return this;
        }

        public Car build() {
            return new Car(this);
        }

    }
}

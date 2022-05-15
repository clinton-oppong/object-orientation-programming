/**
 *
 **/

public class Car {

    private int door;
    private int wheels;
    private String model;
    private String engine;
    private String color;

    public int getDoor() { // to create setters and getters you need to " -> Code -> Generate -> select options
        return door;
    }

    public void setDoor(int door) {
        this.door = door;
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setModel(String model) { //setter
        String validModel = model.toLowerCase();
        if (validModel.equals("semantic") || validModel.equals("open-top")) {
            this.model = model;
        } else {
            this.model = "Unknown";
        }

    }

    public String getModel() { //getter
        return this.model;
    }
}
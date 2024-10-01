
public abstract class Plant implements PlantInterface {

    // Encapsulation - These variables cannot be directly accessed or modified from outside the class
    private final String name;
    private final double height;

    public Plant(String name, double height) {
        this.name = name;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public double getHeight() {
        return height;
    }
} //test

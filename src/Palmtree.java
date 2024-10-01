// Inherits from Plant
public class Palmtree extends Plant {

    private final FluidType fluidType = FluidType.TAPWATER;

    public Palmtree(String name, double height) {
        super(name, height);
    }

    // Polymorphism
    @Override
    public double calculateFluidAmount() {
        double dosage = 0.5;
        return dosage * getHeight();
    }

    // Polymorphism
    @Override
    public String printPlant() {
        return getName() + " needs " + calculateFluidAmount() + "l of " + fluidType;
    }
}

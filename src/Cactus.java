// Inherits from Plant
public class Cactus extends Plant {

    private final FluidType fluidType = FluidType.MINERALWATER;

    public Cactus(String name, double height) {
        super(name, height);
    }

    // Polymorphism
    @Override
    public double calculateFluidAmount() {
        return 0.02;
    }

    // Polymorphism
    @Override
    public String printPlant() {
        return getName() + " needs " + calculateFluidAmount() + "l of " + fluidType;
    }
}

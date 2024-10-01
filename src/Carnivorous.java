// Inherits from Plant
public class Carnivorous extends Plant {

    private final FluidType fluidType = FluidType.PROTEINDRINK;

    public Carnivorous(String name, double height) {
        super(name, height);
    }

    // Polymorphism
    @Override
    public double calculateFluidAmount() {
        double dosage1 = 0.2;
        double dosage2 = 0.1;
        return dosage2 + (dosage1 * getHeight());
    }
    // Polymorphism
    @Override
    public String printPlant() {
        return getName() + " needs " + calculateFluidAmount() + "l of " + fluidType;
    }
}

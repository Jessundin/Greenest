import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public Main() {

            Plant igge = new Cactus("Igge", 0.2);
            Plant laura = new Palmtree("Laura", 5);
            Plant meatloaf = new Carnivorous("Meatloaf", 0.7);
            Plant olof = new Palmtree("Olof", 1);

            ArrayList<Plant> plants = new ArrayList<>();
            plants.add(igge);
            plants.add(laura);
            plants.add(meatloaf);
            plants.add(olof);

            Scanner scanner = new Scanner(System.in);

            while (true) {
                System.out.print("Enter plant name (or 'exit' to quit): ");
                String input = scanner.nextLine().toLowerCase();

                if (input.equals("exit")) {
                    System.out.println("Exiting...");
                    break;
                }

                boolean found = false;

                for (Plant plant : plants) {
                    if (plant.getName().equalsIgnoreCase(input)) {
                        System.out.println(plant.printPlant() + "\n");
                        found = true;
                        break;
                    }
                }
                if (!found) {
                    System.out.println("Plant " + input + " not found, try again... \n");
                }
            }
            scanner.close();
        }

    public static void main (String[]args){
        new Main();
    }
}

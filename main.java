import java.util.Scanner;
import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        // Initialize Scanner for user input
        Scanner scanner = new Scanner(System.in);

        // Create ZooKeeper
        ZooKeeper keeper = new ZooKeeper("John Doe", "john@gmail.com", "000-000-0000", 35, "2200 W Sequoia Ave", 001);
        keeper.login();
        System.out.println(keeper);
        keeper.manageAnimal();

        // Create Animal List
        ArrayList<Animal> animalList = new ArrayList<>();
        animalList.add(new Animal(1, "Lion", 5));
        animalList.add(new Animal(2, "Zebra", 3));
        animalList.add(new Animal(3, "Elephant", 10));
        animalList.add(new Animal(4, "Giraffe", 7));

        // Main program loop
        while (true) {
            // Display menu options
            System.out.println("Choose an action:");
            System.out.println("1. View all animals");
            System.out.println("2. View an animal's feeding schedule");
            System.out.println("3. View an animal's medication schedule");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            // Handle user input
            int choice;
            try {
                choice = scanner.nextInt();
            } catch (Exception e) {
                System.out.println("Invalid input! Please enter a number between 1 and 4.");
                scanner.next(); // Clear invalid input
                continue;
            }

            switch (choice) {
                case 1: // View all animals
                    System.out.println("\nAnimal List:");
                    for (Animal animal : animalList) {
                        System.out.println(animal);
                    }
                    break;

                case 2: // View feeding schedule
                    System.out.print("Enter Animal ID to view feeding schedule: ");
                    int feedingId = scanner.nextInt();
                    boolean foundFeeding = false;
                    for (Animal animal : animalList) {
                        if (animal.getAnimalId() == feedingId) {
                            System.out.println(animal.getFeedingSchedule().getDailyFeedingSchedule());
                            foundFeeding = true;
                        }
                    }
                    if (!foundFeeding) {
                        System.out.println("Animal ID not found!");
                    }
                    break;

                case 3: // View medication schedule
                    System.out.print("Enter Animal ID to view medication schedule: ");
                    int medicationId = scanner.nextInt();
                    boolean foundMedication = false;
                    for (Animal animal : animalList) {
                        if (animal.getAnimalId() == medicationId) {
                            System.out.println(animal.getMedicationSchedule().getMedicationSchedule());
                            foundMedication = true;
                        }
                    }
                    if (!foundMedication) {
                        System.out.println("Animal ID not found!");
                    }
                    break;

                case 4: // Exit the program
                    System.out.println("Exiting program... Goodbye!");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice! Please select a valid option.");
            }
        }
    }
}

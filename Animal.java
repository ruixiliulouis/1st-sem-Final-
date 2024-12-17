public class Animal {
    private int animalId;  // Animal ID
    private String species; // Species of the animal
    private int age;        // Age of the animal

    // Constructor
    public Animal(int animalId, String species, int age) {
        this.animalId = animalId;
        this.species = species;
        this.age = age;
    }

    // Getter for Animal ID
    public int getAnimalId() {
        return animalId;
    }

    // Getter for Feeding Schedule
    public FeedingSchedule getFeedingSchedule() {
        return new FeedingSchedule(animalId, "Grass", 5.0);
    }

    // Getter for Medication Schedule
    public MedicationSchedule getMedicationSchedule() {
        return new MedicationSchedule(animalId, species, "Vitamin C", 10.0);
    }

    // toString() method for displaying animal details
    @Override
    public String toString() {
        return "Animal [ID: " + animalId + ", Species: " + species + ", Age: " + age + "]";
    }
}


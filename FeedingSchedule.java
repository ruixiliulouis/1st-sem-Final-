public class FeedingSchedule {
    private int animalId;  // Animal ID
    private String foodType; // Type of food
    private double quantity; // Quantity of food

    // Constructor
    public FeedingSchedule(int animalId, String foodType, double quantity) {
        this.animalId = animalId;
        this.foodType = foodType;
        this.quantity = quantity;
    }

    // Method to get the feeding schedule
    public String getDailyFeedingSchedule() {
        return "AnimalID " + animalId + " should be fed " + quantity + " kg of " + foodType + ".";
    }

    @Override
    public String toString() {
        return "FeedingScheduleAnimalID" + animalId + ", Food Type:" + foodType + ", Quantity:" + quantity + "kg";
    }
}

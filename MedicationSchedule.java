public class MedicationSchedule {
    private int animalId;
    private String species;
    private String medicine;
    private double dosage;

    public MedicationSchedule(int animalId, String species, String medicine, double dosage) {
        this.animalId = animalId;
        this.species = species;
        this.medicine = medicine;
        this.dosage = dosage;
    }

    public String getMedicationSchedule() {
        return "AnimalID " + animalId + " (" + species + ") should take " + dosage + " mg of " + medicine + ".";
    }

    @Override
    public String toString(){
        return "MedicationScheduleAnimalID: " + animalId + ", Species :" + species + ", Medicine: " + medicine + ", Dosage:" + dosage + "mg" ;
    }
}

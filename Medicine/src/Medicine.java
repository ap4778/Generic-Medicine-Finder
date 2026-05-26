public class Medicine {
    private final String medicineName;
    private final String genericSubstitute;
    private final String dosage;
    private final String brand;
    private final double price;
    private final String saltName;
    private final String availability;

    public Medicine(String medicineName, String genericSubstitute, String dosage, String brand, double price, String saltName, String availability) {
        this.medicineName = medicineName;
        this.genericSubstitute = genericSubstitute;
        this.dosage = dosage;
        this.brand = brand;
        this.price = price;
        this.saltName = saltName;
        this.availability = availability;
    }

    public String getMedicineName() {
        return medicineName;
    }

    public String getGenericSubstitute() {
        return genericSubstitute;
    }

    public String getDosage() {
        return dosage;
    }

    public String getBrand() {
        return brand;
    }

    public double getPrice() {
        return price;
    }

    public String getSaltName() {
        return saltName;
    }

    public String getAvailability() {
        return availability;
    }
}

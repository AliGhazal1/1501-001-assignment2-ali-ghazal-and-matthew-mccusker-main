package toys;

public class figure extends model {
    private String classification;

    public figure(String serialNumber, String name, String brand, double price, int ageAppropriate, int availableCount , String classification) {
        super(serialNumber, name, brand, price, ageAppropriate, availableCount);
        this.classification = classification;
    }

    public String getClassification() {
        return classification;
    }

    public void setClassification(String classification) {
        this.classification = classification;
    }

    @Override
    public String toString(){

        return "Serial Number: " + getSerialNumber() + "," + " Name: " + getName() + "," + " Brand: " + getBrand() + "," +
                " Price: $" + getPrice() + "," + " Age Appropriate: " + getAgeAppropriate() + "," + " Available Count: " + getAvailableCount() + ","
                + " Classification: " + getClassification();
    }

}

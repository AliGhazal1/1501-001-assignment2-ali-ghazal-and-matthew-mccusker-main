package toys;

public abstract  class model {
    private String serialNumber;
    private String name;
    private String brand;
    private double price;
    private int ageAppropriate;
    private int availableCount;

    public model(String serialNumber, String name, String brand, double price, int ageAppropriate, int availableCount){
        this.serialNumber = serialNumber;
        this.name = name;
        this.brand = brand;
        this.price = price;
        this.ageAppropriate = ageAppropriate;
        this.availableCount = availableCount;
    }


    ///////////


    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }
    ///////////////////

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    //////////////////////////

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
    ///////////////////////////

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    ///////////////////////////

    public int getAvailableCount() {
        return availableCount;
    }

    public void setAvailableCount(int availableCount) {
        this.availableCount = availableCount;
    }
    ///////////////////////////

    public int getAgeAppropriate() {
        return ageAppropriate;
    }

    public void setAgeAppropriate(int ageAppropriate) {
        this.ageAppropriate = ageAppropriate;
    }
    ///////////////////////////

    public String toString(){

        return "Serial Number: " + serialNumber + "\n" + "Name: " + name + "\n" + "Brand: " + brand + "\n" +
                "Price: $" + price + "\n" + "Age Appropriate: " + ageAppropriate + "+\n" + "Available Count: " + availableCount + "\n";
    }
}






















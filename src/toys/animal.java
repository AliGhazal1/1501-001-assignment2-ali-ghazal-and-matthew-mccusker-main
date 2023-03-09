package toys;

public class animal  extends model {

    private String material;
    private String size;


    public animal(String serialNumber, String name, String brand, double price, int ageAppropriate,int availableCount ,  String material, String size) {
        super(serialNumber, name, brand, price, ageAppropriate, availableCount);
        this.material = material;
        this.size = size;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public String toString(){

        return "Serial Number: " + getSerialNumber() + "," + " Name: " + getName() + "," + " Brand: " + getBrand() + "," +
                " Price: $" + getPrice() + "," + " Age Appropriate: " + getAgeAppropriate() + "," + " Available Count: " + getAvailableCount() + ","
                + " Material: " + getMaterial() + "," + " Size" + getSize();
    }


}

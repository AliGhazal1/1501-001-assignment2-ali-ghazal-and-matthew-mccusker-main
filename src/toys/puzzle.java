package toys;

public class puzzle extends model {

    private String puzzleType;


    public puzzle(String serialNumber, String name, String brand, double price, int ageAppropriate, int availableCount , String puzzleType) {
        super(serialNumber, name, brand, price, ageAppropriate, availableCount);
        this.puzzleType = puzzleType;
    }

    public String getPuzzleType() {
        return puzzleType;
    }

    public void setPuzzleType(String puzzleType) {
        this.puzzleType = puzzleType;
    }

    @Override
    public String toString(){

        return "Serial Number: " + getSerialNumber() + "," + " Name: " + getName() + "," + " Brand: " + getBrand() + "," +
                " Price: $" + getPrice() + "," + " Age Appropriate: " + getAgeAppropriate() + "," + " Available Count: " + getAvailableCount() + ","
                + " Type: " + getPuzzleType();
    }


}

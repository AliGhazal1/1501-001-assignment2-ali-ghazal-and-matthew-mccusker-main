package toys;

public class boardGame extends model {

    private String designer;
    private int minPlayers;
    private int maxPlayers;

    public boardGame(String serialNumber, String name, String brand, double price, int ageAppropriate, int availableCount , String designer, int minPlayers, int maxPlayers) {
        super(serialNumber, name, brand, price, ageAppropriate, availableCount);
        this.designer = designer;
        this.minPlayers = minPlayers;
        this.maxPlayers  = maxPlayers;


    }


    public String getDesigner(){

        return designer;
    }



    public void setDesigner(String designer){
        this.designer = designer;
    }



    public int getMinPlayers(){
        return minPlayers;
    }


    public void setMinPlayers(int minPlayers){
        this.minPlayers = minPlayers;
    }


    public int getMaxPlayers(){
        return maxPlayers;
    }


    public void setMaxPlayers(int maxPlayers){
        this.maxPlayers = maxPlayers;
    }





    @Override
    public String toString(){

        return "Serial Number: " + getSerialNumber() + "," + " Name: " + getName() + "," + " Brand: " + getBrand() + "," +
                " Price: $" + getPrice() + "," + " Age Appropriate: " + getAgeAppropriate() + "," + " Available Count: " + getAvailableCount() + ","
                + " Designer: " + getDesigner() + "," + " minPlayers" + getMinPlayers() + "," + "maxPlayers" + getMaxPlayers();
    }



}

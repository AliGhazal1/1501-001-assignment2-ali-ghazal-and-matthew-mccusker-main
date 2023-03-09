import java.util.Scanner;

public class view {

    Scanner keyboard;

    public  view() {
        keyboard = new Scanner(System.in);
    }

    /**
     * The purpose of this function is to display to the user the Main menu Options
     * And return a user input(Int) base of the users needs.
     * @return "option" is an int in which the user is prompted to input an option
     */
    public int displayMainMenu(){
        System.out.println("How May We Help You? \n");
        System.out.println("\t\t\t(1) Search Inventory and Purchase Toy");
        System.out.println("\t\t\t(2) Add New Toy");
        System.out.println("\t\t\t(3) Remove Toy");
        System.out.println("\t\t\t(4) Save & Exit\n");
        System.out.print("Enter Option: ");
        int option = keyboard.nextInt();
        return option;
    }


//    public String searchByType(){
//
//    return null;
//    {


    /**
     * The purpose of this function is to display to the user the Search Menu Options
     * And return a user input(Int) base of the users needs.
     * @return "option" is an int in which the user is prompted to input an option
     */
    public int SearchSubMenu(){
        System.out.println("Find Toys With: \n");
        System.out.println("\t\t\t(1) Serial Number(SN)");
        System.out.println("\t\t\t(2) Toy Name");
        System.out.println("\t\t\t(3) Type");
        System.out.println("\t\t\t(4) Back to Main Menu\n");
        System.out.print("Enter Option: ");
        int option = keyboard.nextInt();
        return option;
    }



    /**
     The purpose of this function is to display to the user the SerialNumber
     * And return a user input(Int) .
     * @return "serialNumber" is an int in which the user is prompted to input a serial number
     */
    public void serialNumber() {
        System.out.print("Enter Serial Number: ");

    }


    public void searchByName() {
        System.out.print("Enter Toy Name: ");

    }




    public int toyPrice() {
        System.out.print("Enter Toy Price: ");
        int toyPrice = keyboard.nextInt();
        return toyPrice;
    }



    public String toyBrand() {
        System.out.print("Enter Toy Brand: ");
        String toyBrand = keyboard.nextLine();
        return toyBrand;
    }





    /**
     The purpose of this function is to display to the user the SerialNumber
     * And return a user input(String) .
     * @return "toy name" is a String in which the user is prompted to input a toy name
     */
    public String toyName() {
        System.out.print("Enter Toy Name: ");
        String toyName = keyboard.nextLine();
        return toyName;
    }


    public int availableCount() {
        System.out.print("Enter Available Count: ");
        int availableCount = keyboard.nextInt();
        return availableCount;
    }


    public int appropriateAge() {
        System.out.print("Enter Appropriate Age: ");
        int appropriateAge  = keyboard.nextInt();
        return appropriateAge;
    }



    public int minNumberOfPlayers() {
        System.out.print("Enter Appropriate Age: ");
        int minNumberOfPlayer  = keyboard.nextInt();
        return minNumberOfPlayer;
    }



    public int maxNumberOfPlayers() {
        System.out.print("Enter Appropriate Age: ");
        int maxNumberOfPlayer  = keyboard.nextInt();
        return maxNumberOfPlayer;
    }



    public String designerName(){
        System.out.println("Enter Designer Name(Use ',' to separate the names if there is more than one name):  ");
        String designerName = keyboard.nextLine();
        return designerName;
    }

    public void WelcomeMenu(){
        System.out.println("*****************************************");
        System.out.println("*     WELCOME TO THE TOY COMPANY        *");
        System.out.println("*****************************************");
    }





}

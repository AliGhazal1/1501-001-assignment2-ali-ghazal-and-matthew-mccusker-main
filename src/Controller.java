import toys.figure;
import toys.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;


public class Controller {

    private final String File_PATH = "res/toys.txt";
    ArrayList<model> toyList;
    view menu = new view();
    Scanner keyboard = new Scanner(System.in);


    public Controller() throws FileNotFoundException {
        //When an instance of this class is made  it will automatically read data and store in
        //toyList ArrayList
        this.toyList = new ArrayList<>();
        this.fileStorageInArrayList();
        runApp();

    }

public void runApp() throws FileNotFoundException {
        boolean flag  = true;
        int optionResult;
        menu.WelcomeMenu();


        while (flag){
            optionResult = menu.displayMainMenu();
            //display the main menu to users

            switch(optionResult){
                case 1:
                    //search inventory and purchase toy
                    searchToFindToys();
                    break;
                case 2:
                    //add new toy


                    break;


                case 3:
                    //remove toy
                    menu.serialNumber();
                    String serial = keyboard.nextLine();
                    System.out.println(toyList.get(0));
                    removeToy(serial);
                    System.out.println(toyList.get(0));
                    break;


                case 4:
                    saveFileOnExit();
                    flag = false;
                    break;



                default:
                    System.out.println("The input you entered caused an error...Please try again");
                    break;

            }
        }
}

    /**
     * The purpose of this function is to search for all toys with a name that matches the given name the user inputted
     * @param name the name to search for
     * @return  ArrayList of all toys with a similar name
     */




    /**
     * The purpose of this function is to search through the toyList Array list to find the matching serial number located at   index 0.
     * Once found it removes it from the toyList
     * @param serialNumber
     */
    public void removeToy(String serialNumber) {
        for (int i = 0; i < this.toyList.size(); i++) {
            model toy = this.toyList.get(i);

            if (toy.getSerialNumber().equals(serialNumber)) {
                this.toyList.remove(i);
                break;
            }
        }
    }



    /**
     * The purpose of this function is to read the toy information from the file at the path specified in File_PATH
     * and stores the information as an ArrayList of model objects.
     *
     * I got to   edit this description^^^
     * @throws FileNotFoundException
     */
    public void fileStorageInArrayList() throws FileNotFoundException{

        File toyFile = new File(File_PATH);
        if (toyFile.exists()) {

            Scanner inputToyFile = new Scanner(toyFile);
            while (inputToyFile.hasNext()) {
                String line = inputToyFile.nextLine();
                String[] toysSplit = line.split(";");
                String serialNumber = toysSplit[0];
                String toyName = toysSplit[1];
                String toyBrand = toysSplit[2];
                double toyPrice = Double.parseDouble(toysSplit[3]);
                int toyAgeAppropriate = Integer.parseInt(toysSplit[4]);
                int toyAvailableCount = Integer.parseInt(toysSplit[5]);


                //first Digit of Serial Number
                //Reference https://stackoverflow.com/questions/2967898/retrieving-the-first-digit-of-a-number
                Character firstDigitOfSerial = serialNumber.charAt(0);
                switch (firstDigitOfSerial) {
                    case '0':
                    case '1':
                        String classification = toysSplit[6];
                        model figureBeingMade = new figure(serialNumber, toyName, toyBrand, toyPrice, toyAgeAppropriate, toyAvailableCount, classification);
                        toyList.add(figureBeingMade);
                        break;
                    case '2':
                    case '3':
                        String material = toysSplit[6];
                        String size = toysSplit[7];
                        model animalBeingMade = new animal(serialNumber, toyName, toyBrand, toyPrice, toyAgeAppropriate, toyAvailableCount, material, size);
                        toyList.add(animalBeingMade);
                        break;
                    case '4':
                    case '5':
                    case '6':
                        String puzzleType = toysSplit[6];
                        model puzzleBeingMade = new puzzle(serialNumber, toyName, toyBrand, toyPrice, toyAgeAppropriate, toyAvailableCount, puzzleType);
                        toyList.add(puzzleBeingMade);
                        break;
                    case '7':
                    case '8':
                    case '9':
                        String designer = toysSplit[6];
                        String range[] = toysSplit[6].split("-");
                        int minPlayers = Integer.parseInt(range[0]);
                        int maxPlayers = Integer.parseInt(range[1]);
                        model boardGameBeingMade = new boardGame(serialNumber, toyName, toyBrand, toyPrice, toyAgeAppropriate, toyAvailableCount, designer, minPlayers, maxPlayers);
                        toyList.add(boardGameBeingMade);
                        break;
                    default:
                        System.out.println("Error");

                }
            }
        }
    }


    /**
     * The purpose of this function is to save the contents of the modified ArrayList and overwrite
     * the current toys.txt file with the new information with the new Arraylist.
     * @throws FileNotFoundException
     */
    public void saveFileOnExit() throws FileNotFoundException {

        File file = new File(File_PATH);
        PrintWriter writer = new PrintWriter(file);

        //for every toyObject in  toyList, write onto the text file.
        //Since I used PrintWriter it will overwrite the entire file with the current
        //contents in the toyList Array list.
        for (int i = 0; i < toyList.size(); i++)
        {
            model toy = toyList.get(i);
            String line = toy.getSerialNumber() + ";" + toy.getName() + ";" + toy.getBrand() + ";" + toy.getPrice() + ";" +
                    toy.getAgeAppropriate() + ";" + toy.getAvailableCount();
            writer.println(line);
        }
        writer.close();
    }



    public ArrayList<model> searchBySerialNumber(String serialNumber ){
        ArrayList<model> result = new ArrayList<>();
        for (int i = 0; i < this.toyList.size(); i++) {
            model toy = this.toyList.get(i);
            if (toy.getSerialNumber().equals(serialNumber)) {
                result.add(toy);
            }
        }
        return result;
    }

    public ArrayList<model> searchByName(String name){
        ArrayList<model> result = new ArrayList<>();
        for (int i = 0; i < this.toyList.size(); i++) {
            model toy = this.toyList.get(i);
            if (toy.getName().equalsIgnoreCase(name)) {
                result.add(toy);
            }
        }
        return result;
    }



    public void searchByType(String type) {
        for (int i = 0; i < this.toyList.size(); i++) {
            model toy = this.toyList.get(i);
            if (type.equals("figure") && toy instanceof figure){
                System.out.println(toy);
            }
            else if (type.equals("animal") && toy instanceof animal){
                System.out.println(toy);
            }
            else if (type.equals("puzzle") && toy instanceof puzzle){
                System.out.println(toy);
            }
            else if (type.equals("board game") && toy instanceof boardGame){
                System.out.println(toy);
            }
        }
    }
    /**
     * The purpose of this function is to resolve the customers search from the main menu
     * to find the item they are looking for through 3 switch cases.
     * #1 By toy serial number
     * #2 By toy name
     * #3 by toy type
     */
    public void searchToFindToys() throws FileNotFoundException{

        int option = menu.SearchSubMenu();

        switch (option){

            case 1:
                //find by serial number
                System.out.println("Enter Serial Number: ");
                String serialNumber = keyboard.nextLine();
                System.out.println(searchBySerialNumber(serialNumber));


                break;


            case 2:
                //find by toy name
                menu.searchByName();
                String toyName = keyboard.nextLine();
                System.out.println(searchByName(toyName));


            case 3:
                //find by type
                System.out.println("Please enter toy type: ");
                String toyType = keyboard.nextLine();
                searchByType(toyType);
                break;


            case 4:
                runApp();
                break;

            default:
                System.out.println("The input you entered caused an error...Please try again");
                break;


        }
    }
}

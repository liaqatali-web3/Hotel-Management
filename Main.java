
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


class Product
{
        public String name;
        public int totalPrice;

        Product(String name, int totalPrice){
            this.name = name;
            this.totalPrice = totalPrice;

        }
}

class Room
{
    String roomType;

    public Room(String roomType, int roomPrice) {
        this.roomType = roomType;
        this.roomPrice = roomPrice;
    }

    int roomPrice;
    int spaPrice;
    int breakfastPrice;
    int dinnerPrice;
    int viewPrice;





}
public class Main {







    public static void main(String[] args) throws IOException {

        String currency = "AED";
        Product[] arrayBeef = {
                new Product("Stew",30),
                new Product("Steak",20)
        };

        Product[] arrayLamb = {
                new Product("Ribs",30),
                new Product("Shank",35)
        };
        Product[] arraySalad = {
                new Product("Green Salad",10),
                new Product("Caesar Salad",15)
        };


        List<Product> arrayTotal = new ArrayList<>();
        Room roomBooking = new Room("",0);



        boolean showDialog = true;

        while(showDialog){

            int userInput = 0;
            clearConsole();
            System.out.println("_______ Hotel Management____________");
            System.out.println("Please select any of given option");
            System.out.println("1. Room Reservation");
            System.out.println("2. Order Food");

            Scanner in = new Scanner(System.in);
            int s = in.nextInt();
            if(s == 1)
            {
                boolean optionMenuRoomService = true;
                while(optionMenuRoomService){
                    clearConsole();
                    System.out.println("1. Normal Room - 1 Night 250 "+ currency);
                    System.out.println("2. Queen Room  - 1 Night 650 " + currency);
                    System.out.println("3. Back " + currency);
                    String errorShow = "";

                    Room selectedRoom = new Room("",0);

                    int roomOption = in.nextInt();
                    if(roomOption == 1)
                    {

                        boolean optionMenuForServices = true;
                        while (optionMenuForServices){
                            clearConsole();
                            selectedRoom.roomType = "Normal Room";
                            selectedRoom.roomPrice = 250;
                            System.out.println("Normal Room - 1 Night for 250 " + currency);
                            System.out.println("Free Wifi");
                            System.out.println("Need Additional Services?");
                            System.out.println("Select from below");
                            System.out.println("1. Spa 300 "+ currency);
                            System.out.println("2. Breakfast 110 "+ currency);
                            System.out.println("3. Dinner 110 "+ currency);
                            System.out.println("4. View Extra Charge 100 "+ currency);
                            System.out.println("5. Cancel & Go Back");
                            System.out.println("6. Accept Room & Services (Selected by you)");



                            if(errorShow.length() > 0){
                                System.out.println(errorShow);
                                errorShow = "";
                            }

                            if(selectedRoom.roomPrice > 0)
                            {
                                System.out.println(" ");
                                System.out.println("____________________________________");
                                System.out.println("Services Selected");
                                System.out.println(selectedRoom.roomType + " - " + selectedRoom.roomPrice+" "+currency);
                                if(selectedRoom.spaPrice > 0){
                                    System.out.println("Spa" + " - " + selectedRoom.spaPrice+" "+currency);
                                }
                                if(selectedRoom.breakfastPrice>0){
                                    System.out.println("Breakfast" + " - " + selectedRoom.breakfastPrice+" "+currency);
                                }
                                if(selectedRoom.dinnerPrice>0){
                                    System.out.println("Dinner" + " - " + selectedRoom.dinnerPrice+" "+currency);
                                }
                                if(selectedRoom.viewPrice>0){
                                    System.out.println("View" + " - " + selectedRoom.viewPrice+" "+currency);
                                }

                                System.out.println("________________________________");
                                System.out.println("");

                            }
                            System.out.println("Select an option from above list");
                            int additionalServicesSelect = in.nextInt();
                            if(additionalServicesSelect == 1){
                                selectedRoom .spaPrice = 300;

                            }else if(additionalServicesSelect == 2){
                                selectedRoom .breakfastPrice = 110;
                            }else if(additionalServicesSelect == 3){
                                selectedRoom .dinnerPrice = 110;
                            }else if(additionalServicesSelect == 4){
                                selectedRoom .viewPrice = 100;
                            }else if(additionalServicesSelect == 5){
                                optionMenuForServices = false;
                            }else if(additionalServicesSelect == 6){
                                displayTotalForRoom(selectedRoom);

                                while(true){
                                    System.out.println(" ");
                                    System.out.println("Go back to Menu? 1.Yes 2.No");
                                    int optionSelectForContinue = in.nextInt();
                                    if(optionSelectForContinue == 1){
                                        optionMenuForServices = false;
                                        break;
                                    }else if(optionSelectForContinue == 2){
                                        break;
                                    }

                                }


                            }else{
                                errorShow = "Please select correct option!";
                            }
                        }






                    }
                    else if(roomOption == 2)
                    {
                        selectedRoom.roomType = "Queen Room";
                        selectedRoom.roomPrice = 650;
                        System.out.println("Queen Room - 1 Night for 650 " + currency);
                        System.out.println("Free Wifi");
                        System.out.println("Free Spa");
                        System.out.println("Free Breakfast");
                        System.out.println("Free Dinner");
                        System.out.println("Nice View");
                        System.out.println("____________________________");
                        System.out.println(" ");
                        System.out.println("1. Accept");
                        System.out.println("2. Cancel");
                        boolean queenRoomLoop = true;
                        while(queenRoomLoop){
                            int queenRoomOptionSelect = in.nextInt();

                            if(queenRoomOptionSelect == 1){
                                displayTotalForRoom(selectedRoom);
                                while(true){
                                    System.out.println(" ");
                                    System.out.println("Go back to Menu? 1.Yes 2.No");
                                    int optionSelectForContinue = in.nextInt();
                                    if(optionSelectForContinue == 1){
                                        queenRoomLoop = false;
                                        break;
                                    }else if(optionSelectForContinue == 2){
                                        break;
                                    }

                                }

                            }else if(queenRoomOptionSelect == 2){
                                queenRoomLoop = false;
                            }else{

                            }
                        }

                    }
                    else if(roomOption == 3){
                        optionMenuRoomService = false;
                    }
                }



            }
            else if(s == 2)
            {
                String errorShow = "";

                while(true){
                    clearConsole();

                    System.out.println("1. Beef");
                    System.out.println("2. Lamb");
                    System.out.println("3. Salad");
                    System.out.println("4. Back");
                    System.out.println(errorShow);


                    int typeOfFood = in.nextInt();

//              Beef
                    if(typeOfFood == 1)
                    {
                        while(true){
                            clearConsole();
                            for(int i = 0;i<arrayBeef.length;i++){
                                System.out.print(i+1);
                                System.out.print("."+arrayBeef[i].name);
                                System.out.println(" - "+arrayBeef[i].totalPrice + currency);
                            }
                            System.out.println("3. Back");

                            String productAddedShow = "";




                            int beefSelected = in.nextInt();
                            if(beefSelected == 1){
                                arrayTotal.add(new Product(arrayBeef[0].name,arrayBeef[0].totalPrice));
                                productAddedShow =""+arrayBeef[0].name + "was added! ";
                            }else if(beefSelected == 2){
                                arrayTotal.add(new Product(arrayBeef[1].name,arrayBeef[1].totalPrice));
                                productAddedShow =""+arrayBeef[1].name + "was added! ";
                            }else if(beefSelected == 3){
                                break;
                            }


                            boolean continueShow = true;

                            if(productAddedShow.length() > 0){
                                System.out.println(productAddedShow);
                                productAddedShow = "";
                            }
                            System.out.println("Do you want to continue? 1:Yes  2:No");

                            while(continueShow){
                                int continueCheck = in.nextInt();
                                if(continueCheck == 2){
                                    displayTotal(arrayTotal);
                                    while(true){
                                        System.out.println(" ");
                                        System.out.println("Go back to Menu? 1.Yes 2.No");
                                        int optionSelectForContinue = in.nextInt();
                                        if(optionSelectForContinue == 1){
                                            continueShow = false;
                                            break;
                                        }else if(optionSelectForContinue == 2){
                                            break;
                                        }

                                    }

                                }else if(continueCheck == 1){
                                    continueShow = false;
                                }else{

                                }
                            }

                        }

// Lamb
                    }
                    else if(typeOfFood == 2)
                    {
                        while(true){
                            clearConsole();
                            for(int i = 0;i<arrayLamb.length;i++){
                                System.out.print(i+1);
                                System.out.print("."+arrayLamb[i].name);
                                System.out.println(" - "+arrayLamb[i].totalPrice + currency);
                            }
                            System.out.println("3. Back");

                            String productAddedShow = "";

                            int lambSelected = in.nextInt();
                            if(lambSelected == 1){
                                arrayTotal.add(new Product(arrayLamb[0].name,arrayLamb[0].totalPrice));
                            }else if(lambSelected == 2){
                                arrayTotal.add(new Product(arrayLamb[1].name,arrayLamb[1].totalPrice));
                            }else if(lambSelected == 3){
                                break;
                            }
                            boolean continueShow = true;

                            if(productAddedShow.length() > 0){
                                System.out.println(productAddedShow);
                                productAddedShow = "";
                            }
                            System.out.println("Do you want to continue? 1:Yes  2:No");

                            while(continueShow){
                                int continueCheck = in.nextInt();
                                if(continueCheck == 2){
                                    displayTotal(arrayTotal);
                                    while(true){
                                        System.out.println(" ");
                                        System.out.println("Go back to Menu? 1.Yes 2.No");
                                        int optionSelectForContinue = in.nextInt();
                                        if(optionSelectForContinue == 1){
                                            continueShow = false;
                                            break;
                                        }else if(optionSelectForContinue == 2){
                                            break;
                                        }

                                    }
                                }else if(continueCheck == 1){
                                    continueShow = false;
                                }else{

                                }
                            }
                        }
// Salad
                    }
                    else if(typeOfFood == 3)
                    {
                        while(true){
                            clearConsole();
                            for(int i = 0;i<arraySalad.length;i++){
                                System.out.print(i+1);
                                System.out.print("."+arraySalad[i].name);
                                System.out.println(" - "+arraySalad[i].totalPrice + currency);

                            }

                            System.out.println("3. Back");

                            String productAddedShow = "";


                            int saladSelected = in.nextInt();
                            if(saladSelected == 1){
                                arrayTotal.add(new Product(arraySalad[0].name,arraySalad[0].totalPrice));
                            }else if(saladSelected == 2){
                                arrayTotal.add(new Product(arraySalad[1].name,arraySalad[1].totalPrice));
                            }else if(saladSelected == 3){
                                break;
                            }

                            boolean continueShow = true;

                            if(productAddedShow.length() > 0){
                                System.out.println(productAddedShow);
                                productAddedShow = "";
                            }
                            System.out.println("Do you want to continue? 1:Yes  2:No");

                            while(continueShow){
                                int continueCheck = in.nextInt();
                                if(continueCheck == 2){
                                    displayTotal(arrayTotal);
                                    while(true){
                                        System.out.println(" ");
                                        System.out.println("Go back to Menu? 1.Yes 2.No");
                                        int optionSelectForContinue = in.nextInt();
                                        if(optionSelectForContinue == 1){
                                            continueShow = false;
                                            break;
                                        }else if(optionSelectForContinue == 2){
                                            break;
                                        }

                                    }
                                }else if(continueCheck == 1){
                                    continueShow = false;
                                }else{

                                }
                            }
                        }

                    }else if(typeOfFood == 4){
                        break;
                    }else{
                        errorShow ="Please choose correct option!";
                    }
                }

            }
            else{
                System.out.println(" Please Choose Correct Option!");
            }


        }






    }

    private static double calculateVat(int totalPrice){
        double vat  = 0.21; // 21%
        return totalPrice*vat;
    }
    private static double calculateDiscount(int totalPrice){
        double discount = 0.3; // 3%

        double calculateDiscount = totalPrice*discount;
        return totalPrice-calculateDiscount;
    }

    private static double calculateTax(int totalPrice){
        double tax = 0.5; // 5%

        double calculatedTax = totalPrice*tax;
        return totalPrice+calculatedTax;
    }


    private static void clearConsole() {
        try {
            if (System.getProperty("os.name").contains("Windows")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            }
            else {
                System.out.print("\033\143");
            }
        } catch (IOException | InterruptedException ex) {}
    }
    private static void displayTotal(List<Product> products){


        String currency = "AED";

        System.out.println(" ");
        System.out.println("____________ Total  ___________");

        for(int i = 0;i<products.size();i++){
            System.out.println("Your "+ products.get(i).name + " total is: " + products.get(i).totalPrice);
            System.out.println("Your " + products.get(i).name + " vat is: " + calculateVat(products.get(i).totalPrice));
        }

        int total = 0;
        for(int i = 0;i<products.size();i++){
            total += products.get(i).totalPrice;
            total += calculateVat(products.get(i).totalPrice);
        }
        System.out.println("__________________________");
        System.out.println("Your Total is: "+ total);
        System.out.println("Your Total With Discount Amount is: "+ calculateDiscount(total));

    }



    private static void displayTotalForRoom(Room room){
        if(room.roomType.equals("Queen Room")){
            System.out.println("You have selected Queen Room");
            System.out.println("Your Total Room Charges area: " + room.roomPrice);
            System.out.println("Your Total Room Charges With Tax: " + calculateTax(room.roomPrice));
        }else if(room.roomType.equals("Normal Room")){
            System.out.println("You have selected Normal Room");

            if(room.spaPrice > 0){
                System.out.println("Spa" + " - " + room.spaPrice+" "+" AED");
            }
            if(room.breakfastPrice>0){
                System.out.println("Breakfast" + " - " + room.breakfastPrice+" "+" AED");
            }
            if(room.dinnerPrice>0){
                System.out.println("Dinner" + " - " + room.dinnerPrice+" "+" AED");
            }
            if(room.viewPrice>0){
                System.out.println("View" + " - " + room.viewPrice+" "+" AED");
            }

            int total = room.roomPrice + room.breakfastPrice + room.dinnerPrice + room.viewPrice;

            System.out.println("Your Total Room Charges Are: "+ total);
            System.out.println("Your Total Room Charges With Tax Are: "+ calculateTax(total));
        }
    }

}

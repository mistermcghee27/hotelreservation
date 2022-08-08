import com.sun.jdi.connect.Connector;
import com.udacity.gmscholarship.api.HotelResource;
import com.udacity.gmscholarship.model.IRoom;
import com.udacity.gmscholarship.model.Reservation;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Collection;
import java.util.Date;
import java.util.Scanner;


public class MainMenu {
    private static final HotelResource hotelResource = HotelResource.getInstance();

    public static void mainMenu() {
        Scanner scanner = new Scanner(System.in);
        int choice;
        printMenu();
        choice = scanner.nextInt();
        try {
            while (choice != 5) {

                switch (choice) {
                    case 1:
                        findAndReserveRoomARoom();
                        break;
                    case 2:
                        getMyReservation();
                        break;
                    case 3:
                        createUserAccount();
                        break;
                    case 4:
                        AdminMenu.adminMenu();
                        break;
                    case 5:
                        exit();
                        break;
                    case 6:
                        if (choice > 10) {
                            System.out.println("Please choose an option between 1 - 5");
                        }
                        break;


                }
                choice = scanner.nextInt();
                printMenu();

            }
            }catch(IllegalArgumentException ex){

        }



}
    private static void findAndReserveRoomARoom() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter Check In Date mm/dd/yyyy");
        Date checkIn = getInputDate(scanner);

        System.out.println("Enter Check Out Date mm/dd/yyyy");
        Date checkOut = getInputDate(scanner);

        if (checkIn != null && checkOut != null) {
            Collection<IRoom> availableRooms = hotelResource.findARoom(checkIn, checkOut);
            printRooms(availableRooms);
        }
    }

    private static void printRooms(Collection<IRoom> rooms) {
        if (rooms.isEmpty()) {
            System.out.println("No available rooms found.");
        } else {
            rooms.forEach(System.out::println);
        }
    }

    private  static  Date getInputDate(Scanner scanner){
        try {
            String defaultDate = "mm/dd/yyyy";
            return new SimpleDateFormat(defaultDate).parse(scanner.nextLine());
        } catch (ParseException px) {
            System.out.println("Invalid date!");
            findAndReserveRoomARoom();
        }
        return null;
    }

    //get customers email address to check for reservations
    private static void getMyReservation(){
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter your email address");
            String customerEmail = scanner.nextLine();

            seeReservations(hotelResource.getCustomersReservations(customerEmail));
        } catch (Exception ex){
            System.out.println("Invalid entry");
        }
    }

    private static void seeReservations(Collection<Reservation> reservations) {
        if (reservations == null){
            System.out.println("No reservations.");
        } else {
            for (Reservation reservation: reservations) {
                System.out.println(reservation +"\n");
            }
        }
    }

    private static void createUserAccount() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Email. (ex) TobiN@email.com");
        String  userEmail = scanner.nextLine();

        System.out.println("First Name:");
        String userFirstName = scanner.nextLine();

        System.out.println("Last Name:");
        String userLastName = scanner.nextLine();

        try {
            hotelResource.createACustomer(userEmail, userFirstName, userLastName);
            System.out.println("New user account created successfully.");
        }catch (IllegalArgumentException ex) {
            System.out.println(ex.getLocalizedMessage());
            createUserAccount();
        }
    }

    public static void exit(){
                System.exit(5);
    }

    public static void printMenu() {
        System.out.println("""
                Please choose an option between 1 - 5:\s
                1.) Find and reserve a room\s
                2.) See my reservations\s
                3.) Create an account\s
                4.) Admin menu\s
                5.) Exit Application\s""");
    }



}

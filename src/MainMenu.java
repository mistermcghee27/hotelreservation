import com.udacity.gmscholarship.api.HotelResource;
import com.udacity.gmscholarship.model.IRoom;
import com.udacity.gmscholarship.service.ReservationService;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Collection;
import java.util.Date;
import java.util.Scanner;


public class MainMenu {
    private static final ReservationService reservationService = ReservationService.getInstance();
    private static final HotelResource hotelResource = HotelResource.getInstance();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        printMenu();
        choice = scanner.nextInt();
        while (choice != 5) {
            switch (choice) {
                case 1:
                    findAndReserveRoomARoom();
                case 2:
                    getMyReservation();
            }

            choice = scanner.nextInt();
            printMenu();
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
            reservationService.

        } catch (Exception ex){
            System.out.println("Invalid entry");
        }
    }

    public static void printMenu() {
        System.out.println("Please choose an option: \n"
        +       "1.) Find and reserve a room \n" +
                "2.) See my reservations \n" +
                "3.) Create an account \n" +
                "4.) Admin menu \n" +
                "5.) Exit Application");
    }

}

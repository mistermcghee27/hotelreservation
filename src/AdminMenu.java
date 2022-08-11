import com.udacity.gmscholarship.api.AdminResource;
import com.udacity.gmscholarship.api.HotelResource;
import com.udacity.gmscholarship.model.*;
import com.udacity.gmscholarship.service.CustomerService;
import com.udacity.gmscholarship.service.ReservationService;

import java.util.*;

public class AdminMenu {
    private static final ReservationService reservationService = ReservationService.getInstance();
    private static final AdminResource adminResource = AdminResource.getInstance();
    private static final CustomerService customerService = CustomerService.getInstance();
    private static final HotelResource hotelResource = HotelResource.getInstance();

    public static void adminMenu() {
        Scanner scanner = new Scanner(System.in);
        int choice;
        printAdminMenu();
        choice = scanner.nextInt();

        while (choice != 6) {
            switch (choice) {
                case 1:
                    seeAllCustomers();
                    break;
                case 2:
                    seeAllRooms();
                    break;
                case 3:
                    seeAllReservations();
                    break;
                case 4:
                    addRoomToList();
                    break;
                case 5:
                    MainMenu.mainMenu();



            }
            choice = scanner.nextInt();
            printAdminMenu();

        }
    }


    private static void seeAllCustomers() {
        Collection<Customer> customers = adminResource.getAllCustomers();
        if (customers.isEmpty()) {
            System.out.println("No customers found.");
        } else {
            adminResource.getAllCustomers().forEach(System.out::println);
        }
    }

    private static void seeAllRooms() {
        adminResource.getAllRooms();
    }

    private static void addRoomToList() {
        Scanner addRoomScanner = new Scanner(System.in);
        Scanner chooseNumberOfBeds = new Scanner(System.in);



        System.out.println("Enter new room number: ");
        String roomNumber = addRoomScanner.nextLine();

        System.out.println("Enter price per night: ");
        double roomPrice = Double.parseDouble(addRoomScanner.nextLine());

        System.out.println("Enter Number of beds: 1 for 1 bed - 2 for 2 beds");
        RoomType roomType = chooseNumberOfBeds(chooseNumberOfBeds);

        Room room = new Room(roomNumber, roomPrice, roomType);


        adminResource.addRoom(Collections.singletonList(room));
        System.out.println("New Room added successfully.");



    }

    private static RoomType chooseNumberOfBeds(Scanner bedChoiceScanner) {
        try {
            return RoomType.choiceOfBeds(bedChoiceScanner.nextLine());
        } catch (IllegalArgumentException exception) {
            System.out.println("Invalid Choice, Please choose 1 for one bed or 2 for two beds: ");
            return chooseNumberOfBeds(bedChoiceScanner);
        }
    }

    private static void seeAllReservations() {
        Collection<Reservation> reservationService = adminResource.displayAllReservations();
        if (reservationService.isEmpty()){
            AdminMenu.adminMenu();
        }
    }







    public static void printAdminMenu(){
            System.out.println("""
                Please choose an option:\s
                1.) See all Customers\s
                2.) See all Rooms\s
                3.) See all Reservations\s
                4.) Add a Room\s
                5.) Back to Main Menu\s""");
        }
    }
import java.util.Scanner;

public class AdminMenu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        printAdminMenu();
        choice = scanner.nextInt();
        while (choice != 5) {
            switch (choice) {
                case 1:
                    ;
                case 2:
                    ;
                case 3:
                    ;
                case 4:
                    ;
                case 5:
                    ;
            }

            choice = scanner.nextInt();
            printAdminMenu();
        }
    }

    public static void printAdminMenu(){
            System.out.println("""
                Please choose an option:\s
                1.) See all Customers\s
                2.) See all Rooms\s
                3.) See all Reservations\s
                4.) Add a Room\s
                5.) Back to Main Menu""");
        }
    }
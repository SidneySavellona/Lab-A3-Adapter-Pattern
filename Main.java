import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Laptop laptopDevice = new Laptop();
        PowerOutlet laptopOutlet = new LaptopAdapter(laptopDevice);

        Refrigerator fridgeDevice = new Refrigerator();
        PowerOutlet fridgeOutlet = new RefrigeratorAdapter(fridgeDevice);

        SmartphoneCharger phoneCharger = new SmartphoneCharger();
        PowerOutlet phoneOutlet = new SmartphoneAdapter(phoneCharger);

        while (true) {

            System.out.println();
            displayMenu(); 
            int option = scanner.nextInt();
            System.out.println();

            handleSelection(option, laptopOutlet, fridgeOutlet, phoneOutlet, scanner);
        }
    }

    private static void displayMenu() {
        System.out.println("Power Outlet App");
        System.out.println("1. Laptop");
        System.out.println("2. Refrigerator");
        System.out.println("3. Smartphone");
        System.out.println("4. Exit");
        System.out.print("Select an option: ");
    }

    private static void handleSelection(int option, PowerOutlet laptopOutlet, PowerOutlet fridgeOutlet, PowerOutlet phoneOutlet, Scanner scanner) {
        switch (option) {
            case 1:
                System.out.println(laptopOutlet.plugIn());
                break;

            case 2:
                System.out.println(fridgeOutlet.plugIn());
                break;

            case 3:
                System.out.println(phoneOutlet.plugIn());
                break;

            case 4:
                exitApp(scanner);  
                break;

            default:
                System.out.println("Invalid option. Please select a valid choice.");
        }
    }

    private static void exitApp(Scanner scanner) {
        System.out.println("App is shutting down...");
        scanner.close();
        System.exit(0);
    }
}

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        String day;
        //receives user input and determine which day of the week base on the user's input
        System.out.println("Enter Days of the week in English: ");
        day = src.nextLine();

        switch (day){
            case "Sunday":
                System.out.println("Korsida");
                break;

            case "Monday":
                System.out.println("Dzoda");
                break;

            case "Tuesday":
                System.out.println("Blada");
                break;

            case "Wednesday":
                System.out.println("Kuda");
                break;

            case "Thursday":
                System.out.println("Yawoda");
                break;

            case "Friday":
                System.out.println("Fida");
                break;

            case "Saturday":
                System.out.println("Mimleda");
                break;

            default:
                System.out.println("Ooops!!");
                break;
        }

    }
}
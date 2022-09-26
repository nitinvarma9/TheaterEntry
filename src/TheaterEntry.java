import java.util.*;
public class TheaterEntry {
    public static void main(String[] args) {

        System.out.println("\nWelcome to the theater, Kiosk Entry Here !");
        Scanner AgeInput = new Scanner(System.in);
        int UserAge;
        while ((UserAge = AgeInput.nextInt()) > 0) {
            System.out.print("Please Enter your age: ");
            if (UserAge >= 21)
                System.out.println("\nYou got a wrist band!");
        }

    }
}
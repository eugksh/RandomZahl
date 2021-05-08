import java.util.Random;
import java.util.Scanner;

public class SimpleApp {
    public static void main(String[] args) {
        int min = 0;
        int max = 100;
        int diff = max - min;
        Random random = new Random();
        int i = random.nextInt(diff + 1);
        i += min;

        Scanner user_input = new Scanner(System.in);

        while (true) {
            System.out.println("Geb eine Zahl von 0 bis 100 ein: ");
            int user_zahl = user_input.nextInt();

            if (user_zahl > 100 || user_zahl < 0) {
                System.out.println("Geb eine neue Zahl ein");
            } else if
            (user_zahl == i) {
                System.out.println("Richtig");
            } else {
                System.out.println("Falsh");
            }
        }
    }
}


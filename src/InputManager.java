import java.util.Scanner;

public class InputManager {
    public static String getOperation() {
        System.out.println("Podaj znak dzialania");
        Scanner scanner = new Scanner(System.in);
        String sign = scanner.nextLine();
        return sign;
    }

    public static String getNumber() {
        System.out.println("Podaj liczby do dzialania");
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        return a;
    }
}

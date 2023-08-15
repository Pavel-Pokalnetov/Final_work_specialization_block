package AppTools;

import java.util.Scanner;

public class CInput {
    static Scanner scanner = new Scanner(System.in);

    public static String read() {
        String result = scanner.nextLine();
        return result;
    }

    public static String read(String invite) {
        System.out.print(invite);
        return read();
    }

}

package util;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputHelper {

    static Scanner scan = new Scanner(System.in);

    public static int lerInt(String texto){
        while (true) {
            System.out.print(texto);
            String input = scan.nextLine();
            try {
                return Integer.parseInt(input);
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Por favor, digite um número inteiro.");
                Logger.logError("Entrada inválida de inteiro: \"" + input + "\"");
            }
        }
    }

    public static String lerString(String texto){
        System.out.print(texto);
        String txt = scan.nextLine();
        return txt;
    }


}


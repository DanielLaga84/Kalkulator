package Kalkulator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.swing.*;
import java.util.Scanner;

public class Main {

    private static final Logger STDOUT = LoggerFactory.getLogger("CONSOLE_OUT");

    private static long zmienna1;
    private static long zmienna2;
    private static Scanner wej;

    Main() {
        wej = new Scanner(System.in);
    }

    public static void main(String[] args) throws Exception {
        Main main = new Main();
        main.run();
        JFrame frame = new JFrame("Calculator v1.2");
    }

    private void run() throws Exception {
        STDOUT.info("Welcome in my Calulator v.1.1 \n");
        do {
            Operacje operacje = printMenu();
            switch (operacje) {
                case ADDITION: {
                    doDODAWANIE();
                    break;
                }
                case SUBTRACTION: {
                    doODEJMOWANIE();
                    break;
                }
                case MULTIPLICATION: {
                    doMNOZENIE();
                    break;
                }
                case DIVISION: {
                    doDZIELENIE();
                    break;
                }
                default: {
                    break;
                }

            }
        } while (true);
    }

    private void Save() {

    }

    private static void doDZIELENIE() {
        Scanner wej = new Scanner(System.in);
        STDOUT.info("First number please:  \n");
        zmienna1 = wej.nextLong();
        STDOUT.info("Second number please:  \n");
        zmienna2 = wej.nextLong();
        double sum = ((double) zmienna1) / zmienna2;

        do {
            if(zmienna2 == 0)
            try {
                STDOUT.info("Error1 do not divide by 0!!!.\n");
                return;
            } catch (NumberFormatException ex) {
                STDOUT.info("Error2 !CATCHING! do not divide by 0!!!.\n");
            return;
            }
            STDOUT.info(zmienna1 +" : "+zmienna2 +" = "+(double)sum +"\n");
        } while (zmienna2 == 0);
        }

    private static void doMNOZENIE() {
        Scanner wej = new Scanner(System.in);
        STDOUT.info("First number please:  \n");
        zmienna1 = wej.nextLong();
        STDOUT.info("Second number please:  \n");
        zmienna2 = wej.nextLong();
        long sum = zmienna1 * zmienna2;
        System.out.println(zmienna1 + " * " + zmienna2 + " = " + sum + "\n");
    }

    private static void doODEJMOWANIE() {
        Scanner wej = new Scanner(System.in);
        STDOUT.info("First number please:  \n");
        zmienna1 = wej.nextLong();
        STDOUT.info("Second number please:  \n");
        zmienna2 = wej.nextLong();
        long sum = zmienna1 - zmienna2;
        System.out.println(zmienna1 + " - " + zmienna2 + " = " + sum + "\n");
    }

    private static void doDODAWANIE() {
        Scanner wej = new Scanner(System.in);
        STDOUT.info("First number please:  \n");
        zmienna1 = wej.nextLong();
        STDOUT.info("Second number please:  \n");
        zmienna2 = wej.nextLong();
        long sum = zmienna1 + zmienna2;
        STDOUT.info(zmienna1 + " + " + zmienna2 + " = " + sum + "\n");
    }

    private static String getString(String title) {

        STDOUT.info("TO EXIT USE ANY OTHER NUMBER \n" +
                ": ");
        return wej.nextLine();
    }

    private static Operacje printMenu() {
        STDOUT.info("Please choose option: \n");
        for (int index = 0; index < Operacje.values().length; index++) {
            STDOUT.info(index + " - " + Operacje.values()[index] + "\n");
        }
        do {
            String value = getString(" ");
            int option = Integer.parseInt(value);
            if ((option >= 0) && (option < Operacje.values().length)) return Operacje.values()[option];
            if (option > 3) {
                STDOUT.info("Thank you for using my Calculator!\n");
                System.exit(0);
            }
        } while (true);
    }
}






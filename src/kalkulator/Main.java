package kalkulator;

import java.io.PrintStream;
import java.util.Scanner;


public class Main {

    private static long zmienna1;
    private static long zmienna2;
    private Scanner wej;

    Main() {
        wej = new Scanner(System.in);
    }

    public static void main(String[] args) {
        Main main = new Main();
          main.run();
        }


       private void run() {
            System.out.println("Welcome in my Calulator v.1.0.0");
            do {
                System.out.println("What would you like to do : ");
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
                        System.out.println("Thank you for using my Calculator!");
                        return;
                    }
                }
            }while (true);
    }

    private static void doDZIELENIE() {
        Scanner wej = new Scanner(System.in);
        System.out.println("Podaj pierwsza liczbę : ");
        zmienna1 = wej.nextInt();
        System.out.println("Podaj drugą liczbę : ");
        zmienna2 = wej.nextInt();
        long sum = zmienna1 / zmienna2;
        System.out.println(zmienna1 + " : " + zmienna2 +" = "+ sum );
        }

    private static void doMNOZENIE() {
        Scanner wej = new Scanner(System.in);
        System.out.println("Podaj pierwsza liczbę : ");
        zmienna1 =wej.nextInt();
        System.out.println("Podaj drugą liczbę : ");
        zmienna2 =wej.nextInt();
        long sum = zmienna1 * zmienna2;
        System.out.println(zmienna1 + " * " + zmienna2 +" = "+ sum );
    }

    private static void doODEJMOWANIE() {
        Scanner wej = new Scanner(System.in);
        System.out.println("Podaj pierwsza liczbę : ");
        zmienna1 =wej.nextInt();
        System.out.println("Podaj drugą liczbę : ");
        zmienna2 =wej.nextInt();
        long sum = zmienna1 - zmienna2;
        System.out.println(zmienna1 + " - " + zmienna2 +" = "+ sum );
    }

    private static void doDODAWANIE() {
        Scanner wej = new Scanner(System.in);
        System.out.println("Podaj pierwsza liczbę : ");
        zmienna1 =wej.nextInt();
        System.out.println("Podaj drugą liczbę : ");
        zmienna2 =wej.nextInt();
        long sum = zmienna1 + zmienna2;
        System.out.println(zmienna1 + " + " + zmienna2 +" = "+ sum );
    }
        private String getString(String title) {

            System.out.print("PRESS ENTER TO EXIT \n" +
                    ": ");
            return wej.nextLine();
        }
        private Operacje printMenu() {
            System.out.println("Please choose option: ");
            for (int index = 0; index < Operacje.values().length; index++) {
                System.out.println(index + " - " + Operacje.values()[index]);
            }
            do {
                String value = getString(" ");
                int option = Integer.parseInt(value);
                if ((option >= 0) && (option < Operacje.values().length)) return Operacje.values()[option];
            } while (true);
        }
}

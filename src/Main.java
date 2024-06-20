import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        problema9();

    }


        public static void problema9() {
            System.out.println("Introduceti un Nume Propriu:");
            Scanner substantiv1 = new Scanner(System.in);
            String sub1 = substantiv1.nextLine();
            System.out.println("Introduceti un numar:");
            Scanner numar1 = new Scanner(System.in);
            String num1 = numar1.nextLine();
            System.out.println(sub1 + " era un vanator care avea " + num1 + " caini");

        }
    }


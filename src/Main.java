import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //problema1();
        //problema2();
        problema3();


    }
    public static void problema3() {
        String r = "Y";
        do {
            System.out.println("Introduceti anul despre care vreti sa aflati daca este bisect");
            Scanner scanner = new Scanner(System.in);
            if (scanner.hasNextInt() == true) {
                int a = Integer.parseInt(scanner.nextLine());

                if (a % 400 == 0) {
                    System.out.println(a + " este un an bisect");
                    break;
                } else {
                    if (a % 100 == 0) {
                        System.out.println(a + " nu este un an bisect");
                        break;
                    } else {
                        if (a % 4 == 0) {
                            System.out.println(a + " este un an bisect");
                            break;
                        } else {
                            System.out.println(a + " nu este un an bisect");
                            break;
                        }
                    }
                }}
            else{
                    System.out.println("Nu ati introdus un numar valid, doriti sa reincercati? Y/N");
                    Scanner reincerc = new Scanner(System.in);
                    r = reincerc.nextLine();
                }

            }  while (r.equals("Y") | r.equals("y")) ;
        }


    public static void problema2() {
        String r = "Y";
        do {
            System.out.println("Introduceti un numar intreg");
            Scanner scanner = new Scanner(System.in);
            if (scanner.hasNextInt() == true) {
                int a = Integer.parseInt(scanner.nextLine());

                if (a < 0) {
                    System.out.println(a + " este un numar negativ");
                    break;
                } else {
                    if (a > 0) {
                    System.out.println(a + " este un numar pozitiv");
                    break;
                }
                    else {
                        System.out.println(a + " este egal cu ZERO");
                        break;
                    }
            }
            }
            else {
                System.out.println("Nu ati introdus un numar valid, doriti sa reincercati? Y/N");
                Scanner reincerc = new Scanner(System.in);
                r = reincerc.nextLine();
            }

        } while (r.equals("Y") | r.equals("y"));
    }


    public static void problema1() {
        String r = "Y";
        do {
            System.out.println("Introduceti un numar intreg");
            Scanner scanner = new Scanner(System.in);
            if (scanner.hasNextInt() == true) {
                int a = Integer.parseInt(scanner.nextLine());

                if (a % 2 == 0) {
                    System.out.println(a + " este par");
                    break;
                } else {
                    System.out.println(a + " este impar");
                    break;
                }
            } else {
                System.out.println("Nu ati introdus un numar valid, doriti sa reincercati? Y/N");
                Scanner reincerc = new Scanner(System.in);
                r = reincerc.nextLine();
            }

        } while (r.equals("Y") | r.equals("y"));
    }

}
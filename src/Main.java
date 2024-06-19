import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //problema1();
        //problema2();
        //problema3();
        problema6();
    }

    public static void problema6(){
        String t = "C";
        System.out.println("Introduceti Tempertura in grade Celsius");
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextDouble() == true) {
            double a = Double.parseDouble(scanner.nextLine());
            System.out.println("Doriti sa transformati Temperatura in grade Fahrenheit sau Kelvin? : F/K");
            Scanner doresc = new Scanner(System.in);
            t = doresc.nextLine();
            if (t.equals("f") | t.equals("F")) {
                double gradef = 32 + a * 9 / 5;
                System.out.println(a + " Grade C este echivaletul a " + gradef + " Grade Fahreinheit");

            }
                else {
                    if (t.equals("k") | t.equals("K")){
                        double gradek = 273.15 + a;
                        System.out.println(a + " Grade C este echivaletul a " + gradek + " Grade Kelvin");

                }
                    else {
                        System.out.println("Nu ati ales o conversie posibila");

                    }

            }
        }
        else{
            System.out.println("Nu ati introdus o temperatura corecta");

        }

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
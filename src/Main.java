import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Banking();

    }


        public static void Banking() {
            double balantainitiala = 1000;
            double conteconomii = 240;
            String continua = "y";

            do {
                System.out.println("\nCe operatiune doriti sa efectuati?");
                System.out.println("1. Verificare sold");
                System.out.println("2. Deposit");
                System.out.println("3. Retragere");
                System.out.println("4. Transfer (intre conturi)");
                Scanner selectie = new Scanner(System.in);

                if (selectie.hasNextInt() == false) {
                    System.out.println("Optiune incorecta");
                    System.out.println("\nDoriti sa efectuati o alta operatiune? Y/N");
                    Scanner reincerc = new Scanner(System.in);
                    continua = reincerc.nextLine();
                } else {
                    int selectnumber = selectie.nextInt();
                    switch (selectnumber) {
                        case 1:
                            System.out.println("In ce moneda Doriti sa vizualizati soldul?");
                            System.out.println("1. USD");
                            System.out.println("2. EUR");
                            System.out.println("3. RON");

                            int selectv = selectie.nextInt();

                            switch (selectv) {
                                case 1:
                                    System.out.println("Contul dumnevoastra curent este de: " + balantainitiala + " USD");
                                    System.out.println("Contul dumnevoastra economii este de: " + conteconomii + " USD");
                                    System.out.println("\nDoriti sa efectuati o alta operatiune? Y/N");
                                    Scanner reincerc = new Scanner(System.in);
                                    continua = reincerc.nextLine();
                                    break;
                                case 2:
                                    System.out.println("Contul dumnevoastra curent este de: " + 0.93 * balantainitiala + " EUR");
                                    System.out.println("Contul dumnevoastra economii este de: " + 0.93 * conteconomii + " EUR");
                                    System.out.println("\nDoriti sa efectuati o alta operatiune? Y/N");
                                    reincerc = new Scanner(System.in);
                                    continua = reincerc.nextLine();
                                    break;
                                case 3:
                                    System.out.println("Contul dumnevoastra curent este de: " + 4.63 * balantainitiala + " RON");
                                    System.out.println("Contul dumnevoastra economii este de: " + 4.63 * conteconomii + " RON");
                                    System.out.println("\nDoriti sa efectuati o alta operatiune? Y/N");
                                    reincerc = new Scanner(System.in);
                                    continua = reincerc.nextLine();
                                    break;
                                default:
                                    System.out.println("Nu ati ales o optiune valida");
                                    System.out.println("\nDoriti sa efectuati o alta operatiune? Y/N");
                                    reincerc = new Scanner(System.in);
                                    continua = reincerc.nextLine();
                                    break;

                            }

                            break;

                        case 2:
                            System.out.println("Ce suma doriti sa depozitati?");
                            Scanner sumadepozit = new Scanner(System.in);
                            double sd = Double.parseDouble(sumadepozit.nextLine());
                            if (sd > 0) {
                                balantainitiala = balantainitiala + sd;
                                System.out.println("Contul dumnevoastra are acum in el " + balantainitiala + " USD");
                                System.out.println("\nDoriti sa efectuati o alta operatiune? Y/N");
                                Scanner reincerc = new Scanner(System.in);
                                continua = reincerc.nextLine();
                                break;
                            } else {
                                System.out.println("Valoarea introdusa este incorecta");
                                System.out.println("\nDoriti sa efectuati o alta operatiune? Y/N");
                                Scanner reincerc = new Scanner(System.in);
                                continua = reincerc.nextLine();
                                break;
                            }
                        case 3:
                            System.out.println("Ce suma doriti sa retrageti");
                            Scanner sumaretragere = new Scanner(System.in);
                            double sr = Double.parseDouble(sumaretragere.nextLine());
                            if (balantainitiala >= sr & sr > 0) {
                                balantainitiala = balantainitiala - sr - (1 - sr % 1);
                                conteconomii = conteconomii + (1 - sr % 1);
                                System.out.println("Contul dumnevoastra are acum in el " + balantainitiala + " USD");
                                System.out.println("Contul dumnevoastra de economii are acum in el " + conteconomii + " USD");
                                System.out.println("\nDoriti sa efectuati o alta operatiune? Y/N");
                                Scanner reincerc = new Scanner(System.in);
                                continua = reincerc.nextLine();
                                break;
                            } else {
                                System.out.println("Fonduri insuficiente");
                                System.out.println("\nDoriti sa efectuati o alta operatiune? Y/N");
                                Scanner reincerc = new Scanner(System.in);
                                continua = reincerc.nextLine();
                                break;
                            }
                        case 4:
                            System.out.println("Ce suma doriti sa transferati?");
                            Scanner sumatransfer = new Scanner(System.in);
                            double st = Double.parseDouble(sumatransfer.nextLine());
                            if (balantainitiala >= st & st>0) {
                                balantainitiala = balantainitiala - st;
                                conteconomii = conteconomii + st;
                                System.out.println("Contul dumnevoastra are acum in el " + balantainitiala + " USD");
                                System.out.println("Contul dumnevoastra de economii are acum in el " + conteconomii + " USD");
                                System.out.println("\nDoriti sa efectuati o alta operatiune? Y/N");
                                Scanner reincerc = new Scanner(System.in);
                                continua = reincerc.nextLine();
                                break;
                            } else {
                                System.out.println("Fonduri insuficiente sau suma incorecta");
                                System.out.println("\nDoriti sa efectuati o alta operatiune? Y/N");
                                Scanner reincerc = new Scanner(System.in);
                                continua = reincerc.nextLine();
                                break;
                            }

                        default:
                            System.out.println("Nu ati ales o optiune valida");
                            System.out.println("\nDoriti sa efectuati o alta operatiune? Y/N");
                            Scanner reincerc = new Scanner(System.in);
                            continua = reincerc.nextLine();
                            break;


                    }
                }
            } while (continua.equalsIgnoreCase("y"));
            System.out.println("Va multumim ca ati apelat la serviciile bancii noastre!");
        }
}


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Banking();

    }


        public static void Banking() {
            double balantainitiala = 100;
            double conteconomii = 170;
            int iSelectie = 0;


            System.out.println("Ce operatiune doriti sa efectuati?");
            System.out.println("1. Verificare sold");
            System.out.println("2. Deposit");
            System.out.println("3. Retragere");
            System.out.println("4. Transfer (intre conturi)");
            Scanner selectie = new Scanner(System.in);

            if (selectie.hasNextInt() == false){
                System.out.println("Optiune incorecta");
            }
            else {
                int selectnumber = selectie.nextInt();
                switch(selectnumber) {
                    case 1:
                        System.out.println("In ce moneda Doriti sa vizualizati soldul?");
                        System.out.println("1. USD");
                        System.out.println("2. EUR");
                        System.out.println("3. RON");

                        int selectv = selectie.nextInt();

                            switch(selectv){
                                case 1:
                                    System.out.println("Contul dumnevoastra curent este de: " + balantainitiala + " USD");
                                    System.out.println("Contul dumnevoastra economii este de: " + conteconomii + " USD");
                                    break;
                                case 2:
                                    System.out.println("Contul dumnevoastra curent este de: " + 0.93*balantainitiala + " EUR");
                                    System.out.println("Contul dumnevoastra economii este de: " + 0.93*conteconomii + " EUR");
                                    break;
                                case 3:
                                    System.out.println("Contul dumnevoastra curent este de: " + 4.63*balantainitiala + " RON");
                                    System.out.println("Contul dumnevoastra economii este de: " + 4.63*conteconomii + " RON");
                                    break;
                                default:
                                    System.out.println("Nu ati ales o optiune valida");
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
                            break;
                        }
                        else {
                            System.out.println("Valoarea introdusa este incorecta");
                            break;
                        }
                    case 3:
                        System.out.println("Ce suma doriti sa retrageti");
                        Scanner sumaretragere = new Scanner(System.in);
                        double sr = Double.parseDouble(sumaretragere.nextLine());
                        if (balantainitiala >= sr & sr > 0) {
                            balantainitiala = balantainitiala - sr - (1-sr%1);
                            conteconomii = conteconomii + (1-sr%1);
                            System.out.println("Contul dumnevoastra are acum in el " + balantainitiala + " USD");
                            System.out.println("Contul dumnevoastra de economii are acum in el " + conteconomii + " USD");
                            break;
                    }   else {
                            System.out.println("Fonduri insuficiente");
                            break;
                    }
                    case 4:
                        System.out.println("Ce suma doriti sa transferati?");
                        Scanner sumatransfer = new Scanner(System.in);
                        double st = Double.parseDouble(sumatransfer.nextLine());
                        if (balantainitiala >= st) {
                            balantainitiala = balantainitiala - st;
                            conteconomii = conteconomii + st;
                            System.out.println("Contul dumnevoastra are acum in el " + balantainitiala + " USD");
                            System.out.println("Contul dumnevoastra de economii are acum in el " + conteconomii + " USD");
                            break;
                    }   else {
                            System.out.println("Fonduri insuficiente");
                            break;
                    }

                    default:
                        System.out.println("Nu ati ales o optiune valida");
                        break;


        }
            }
    }}



import java.util.*;


public class Main {

    public static double ticketprice(int ticketsnumber, String dicounttype, int arriving){
        //declaring price
        final int morningprice = 10;
        final int noonprice = 20;
        final int eveningprice = 30;
        String typeofdiscount = dicounttype;
        double price = 0;

        switch (typeofdiscount) {
            case "kids":
                price = 0;
                break;
            case "students":
                if (arriving < 12) {
                    price = ticketsnumber*0.75 * morningprice;
                }
                else {
                    if (arriving <= 17) {
                        price = ticketsnumber*0.75 * noonprice;
                    }
                    else {
                        price = ticketsnumber*0.75 * eveningprice;
                    }
                }
                break;
            case "older":
                if (arriving < 12) {
                    price = ticketsnumber*0.5 * morningprice;
                }
                else {
                    if (arriving <= 17) {
                        price = ticketsnumber*0.5 * noonprice;
                    }
                    else {
                        price = ticketsnumber*0.5 * eveningprice;
                    }
                }
                break;
            case "normal":
                if (arriving < 12) {
                    price = morningprice*ticketsnumber;
                }
                else {
                    if (arriving <= 17) {
                        price = noonprice*ticketsnumber;
                    }
                    else {
                        price = eveningprice*ticketsnumber;
                    }
                }
                break;
            default:
                break;
        }
        return price;
    }

    public static boolean isOpen(String day, int arrivinghour) {
        int[] MondayTimes = {9, 18};
        int[] TuesdayTimes = {11, 19};
        int[] WednesdayTimes = {8, 17};
        int[] ThursdayTimes = {9, 20};
        int[] FridayTimes = {10, 18};
        String[] dayoftheweek = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};
        List<String> dayoftheweeklist = Arrays.asList(dayoftheweek);

        if (dayoftheweeklist.contains(day)) {

            HashMap<String, Integer> OpeningHours = new HashMap<>(5);
            //Adding Values
            OpeningHours.put("Monday", MondayTimes[0]);
            OpeningHours.put("Tuesday", TuesdayTimes[0]);
            OpeningHours.put("Wednesday", WednesdayTimes[0]);
            OpeningHours.put("Thursday", ThursdayTimes[0]);
            OpeningHours.put("Friday", FridayTimes[0]);

            HashMap<String, Integer> ClosingHours = new HashMap<>(5);
            //Adding Values
            ClosingHours.put("Monday", MondayTimes[1]);
            ClosingHours.put("Tuesday", TuesdayTimes[1]);
            ClosingHours.put("Wednesday", WednesdayTimes[1]);
            ClosingHours.put("Thursday", ThursdayTimes[1]);
            ClosingHours.put("Friday", FridayTimes[1]);


            if (arrivinghour >= OpeningHours.get(day) & arrivinghour < ClosingHours.get(day)) {
                return true;
            } else {
                return false;
            }
        }
        else{
            return false;
        }
    }

    public static void main(String[] args) {

        //declaring income
        double totalincome = 0;
        int tickets = 0;
        int students = 0;
        int older = 0;
        int kids =0;
        double mondayincome =0;
        double tuesdayincome=0;
        double wednesdayincome=0;
        double thursdayincome =0;
        double fridayincome = 0;

        boolean eow = false;
        String sfs = "n";



        while (!eow) {

            System.out.println("\nIntroduceti Ziua vizitei: Monday, Tuesday, Wednesday, Thursday, Firday");
            Scanner ziuasosirii = new Scanner(System.in);
            String arrivalday = ziuasosirii.nextLine();

            System.out.println("\nIntroduceti Ora vizitei: Numar intreg intre 0 si 24");
            Scanner orasosirii = new Scanner(System.in);
            int arrivaltime = orasosirii.nextInt();

            boolean deschis = isOpen(arrivalday, arrivaltime);

            if (deschis) {

                System.out.println("\nCate persoane viziteaza?");
                Scanner nrpersoane = new Scanner(System.in);
                tickets = nrpersoane.nextInt();


                System.out.println("\nCati copii sub 7 ani va insotesc?");
                Scanner nrcopii = new Scanner(System.in);
                kids = nrcopii.nextInt();
                if (kids < tickets) {
                    tickets = tickets - kids;
                } else {
                    System.out.println("\nCopiii trebuie sa fie insotiti de minim un adult");
                }


                System.out.println("\nCati studeti exista in grupul dumneavoastra?");
                Scanner nrstudenti = new Scanner(System.in);
                students = nrstudenti.nextInt();
                if (students <= tickets) {
                    tickets = tickets - students;
                } else {
                    System.out.println("\nAti introdus un numar mai mare decat numarul declarat de bilete");
                }

                System.out.println("\nCati pensionari exista in grupul dumneavoastra?");
                Scanner nrpensionari = new Scanner(System.in);
                older = nrpensionari.nextInt();
                if (older <= tickets) {
                    tickets = tickets - older;
                } else {
                    System.out.println("\nAti introdus un numar mai mare decat numarul declarat de bilete");
                }


                switch (arrivalday){
                    case "Monday":
                        mondayincome = mondayincome + ticketprice(tickets,"normal",arrivaltime)+ticketprice(kids, "kids", arrivaltime)+ticketprice(students, "students", arrivaltime)+ticketprice(older, "older", arrivaltime);
                        break;
                    case "Tuesday":
                        tuesdayincome = tuesdayincome + ticketprice(tickets,"normal",arrivaltime)+ticketprice(kids, "kids", arrivaltime)+ticketprice(students, "students", arrivaltime)+ticketprice(older, "older", arrivaltime);
                        break;
                    case "Wednesday":
                        wednesdayincome = wednesdayincome + ticketprice(tickets,"normal",arrivaltime)+ticketprice(kids, "kids", arrivaltime)+ticketprice(students, "students", arrivaltime)+ticketprice(older, "older", arrivaltime);
                        break;
                    case "Thursday":
                        thursdayincome = thursdayincome + ticketprice(tickets,"normal",arrivaltime)+ticketprice(kids, "kids", arrivaltime)+ticketprice(students, "students", arrivaltime)+ticketprice(older, "older", arrivaltime);
                        break;
                    case "Friday":
                        fridayincome = fridayincome + ticketprice(tickets,"normal",arrivaltime)+ticketprice(kids, "kids", arrivaltime)+ticketprice(students, "students", arrivaltime)+ticketprice(older, "older", arrivaltime);
                        break;
                }


                System.out.println("\nEste sfarsit de saptamana? Y/N");
                Scanner sfsaptamana = new Scanner(System.in);
                sfs = sfsaptamana.nextLine();
            }
            else {
                System.out.println("\nNe pare rau dar este inchis");
                System.out.println("\nEste sfarsit de saptamana? Y/N");
                Scanner sfsaptamana = new Scanner(System.in);
                sfs = sfsaptamana.nextLine();
            }

            if (sfs.equalsIgnoreCase("y")){
                eow = true;
            }
            totalincome = mondayincome + wednesdayincome + tuesdayincome + thursdayincome + fridayincome;
            System.out.println("\nSaptamana asta ati obtinut venituri din vanzarea biletelor in valoare de:");
            System.out.println("\nLuni:" + " " + mondayincome + "$");
            System.out.println("\nMarti:" + " " + tuesdayincome + "$");
            System.out.println("\nMiercuri:" + " " + wednesdayincome + "$");
            System.out.println("\nJoi:" + " " + thursdayincome + "$");
            System.out.println("\nVineri:" + " " + fridayincome + "$");
            System.out.println("\nTOTAL:" + " " + totalincome + "$");
            double max = Math.max(mondayincome, Math.max(tuesdayincome, Math.max(wednesdayincome, Math.max(thursdayincome, fridayincome))));
            if (max == mondayincome){
                System.out.println("\nZiua cu cele mai mari venituri este Luni:" + " " + mondayincome + "$");
            }
            else {
                if (max == tuesdayincome){
                    System.out.println("\nZiua cu cele mai mari venituri este Marti:" + " " + tuesdayincome + "$");
                }
                else {
                    if (max == wednesdayincome){
                        System.out.println("\nZiua cu cele mai mari venituri este Miercuri:" + " " + wednesdayincome + "$");
                    }
                    else {
                        if (max == thursdayincome){
                            System.out.println("\nZiua cu cele mai mari venituri este Joi:" + " " + thursdayincome + "$");
                        }
                        else {
                            System.out.println("\nZiua cu cele mai mari venituri este Vineri:" + " " + fridayincome + "$");
                        }
                    }
                }
            }
        }

    }








}



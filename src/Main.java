
import java.util.*;

public class Main {
    public static void main(String[] args) {
        int continua = 0;
        Map<String, String> GenderList = new HashMap<>();
        System.out.println("\nCate valori doriti sa introduceti?:");
        Scanner cuvant = new Scanner(System.in);
        continua = cuvant.nextInt();
        populateValues(GenderList, continua);

        printNames(GenderList);
        printGene(GenderList);
        System.out.println("\nNumele persoanelor este: " + returnArrayNames(GenderList));
        System.out.println("\nGenul persoanelor este: " + returnArrayGender(GenderList));
        countBoysGirls(returnArrayGender(GenderList));
        System.out.println("\nNUmarul fetelor este: " + countRomanianGirl(returnArrayNames(GenderList)));
        System.out.println("\nLista sortata este: " + sortGenderMap(returnArrayNames(GenderList)));
    }
    public static Map<String, String> populateValues(Map genderMap, int numberOfInputs) {
        for (int i=0; i<numberOfInputs; i++) {
            System.out.println("\nintroduceti numele persoanei");
            Scanner cuvant1 = new Scanner(System.in);
            String numePersoana = cuvant1.nextLine();

            System.out.println("\nintroduceti genul persoanei: xx(girl) / xy(boy)");
            Scanner cuvant2 = new Scanner(System.in);
            String genPersoana = cuvant2.nextLine();
            genderMap.put(numePersoana, genPersoana);


        }
        return genderMap;
    }

    public static void printNames(Map genderMap){
          System.out.println(genderMap.keySet());
        }

    public static void printGene(Map genderMap){
        System.out.println(genderMap.values());
    }

    public static ArrayList<String> returnArrayNames (Map genderMap){
        ArrayList<String> namesAsArray = new ArrayList<>();
        namesAsArray.addAll(genderMap.keySet());

        return namesAsArray;
    }

    public static ArrayList<String> returnArrayGender (Map genderMap){
        ArrayList<String> genderAsArray = new ArrayList<>();
        genderAsArray.addAll(genderMap.values());

        return genderAsArray;
    }

    public static void countBoysGirls(ArrayList<String> genderMap){
        int countBoys = 0;
        int countGirls = 0;
        for (int i=0; i< genderMap.size(); i++){
            if (genderMap.get(i).equalsIgnoreCase("Boy")){
                countBoys++;
            }
            else {
                countGirls++;
            }
        }
        System.out.println("\n in lista sunt " + countBoys + " baieti si " + countGirls + " fete");
    }

    public static boolean stringEndLetter(String name, char letter){
        int stringLeght = name.length();
        StringBuffer intermediateName = new StringBuffer(name);
        if (intermediateName.substring(stringLeght-1).equalsIgnoreCase(Character.toString(letter))){
            return true;
        }
        else {
            return false;
        }
    }

    public static int countRomanianGirl (ArrayList<String> list){
        int count = 0;
        for (int i=0; i< list.size(); i++){
            if (stringEndLetter(list.get(i), 'a')){
                count++;
            }
        }
        return count;

    }

    public static ArrayList<String> sortGenderMap(ArrayList<String> unsorted){
       Collections.sort(unsorted);
       return unsorted;

        /* String[] intermediateUnsorted = unsorted.toArray(new String[0]);
        Arrays.sort(intermediateUnsorted);
        ArrayList<String> al = new ArrayList<>(Arrays.asList(intermediateUnsorted));
        return al;*/
    }

//Main finishes here
}


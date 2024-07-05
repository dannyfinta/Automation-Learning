
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
        System.out.println("\nNumele persoanelor este: " + returnArray(GenderList));

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

    public static ArrayList<String> returnArray (Map genderMap){
        ArrayList<String> namesAsArray = new ArrayList<>();
        namesAsArray.addAll(genderMap.keySet());

        return namesAsArray;
    }


//Main finishes here
}


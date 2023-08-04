import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Testing {
    public static void main(String[] args) {
        Map<Integer,String>numbersEng=new LinkedHashMap<>();
        numbersEng.put(1,"one");
        numbersEng.put(2,"two");
        numbersEng.put(3,"three");
        numbersEng.put(4,"four");
        numbersEng.put(5,"five");
        Map<Integer,String>oddNumbersIta=new LinkedHashMap<>();//1, 3, 5, 7, 9,
        oddNumbersIta.put(1,"uno");
        oddNumbersIta.put(3,"tre");
        oddNumbersIta.put(5,"cinque");
        oddNumbersIta.put(7,"sette");
        oddNumbersIta.put(9,"nove");
        numbersEng.putAll(oddNumbersIta);
        System.out.println(numbersEng);
        System.out.println("The Value of key 5: " + numbersEng.getOrDefault(5, "No associated value"));
        System.out.println("The Value of key 6: " + numbersEng.getOrDefault(6, "No associated value"));
        System.out.println("The Value of key 7: " + numbersEng.getOrDefault(7, "No associated value"));
        System.out.println("The Value of key 8: " + numbersEng.getOrDefault(8, "No associated value"));
        System.out.println("The Value of key 9: " + numbersEng.getOrDefault(9, "No associated value"));
    }
}

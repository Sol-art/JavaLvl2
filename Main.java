package task3;
import java.util.HashSet;
import java.util.Set;

/**Main class*/
public class Main {
    public static void main(String[] args) {
        String[] array = new String[]
                {"AAA", "BBB", "AAA", "aaa", "BBB", "ccc", "CCC", "EEE", "DDD", "FFF", "FFF", "CCC"};
        uniq(array);
        numWord(array);

        Phonebook one = new Phonebook();
        one.set("Ivanov", "8544526441");
        one.set("Ivanov", "85285254254");
        one.set("Ivanov", "854144224");
        one.set("Petrov", "277535353");
        one.set("Petrov", "85445278671");
        one.set("Petrov", "85447687832");
        one.set("Kozlov", "8578663444");
        one.set("Baranov", "8567875443");
        one.set("Baranov", "854786354");
        one.set("Popov", "845667826441");
        one.set("Ivanov", "87866876441");

        one.get("Ivanov");
        one.get("Petrov");
        one.get("Kozlov");
        one.get("Baranov");
        one.get("Popov");
    }

    /**Method for identifying unique content*/
    static void uniq (String[] arr){
        Set<String> uniq = new HashSet<>();
        for (String a : arr) {
            uniq.add(a);
        }
        System.out.println(uniq);
    }
    
    /**The method of counting unique content*/
    static void numWord (String[] arr){
        Set<String> numWord = new HashSet<>();
        for (int i = 0; i < arr.length; i++  ) {
            int num = 0;
            String word = arr[i];
            for (String b : arr) {
                if (word.equals(b)) {
                    num++;
                }
            }
            String words = ("The word " + word + " occurs " + num + " times");
            numWord.add(words);
        }
        System.out.println(numWord);
    }
}


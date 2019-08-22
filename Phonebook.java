package task3;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**Class phone book*/
public class Phonebook {

    Map<String, List<String>> phoneBook = new HashMap<String, List<String>>() {
    };

    /**Phone search method by last name*/
    public void get (String name) {
        System.out.println(name + " phones " + phoneBook.get(name));
    }

    /**Method for making new entries in the phonebook*/
    public void set (String name, String phone) {

        List<String> newNum = new ArrayList<>();

        if (phoneBook.get(name) == null) {
            newNum.add(phone);
            phoneBook.put(name, newNum);
        }
        else {
            newNum = phoneBook.get(name);
            newNum.add(phone);
            phoneBook.put(name, newNum);
        }
    }
}

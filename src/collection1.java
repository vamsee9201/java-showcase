import java.util.ArrayList;
import java.util.List;


public class collection1 {
    // this is about List collection interface
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("banana");
        list.add("banana"); //duplicates are allowed
        for (String fruit:list) {
            System.out.println(fruit);
        }

        list.remove("banana");
        System.out.println(list);
        System.out.println("List contains Banana: " + list.contains("banana"));
        System.out.println("Size of the list: " + list.size());
        System.out.println("List just cleared");
        list.clear();
        System.out.println("Size of the list: " + list.size());
    }

}

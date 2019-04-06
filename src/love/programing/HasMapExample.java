package love.programing;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HasMapExample {

    public static void main(String[] args) {

        Map myMap = new HashMap();

        myMap.put("12", "Chaitanya");
        myMap.put(2, "Ramu");
        myMap.put(7, "Raju");
        myMap.put(49, "Ajith");
        myMap.put(50, "Raghav");
        myMap.put(60, "Rama");

        System.out.println(myMap);

        Set mySet = myMap.entrySet();

        Iterator mySetIterator = mySet.iterator();


        while (mySetIterator.hasNext()) {

            Map.Entry mentry = (Map.Entry) mySetIterator.next();
            System.out.println("***********************");


//        System.out.println(mySetIterator.next());
        System.out.println("key is :" + mentry.getKey() + " & Value is: ");
            System.out.println(mentry.getValue());

    }





    }
}

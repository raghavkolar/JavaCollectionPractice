package love.programing;

import java.util.HashSet;
import java.util.Iterator;

public class HassetExample {

    public static void main(String[] args) {

        HashSet set= new HashSet();


        set.add("one");
        set.add("Two");
        set.add("Three");
        set.add("Four");
        set.add("Five");
        set.add("Five");
        set.add("Five");

        System.out.println("Size of Set Variable:" +set.size());

        System.out.println(set.add("Five"));
        System.out.println(set.add("Six"));

        System.out.println("Size of Set Variable after adding Six :" +set.size());


        Iterator mysetIterator= set.iterator();

        while(mysetIterator.hasNext()) {
            System.out.println(mysetIterator.next());
        }




    }
}

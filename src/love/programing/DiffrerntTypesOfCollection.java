package love.programing;

import java.util.*;



public class DiffrerntTypesOfCollection {



    public static void main(String[] args) {

        List linkList=new LinkedList();
        linkList.add("Element 1");
        linkList.add("Element 2");
        linkList.add("Element 3");
        linkList.add("Element 4");
        System.out.println(linkList);

        for (Object str:linkList) {
            System.out.println("LinkedList element at  Index:" +linkList.indexOf(str) +":" +str);;
        }


        List aryLst = new ArrayList();
        aryLst.add("x");
        aryLst.add("y");
        aryLst.add("z");
        aryLst.add("w");

        for (Object str:aryLst) {
            System.out.println("Array List element at  Index:" +aryLst.indexOf(str) +":" +str);;
        }

        aryLst.remove("X");

        System.out.println("*** Removed elemet X and Added New Element at Position 2 ");
        aryLst.add(2,"raghav");

        for (Object str:aryLst) {
            System.out.println("Array List element at  Index:" +aryLst.indexOf(str) +":" +str);;
        }

        aryLst.add(4,"Rama");

        System.out.println("*** Added New Element at Position 4 ");
        for (Object str:aryLst) {
            System.out.println("Array List element at  Index:" +aryLst.indexOf(str) +":" +str);;
        }


        Set hashSet = new HashSet();
        hashSet.add("set1");
        hashSet.add("set2");
        hashSet.add("set3");
        hashSet.add("set4");


        Iterator mysetIterator= hashSet.iterator();

        while(mysetIterator.hasNext()) {
            System.out.println(mysetIterator.next());
        }


        SortedSet treeSet = new TreeSet();
        treeSet.add("5");
        treeSet.add("3");
        treeSet.add("3");
        treeSet.add("4");
        treeSet.remove("3");
        treeSet.add("2");
        treeSet.add("1");

        Iterator mysetIterator1= treeSet.iterator();

        while(mysetIterator1.hasNext()) {
            System.out.println(mysetIterator1.next());
        }

        LinkedHashSet lnkHashset = new LinkedHashSet();
        lnkHashset.add("one");
        lnkHashset.add("two");
        lnkHashset.add("three");
        lnkHashset.add("four");

        Iterator mysetIterator2= lnkHashset.iterator();

        while(mysetIterator2.hasNext()) {
            System.out.println(mysetIterator2.next());
        }

        Map map1 = new HashMap();
        map1.put("key1", "J");
        map1.put("key2", "K");
        map1.put("key3", "L");
        map1.put("key4", "M");

        Set mySet=map1.entrySet();

        Iterator myIterator3 = mySet.iterator();

        while(myIterator3.hasNext()){

            Map.Entry mentry=(Map.Entry) myIterator3.next();

            System.out.println("key is :" + mentry.getKey() + " & Value is: ");
            System.out.println(mentry.getValue());

        }


        }
    }


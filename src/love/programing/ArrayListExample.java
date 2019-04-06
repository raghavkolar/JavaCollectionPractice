package love.programing;

import java.util.ArrayList;

public class ArrayListExample {

    public static void main(String[] args) {

        ArrayList <String> myArraylist= new ArrayList();

        Integer num=2;

        myArraylist.add("Ajith");
        myArraylist.add("Harry");
        myArraylist.add("Chaitanya");
        myArraylist.add("Steve");
        myArraylist.add("Anuj");
//        myArraylist.add(2);
//        myArraylist.add(num);

        System.out.println("ArrayList "+myArraylist);
        int myArraySize= myArraylist.size();

        System.out.println("Size of Arrray :" +myArraySize);

        for (int i=0;i< myArraylist.size();i++){

            System.out.println("Array List element at  Index:-" +i +":" +myArraylist.get(i));
        }

            for (String str:myArraylist) {
                System.out.println("Array List element at  Index:" +myArraylist.indexOf(str) +":" +str);;
            }


    }
}

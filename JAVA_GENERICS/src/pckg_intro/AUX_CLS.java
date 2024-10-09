package pckg_intro;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class AUX_CLS {

    public static void listStringList(ArrayList<String> lst) {


        if(lst.isEmpty()){

        }

        for(String element : lst){

            System.out.println("Element: " + element);
        }
    }

    public static void listIntList(ArrayList<Integer> lst) {

        for(Integer intEl : lst){

            System.out.println("Element: " + intEl);
        }
    }

    public static void listUserList(ArrayList<User> lst) {

        for(User usr : lst){
            System.out.println("User: " + usr);
        }
    }

    public static <E> void listElements(ArrayList<E> someList) {

        if(someList.isEmpty()){

            System.out.println("Lista je prazna");
        } else {

            for(E element : someList){

            System.out.println("element: " + element);
        }
        }


    }

    public static <Q> void listElementsVerSnd(ArrayList<Q> someList) {

        Iterator<Q> iter = someList.iterator();
        while(iter.hasNext()){
            System.out.println("Element: " + iter.next());
        }
    }

    public static <K, V> void listMapElements(HashMap<K, V> map) {

        if(map.isEmpty()){
            System.out.println("Mapa je prazna");
        } else {

            System.out.println("Map details as object: " + Integer.toHexString(map.hashCode()));
            for(Map.Entry<K, V> entry : map.entrySet()){
                System.out.println("Key: " + entry.getKey() + " Value: " + entry.getValue());
            }
        }
    }
}

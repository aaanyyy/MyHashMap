package UI;


import Util.MyHashMap;
import lombok.RequiredArgsConstructor;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

@RequiredArgsConstructor
public class MapView {
    private final Scanner sc;

    public  Integer readKey()
    {
        System.out.println("Please enter a key");
        int key=sc.nextInt();
        sc.nextLine();
        return key;
    }
    public  String readValue()
    {
        System.out.println("Please enter a value");
        String value=sc.nextLine();
        return value;
    }

    public void showMap(MyHashMap<Integer,String>map)
    {

        Set<Integer> keys = map.keySet();
        for (Integer key : keys) {
            System.out.printf("key= %d, value=\"%s\"\n", key,map.get(key));
        }

    }



    public void showElement(MyHashMap<Integer,String> map) {
        System.out.println("Please enter a key of an element");
        int key= sc.nextInt();
        sc.nextLine();
        if(map.containsKey(key))
        System.out.println("The value is "+map.get(key)+"\n");
        else
            System.out.println("There is no such the element in this map");


    }


    public void removeElement(MyHashMap<Integer, String> map) {

        System.out.println("Please enter a key of an element");
        int key= sc.nextInt();
        sc.nextLine();
        if(map.remove(key))
            System.out.println("The value has been removed"+"\n");
        else
            System.out.println("There is no such the element in this map");

    }
}

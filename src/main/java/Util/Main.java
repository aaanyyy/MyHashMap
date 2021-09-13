package Util;

import UI.MapView;
import UI.Menu.Actions.*;
import UI.Menu.Menu;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        MyHashMap <Integer,String>map=new MyHashMap<>();
        map.put(1,"The key is 1");
        map.put(2,"The key is 2");
        map.put(3,"The key is 3");
        map.put(4,"The key is 4");
        map.put(5,"The key is 5");
        map.put(6,"The key is 6");
        map.put(1,"The key is 1 and the value is replaced");
        map.put(3,"The key is 3 and the value is replaced");
        map.put(7,"The key is 7");
        map.put(16,"The key is 16");
        map.put(17,"The key is 17");

        
        Scanner sc=new Scanner(System.in);
        MapView listView=new MapView(sc);
        List<MenuAction> Actions=new ArrayList<>();
        Actions.add(new AddToMapMenuAction(map,listView));
        //Actions.add(new DeleteElementMenuAction(list,listView));
        Actions.add(new ShowElementMenuAction(map,listView));
        Actions.add(new ShowMapMenuAction(map,listView));
        Actions.add(new RemoveElementMenuAction(map,listView));
        Actions.add(new ExitMenuAction());

        Menu menu=new Menu(Actions,sc);
        menu.run();

    }
}

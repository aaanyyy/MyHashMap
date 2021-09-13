package UI.Menu.Actions;


import UI.MapView;
import Util.MyHashMap;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class ShowMapMenuAction implements MenuAction{

    private final MyHashMap<Integer,String> map;
    private final MapView listView;

    @Override
    public void doAction() {
        listView.showMap(map);

    }

    @Override
    public String getName() {
        return "Show the map";
    }
}

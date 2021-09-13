package UI.Menu.Actions;


import UI.MapView;
import Util.MyHashMap;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class AddToMapMenuAction implements MenuAction{

    private final MyHashMap<Integer,String> map;
    private final MapView listView;

    @Override
    public void doAction() {
        map.put(listView.readKey(),listView.readValue());

    }

    @Override
    public String getName() {
        return "Add a map";
    }
}

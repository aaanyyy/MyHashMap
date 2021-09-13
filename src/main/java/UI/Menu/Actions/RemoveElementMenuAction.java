package UI.Menu.Actions;


import UI.MapView;
import Util.MyHashMap;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class RemoveElementMenuAction implements MenuAction{

    private final MyHashMap<Integer,String> map;
    private final MapView mapView;

    @Override
    public void doAction() {
        mapView.removeElement(map);

    }

    @Override
    public String getName() {
        return "Remove an element";
    }
}

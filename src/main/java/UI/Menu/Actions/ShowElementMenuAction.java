package UI.Menu.Actions;


import UI.MapView;
import Util.MyHashMap;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class ShowElementMenuAction implements MenuAction{

    private final MyHashMap<Integer,String> map;
    private final MapView mapView;

    @Override
    public void doAction() {
        mapView.showElement(map);

    }

    @Override
    public String getName() {
        return "Show a value";
    }
}

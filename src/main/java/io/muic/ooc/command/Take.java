package io.muic.ooc.command;

import io.muic.ooc.GameMap;
import io.muic.ooc.Item;
import io.muic.ooc.Player;

import java.util.Iterator;
import java.util.List;

public class Take implements Command{
    public void apply(String item){
        if(GameMap.getInstance().getCurrentRoom().getUnits().size() == 0){
            List<Item> roomItems = GameMap.getInstance().getCurrentRoom().getItems();
            Item takenItem = null;
            for(Iterator<Item> itm = roomItems.iterator(); itm.hasNext(); ){
                Item curItem = itm.next();
                if(curItem.getName().equals(item)) {
                    roomItems.remove(curItem);
                    takenItem = curItem;
                    break;
                }
            }
            if(takenItem == null) System.out.println("Cannot find the item you wanted");
            else {
                Player.getInstance().pickItem(takenItem);
                System.out.println("you have pick up " + takenItem.getName());
            }
        }else {
            System.out.println("You need to beat all the monster to pick up item!!");
        }

    }
}

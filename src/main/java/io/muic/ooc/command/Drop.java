package io.muic.ooc.command;

import io.muic.ooc.GameMap;
import io.muic.ooc.Item;
import io.muic.ooc.Player;

import java.util.Iterator;
import java.util.List;

public class Drop implements Command{
    public void apply(String item){
        List<Item> playerItem = Player.getInstance().getItems();
        Item droppingItem = null;
        for(Iterator<Item> itm = playerItem.iterator(); itm.hasNext();){
            Item curItem = itm.next();
            if(curItem.getName().equals(item)){
                playerItem.remove(curItem);
                droppingItem = curItem;
                break;
            }
        }
        if(droppingItem == null) System.out.println("You don't have this item in your inventory");
        else {
            GameMap.getInstance().getCurrentRoom().addItem(droppingItem);
            System.out.println("you have drop " + droppingItem.getName());
        }
    }
}

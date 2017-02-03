package io.muic.ooc.command;

import io.muic.ooc.ConsumableItem;
import io.muic.ooc.Item;
import io.muic.ooc.Player;

import java.util.Iterator;
import java.util.List;

public class Use implements Command{
    public void apply(String consumableItem){
        List<Item> playerItem = Player.getInstance().getItems();
        Item usingItem = null;
        for(Iterator<Item> itm = playerItem.iterator(); itm.hasNext();){
            Item curItem = itm.next();
            if(curItem.getName().equals(consumableItem) && curItem.getClass().getName().contains("potion")){
                playerItem.remove(curItem);
                usingItem = curItem;
                break;
            }
        }
        if(usingItem == null) System.out.println("you don't have this item in your inventory");
        else{
            ConsumableItem conItem = (ConsumableItem) usingItem;
            conItem.use(Player.getInstance());
            System.out.println("you use " + conItem.getName());
        }
    }
}

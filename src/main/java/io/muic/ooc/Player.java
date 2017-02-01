package io.muic.ooc;

import java.util.ArrayList;
import java.util.List;

public class Player {
    private final int BASE_EXP = 50;
    private int experience;
    private int level;
    private int health;
    private int maxHealth;
    private List<Item> items;
    private ConsumableItem latestItem;
    private final int MAX_ITEM_SLOT = 4;

    private Player() {
        this.experience = 0;
        this.level = 1;
        this.health = 50;
        this.maxHealth = 50;
        this.items = new ArrayList<>();
    }

    private static Player ourInstance = new Player();

    public static Player getInstance() {
        return ourInstance;
    }

    public String getInfo(){
        String hp = "HP: " + health+ "/" + maxHealth;
        String exp = "EXP: " +experience+"/"+getBaseExp();
        String items = "Bag: " + this.items.toString();
        return hp + "\n" + exp + "\n" + items;

    }

    public void attack(WeaponItem weaponItem){

    }

    public void useItem(ConsumableItem consumableItem){
        if(items.contains(consumableItem)){
            latestItem = (ConsumableItem) items.remove(items.indexOf(consumableItem));
            latestItem.use(Player.getInstance());
        }else{
            System.out.println("You don't have this item in your inventory");
        }

    }

    public void pickItem(Item item){
        if(items.size() < MAX_ITEM_SLOT) items.add(item);
        else System.out.println("Your item slot is full you can drop something");
    }
    public void go(String direction){

    }

    public int getHealth() {
        return health;
    }

    public void increaseHealth(int health) {
        if(this.health + health >= maxHealth) this.health = maxHealth;
        else this.health += health;
    }

    public void decreaseHealth(int health){
        this.health -= health;

    }

    public Item getLatestItem() {
        return latestItem;
    }

    public int getBaseExp(){
        return level * BASE_EXP;
    }

    public void increaseExperience(int experience){
        if(this.experience + experience >= getBaseExp()){
            level++;
            this.experience = getBaseExp() - (this.experience + experience);
        }else{
            this.experience += experience;
        }
    }

    public List<Item> getItems() {
        return items;
    }
}

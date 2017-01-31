package io.muic.ooc;

import java.util.Random;

public class Minion extends Unit {
    public Minion() {

    }

    @Override
    public void attack(Player player) {
        double prob = new Random().nextDouble();
        int dmg = 0;
        if(prob <= 0.25){
            dmg = (int) (getAttackScore()*0.65);
        }else if(prob > 0.25 && prob < 0.75){
            dmg = (int) (getAttackScore()*0.85);
        }else{
            dmg = getAttackScore();
        }
        player.decreaseHealth(dmg);
    }

    @Override
    public Item dropItem() {
        Random random = new Random();
        double prob = random.nextDouble();
        if (prob <= 0.35){
            String potionString = ItemFactory.allPotions.get(random.nextInt(ItemFactory.allPotions.size()));
            return ItemFactory.getPotion(potionString);
        }else if (prob > 0.35 && prob <= 0.4 ){
            String weaponString = ItemFactory.allWeapons.get(random.nextInt(ItemFactory.allWeapons.size()));
            return ItemFactory.getWeapon(weaponString);
        }else{
            return null;
        }
    }
}

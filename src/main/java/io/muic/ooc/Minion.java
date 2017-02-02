package io.muic.ooc;


public class Minion extends Unit {

    private final double POTION_DROP_RATE = 0.35;
    private final double WEAPON_DROP_RATE = 0.05;
    private final double ATTACK_CHANCE = 0.5;
    private final double ATTACK_REDUCE = 0.8;


    @Override
    public void attack(Player player) {
        if(random.nextDouble() <= ATTACK_CHANCE){
            player.decreaseHealth((int) (super.getAttackScore() * ATTACK_REDUCE));
        }else{
            player.decreaseHealth(super.getAttackScore());
            System.out.println("your health decrease by " + super.getAttackScore());
        }
    }

    @Override
    public Item dropItem() {
        if (random.nextDouble() <= POTION_DROP_RATE) {
            String potionString = ItemFactory.allPotions.get(random.nextInt(ItemFactory.allPotions.size()));
            System.out.println("The monster drop " + potionString);
            return ItemFactory.getPotion(potionString);
        }
        if (random.nextDouble() <= WEAPON_DROP_RATE){
            String weaponString = ItemFactory.allWeapons.get(random.nextInt(ItemFactory.allWeapons.size()));
            System.out.println("The monster drop " + weaponString);
            return ItemFactory.getWeapon(weaponString);
        }
        return null;
    }
}

package io.muic.ooc;

import java.util.Random;

public abstract class Unit {

    private String name;
    private String action;
    private String description;
    private int giveExp;
    private int attackScore;
    private int health;
    private int maxHealth;
    protected final Random random = new Random();

    public abstract void attack(Player player);
    public abstract Item dropItem();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAttackScore() {
        return attackScore;
    }

    protected void setAttackScore(int attackScore) {
        this.attackScore = attackScore;
    }

    protected void increaseHealth(int health) {
        if(health >= maxHealth) this.health = maxHealth;
        else this.health += health;
    }

    public void decreaseHealth(int health){
        if(this.health <= 0) this.health = 0;
        else this.health -= health;
    }

    public int getMaxHealth() {
        return maxHealth;
    }

    public int getHealth(){
        return health;
    }

    protected void setHealth(int health){
        this.health = health;
        this.maxHealth = health;
    }

    @Override
    public String toString(){
        return getName();
    }
}

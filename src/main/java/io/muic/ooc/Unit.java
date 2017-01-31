package io.muic.ooc;

public abstract class Unit {

    private String name;
    private String action;
    private String description;
    private int giveExp;
    private int attackScore;
    private int health;
    private int maxHealth;

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

    public void setAttackScore(int attackScore) {
        this.attackScore = attackScore;
    }

    public void increaseHealth(int health) {
        if(health >= maxHealth) this.health = maxHealth;
        else this.health += health;
    }

    public void decreaseHealth(int health){
        this.health -= health;

    }

    public int getHealth(){
        return health;
    }
}

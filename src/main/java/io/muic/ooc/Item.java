package io.muic.ooc;

public abstract class Item {
    private String name;
    private int heal;
    private String action;

    public abstract void use();
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
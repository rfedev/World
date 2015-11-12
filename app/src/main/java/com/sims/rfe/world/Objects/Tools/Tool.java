package com.sims.rfe.world.Objects.Tools;


import com.sims.rfe.world.Objects.WorldObject;

/**
 * Tools
 */
public abstract class Tool extends WorldObject {

    private int durability;
    private int quality;

    public Tool(String name, int id, int durability, int quality) {
        super(name, id);
        this.durability = durability;
        this.quality = quality;
    }

    public int getDurability() {
        return durability;
    }

    public void setDurability(int durability) {
        this.durability = durability;
    }

    public int getQuality() {
        return quality;
    }

    public void setQuality(int quality) {
        this.quality = quality;
    }

    //Todo: public abstract void something();

}

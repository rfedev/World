package com.sims.rfe.world.Objects;

/**
 * Any object that can exist in the world.
 */
public class WorldObject {
    private String name;
    private long weight;
    private long position[] = new long[1];
    private int rotation;
    private long size[] = new long[1];

    public WorldObject(String name, long weight, long[] position, int rotation, long[] size) {
        this.name = name;
        this.weight = weight;
        this.position = position;
        this.rotation = rotation;
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getWeight() {
        return weight;
    }

    public void setWeight(long weight) {
        this.weight = weight;
    }

    public long[] getPosition() {
        return position;
    }

    public void setPosition(long[] position) {
        this.position = position;
    }

    public int getRotation() {
        return rotation;
    }

    public void setRotation(int rotation) {
        this.rotation = rotation;
    }

    public long[] getSize() {
        return size;
    }

    public void setSize(long[] size) {
        this.size = size;
    }
}

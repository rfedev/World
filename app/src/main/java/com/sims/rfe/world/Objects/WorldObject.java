package com.sims.rfe.world.Objects;

import com.sims.rfe.world.Objects.IWorldObject;

/**
 * Created by richa on 11/11/2015.
 */
public class WorldObject implements IWorldObject{

    private String name;
    private int id;

    public WorldObject(String name, int id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getId() {
        return id;
    }

}

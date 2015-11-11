package com.sims.rfe.world.Objects.Source;

import com.sims.rfe.world.Objects.WorldObject;

/**
 * Source for Logs
 */
public class Tree implements WorldObject {

    private String name;
    private int id;

    public Tree(int id) {
        this.id = id;
        this.name = "Tree";
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public boolean interact() {



        return false;
    }
}

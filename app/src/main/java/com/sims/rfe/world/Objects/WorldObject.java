package com.sims.rfe.world.Objects;

/**
 * Any object that can exist in the world.
 */
public interface WorldObject {

    public String getName();
    public int getId();
    public boolean interact();

}

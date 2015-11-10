package com.sims.rfe.world.Objects.RawResources;

import com.sims.rfe.world.Objects.WorldObject;

/**
 * Raw Resource
 */
public class RawResource extends WorldObject {

    private int quantity;

    public RawResource(String name, long weight, long[] position, int rotation, long[] size, int quantity) {
        super(name, weight, position, rotation, size);

        this.quantity = quantity;

    }



}

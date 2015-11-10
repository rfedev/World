package com.sims.rfe.world.Objects.Sources;

import com.sims.rfe.world.Objects.RawResources.RawResource;
import com.sims.rfe.world.Objects.WorldObject;

import java.util.ArrayList;

/**
 * Source for Raw resources
 */
public class Source extends WorldObject {

    private ArrayList resources = new ArrayList();;

    public Source(String name, long[] position, long[] size, ArrayList resources) {
        super(name, 0, position, 0, size);

        this.resources = resources;

    }

    public static RawResource harvest(int resource){

        //return resources.
    }
}

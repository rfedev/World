package com.sims.rfe.world.Objects.Source;

import com.sims.rfe.world.Objects.Tools.Tool;
import com.sims.rfe.world.Objects.WorldObject;

/**
 * Source for Raw Resources.
 */
public abstract class Source extends WorldObject {

    public Source(String name, int id) {
        super(name, id);
    }

    public abstract boolean getResource(String type, Tool tool);
}

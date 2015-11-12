package com.sims.rfe.world.Objects.Source;

import com.sims.rfe.world.Objects.Tools.Tool;

/**
 * Source for Logs
 */
public class Tree extends Source {

    private int logAmount;
    private int fruitAmount;

    public Tree(int id) {
        super("Tree", id);
    }

    @Override
    public boolean getResource(String type, Tool tool) {
        return false;
    }
}

/*
 * Copyright (c) 2017. Phasmid Software
 */

package edu.neu.coe.info6205.randomwalk;

import java.util.Random;

public class RandomWalk {
    private int x = 0;
    private int y = 0;

    private final Random random = new Random();

    private void move(int dx, int dy) {
        // TODO you need to implement this
    }

    private void randomWalk(int n) {
        for (int i = 0; i < n; i++)
            randomMove();
    }

    private void randomMove() {
        // TODO you need to implement this
    }

    public double distance() {
        return 0; // TODO you need to implement this
    }

    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        RandomWalk walk = new RandomWalk();
        walk.randomWalk(n);
        System.out.println(n + " steps: " + walk.distance());
    }
}

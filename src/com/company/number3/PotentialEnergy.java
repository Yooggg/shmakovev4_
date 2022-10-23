package com.company.number3;

public class PotentialEnergy {
    private static final float g = 9.81f;

    private int height;
    private int mass;

    public PotentialEnergy() {}

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getMass() {
        return mass;
    }

    public void setMass(int mass) {
        this.mass = mass;
    }

    public float potentialEnergy(){
        return mass*g*height;
    }

}

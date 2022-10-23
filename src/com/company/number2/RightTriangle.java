package com.company.number2;

public class RightTriangle {
    private int cathet1;
    private int cathet2;
    private int hypotenuse;

    public RightTriangle(int cathet1, int cathet2){
        this.cathet1 = cathet1;
        this.cathet2 = cathet2;
    }


    public int getCathet1() {
        return cathet1;
    }

    public int getCathet2() {
        return cathet2;
    }

    public int calcHypotenuse(){
        hypotenuse = (int)Math.sqrt(Math.pow(cathet1,2) + Math.pow(cathet2,2));
        return hypotenuse;
    }

}

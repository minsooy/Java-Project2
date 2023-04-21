package com.likelion.javaproject2.week1.day5;

import static java.lang.Math.sqrt;

public class Point {
    int x;
    int y;

    boolean isEqual(){
        return x == y;
    }

    double getLength(Point end){
        int xDistance = this.x - end.x;
        int yDistance = this.y -end.y;

        return(sqrt(xDistance*xDistance + yDistance*yDistance));

    }
}

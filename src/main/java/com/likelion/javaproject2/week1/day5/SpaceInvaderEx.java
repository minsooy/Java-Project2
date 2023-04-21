package com.likelion.javaproject2.week1.day5;

public class SpaceInvaderEx {
    private void moveLeft() {
        int location = 0;
        location = -1;
        System.out.printf("moveLeft: %d\n", location);
    }
    private void moveRight() {
        int location = 0;
        location += 1;
        System.out.printf("moveRight: %d\n", location);
    }

    public static void main(String[] args) {
        SpaceInvaderEx si = new SpaceInvaderEx();
        si.moveLeft();
        si.moveRight();
    }

}

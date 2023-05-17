package com.likelion.javaproject2.week5.day2;

public class Stack1 {
    int[] arr = new int[10000];
    int pointer = 0;

    public void push(int value) {
        arr[pointer++] = value;
        System.out.println(pointer);
    }

    public int pop() {
        return arr[--pointer];
    }
}

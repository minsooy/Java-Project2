package com.likelion.javaproject2.week4;

public class FactorSum {
    public int factorSum(int num){
        int sum = 1;
        for (int i = 2; i <= num; i++) {
            if(num % i == 0){
                sum += i;
            }
        }
        return sum;
    }
}

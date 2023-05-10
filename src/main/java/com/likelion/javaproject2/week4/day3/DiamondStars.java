package com.likelion.javaproject2.week4.day3;

import com.likelion.javaproject2.week4.day2.ShapeDrawer;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class DiamondStars {
//    public static void makeALine(int num, int floor){
//        int pivot = num / 2;
//        if(floor <= pivot){
//            for (int j = 0; j < pivot - floor ; j++) {
//                System.out.printf(" ");
//            }
//            for (int j = 0; j < 2 * floor + 1; j++) {
//                System.out.printf("*");
//            }
//            System.out.println();
//        }else{
//            for (int j = 0; j < floor - pivot; j++) {
//                System.out.printf(" ");
//            }
//            for (int j = 0; j < 2 * (num - floor) - 1; j++) {
//                System.out.printf("*");
//            }
//            System.out.println();
//        }
//    }



    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc= new Scanner(System.in);
        int num = sc.nextInt();
        int pivot = num / 2;
        String directory = "C:\\Users\\82108\\Desktop\\diamond.txt";

        ShapeDrawer sd = new DiamondShapeDrawer();
        sd.printToFile(num , directory);
        sd.printShape(num);

//        for (int i = 0; i < num; i++) {
//            if(i <= pivot){
//                for (int j = 0; j < pivot - i ; j++) {
//                    System.out.printf(" ");
//                }
//                for (int j = 0; j < 2 * i + 1; j++) {
//                    System.out.printf("*");
//                }
//                System.out.println();
//            }else{
//                for (int j = 0; j < i - pivot; j++) {
//                    System.out.printf(" ");
//                }
//                for (int j = 0; j < 2 * (num - i) - 1; j++) {
//                    System.out.printf("*");
//                }
//                System.out.println();
//            }
//        }
//
//        for (int i = 0; i < num; i++) {
//            makeALine(num, i);
//        }

    }
}

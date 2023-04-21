package com.likelion.javaproject2.week1.day5;

public class PointTest {
    public static void main(String[] args) {
        Point p1 = new Point();
        p1.x=0;
        p1.y=0;
        System.out.printf("(x:%d , y:%d)\n",p1.x,p1.y);
        System.out.printf("xy가 같은지? %s\n", p1.isEqual());

        Point p2 = new Point();
        p2.x = 1;
        p2.y = 1;
        System.out.printf("(x:%d , y:%d)\n",p2.x,p2.y);
        System.out.printf("xy가 같은지? %s\n", p1.isEqual());

        Point p3 = new Point();
        p3.x = 3;
        p3.y = 4;
        System.out.printf("(x:%d , y:%d)\n",p2.x,p2.y);
        System.out.printf("xy가 같은지? %s\n", p1.isEqual());
        System.out.printf("p1과 p3의 거리는 %.2f 입니다.", p3.getLength(p1));

    }

}

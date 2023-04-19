package com.likelion.javaproject2.week1;

import java.io.IOException;
import java.io.InputStreamReader;

public class JavaInput {
    public void readOneChar() throws IOException {
        InputStreamReader is = new InputStreamReader(System.in);
        int ascii = is.read();

        System.out.println(ascii);

    }

    public void readTwoChars() throws IOException {
        InputStreamReader is = new InputStreamReader(System.in);
        int ascii1 = is.read();
        int ascii2 = is.read();

        System.out.println("ascii1 = " + ascii1);
        System.out.println("ascii2 = " + ascii2);
    }
}

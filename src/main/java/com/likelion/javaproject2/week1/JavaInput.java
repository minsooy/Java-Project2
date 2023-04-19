package com.likelion.javaproject2.week1;

import java.io.IOException;
import java.io.InputStreamReader;

public class JavaInput {
    public void readOneChar() throws IOException {
        InputStreamReader is = new InputStreamReader(System.in);
        is.read();

        System.out.println(is.read());

    }
}

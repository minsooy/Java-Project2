package com.likelion.javaproject2.week1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderEx{

    public void readALine() throws IOException {
        InputStreamReader is = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(is);

        System.out.println(br.readLine());

    }

    public void readTwoLines() throws IOException {
        InputStreamReader is = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(is);

        String line1 = br.readLine();
        String line2 = br.readLine();

        System.out.println("line1 = " + line1);
        System.out.println("line2 = " + line2);
    }
}
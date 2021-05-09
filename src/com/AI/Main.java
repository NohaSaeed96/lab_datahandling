package com.AI;

import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {
        InputStreamReader input = new InputStreamReader(System.in);
        BufferedReader rbuffer = new BufferedReader(input);

        FileWriter fw = new FileWriter("D:\\javaday3.txt");
        BufferedWriter wbuffer = new BufferedWriter(fw);
        System.out.println("Enter data:");
        String Line = " ";
        while (!Line.equalsIgnoreCase("Stop")) {

            Line = rbuffer.readLine();
            System.out.println("Your data: " + Line);
            wbuffer.write(Line+"\n");
        }
        wbuffer.close();
        rbuffer.close();
        input.close();
    }
}

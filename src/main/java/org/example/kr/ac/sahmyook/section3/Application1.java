package org.example.kr.ac.sahmyook.section3;

import java.io.*;

import static java.lang.System.in;

public class Application1 {
    public static void main(String[] args) {

        BufferedReader in = null;

        try {
            in = new BufferedReader(new FileReader("test.dat"));

            String s;
            while ((s = in.readLine()) != null) {
                System.out.println(s);
            }

        } catch (FileNotFoundException | EOFException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (in != null) {
                try {
                    in.close();

                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

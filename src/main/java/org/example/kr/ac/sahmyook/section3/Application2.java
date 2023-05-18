package org.example.kr.ac.sahmyook.section3;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Application2 {
    public static void main(String[] args) {

        /* try with resource : since 1.7 */
        try (BufferedReader in = new BufferedReader(new FileReader("test dat"))) {
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

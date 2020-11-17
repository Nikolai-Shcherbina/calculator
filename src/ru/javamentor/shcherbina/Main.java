package ru.javamentor.shcherbina;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String a, b, c;
        String[] data = reader.readLine().split(" ");
        a = data[0];
        b = data[1];
        c = data[2];

        int firstArgument = Integer.parseInt(a);
        String operation = b;
        int secondArgument = Integer.parseInt(c);


        switch (operation) {
            case "+":
                System.out.println(firstArgument + secondArgument);
                break;
            case "-":
                System.out.println(firstArgument - secondArgument);
                break;
            case "/":
                System.out.println(firstArgument / secondArgument);
                break;
            case "*":
                System.out.println(firstArgument * secondArgument);
                break;
            default:
                System.err.println("Нет такой операции!");
                break;
        }

    }

}


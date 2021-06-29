package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {


        String name = "Jack";
        int age = 23;
        int temp = +25;

        if (age >= 20 && age <= 45) {
            if (temp >= -20 && temp <= +30) //температура меньше +30 градусов и больше -20 градусов
                System.out.println("можно гулять");
        } else if (age < 20) {
            if (temp >= 0 && temp <= +28) //температура больше 0 градусов и меньше 28 градусов
                System.out.println("можно гулять!");
        } else if (age > 45) {
            if (temp >= -10 && temp <= +25) //температура больше -10 градусов и меньше 25
                System.out.println(" тоже можно гулять!");
        }

        int a = 0;
        int b = 107;


        int random = a + (int) (Math.random() * b);
        System.out.println(" рандомное число: " + random);













    }
}

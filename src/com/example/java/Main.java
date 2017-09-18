package com.example.java;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        squarearea();

        int choice;

        System.out.println("Choose one of the shapes:  Length, Width, Diameter all =5 ");
        System.out.println("1. Square ");
        System.out.println("2. Circle");
        System.out.println("3. Triangle");
        System.out.println("4. Parallelogram");

        Scanner in = new Scanner(System.in);
        choice = in.nextInt();


        switch(choice){
            case 1:
                System.out.println(squarearea());
                break;
            case 2:
                System.out.println(circlearea());
                break;

            case 3:
                System.out.println(trianglearea());
                break;
            case 4:
                System.out.println(parallelogramarea());
                break;
        }




    }

    private static int squarearea() {
        int length =5;
        int width = 5;
       return length*width;
    }
    private static double circlearea() {
        double diameter =5;
        return (3.14*diameter);
    }
    private static double trianglearea() {
        double base = 5;
        double height = 5;
        return  .5*base*height ;
    }
    private static double parallelogramarea() {
        double base = 5;
        double height = 5;
        return base*height ;
    }


}

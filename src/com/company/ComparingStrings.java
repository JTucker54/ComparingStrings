package com.company;

public class ComparingStrings {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("How is the weather?");
        String answer = sc.nextLine();

        if (answer == "rain")
            System.out.println("Take your umbrella!");
        else if (answer == "windy")
            System.out.println("Wear your jacket!");
        else if (answer == "snow" )
            System.out.println("Wear a coat and take a shovel!");
        else
            System.out.println("Enjoy your day!");
    }
}

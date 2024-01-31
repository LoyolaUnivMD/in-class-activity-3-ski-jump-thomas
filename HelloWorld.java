/*
Programmers:  Thomas Richards
Course:  CS212 Mr. Nweke
Due Date: 2/1/2024
In Class Assignment: 3
Problem Statement:  Calculate amount of points from a ski jump based on the type of hill and speed
Data In: speed, type of hill
Data Out:  points earned, distance
Credits: Lab3 from CS 151 for refrence
 */

import java.util.Scanner;
class HelloWorld {
    public static void main(String[] args) {
        //make a new scanner object called in
        Scanner in = new Scanner(System.in);

        //get input for hill type
        System.out.print("Is the hill a normal or large hill? ");
        String hill_type = in.nextLine();

        //initialize the variables as normal hill
        double height = 46;
        double points_per_meter = 2;
        double par = 90;

        //Change the values to normal if inputed
        if (hill_type.equals("large")) {
            height = 70;
            points_per_meter = 1.8;
            par = 120;
        }

        //get input for speed
        System.out.print("What was the speed at the end of the ramp? ");
        double speed = in.nextInt();

        //calculations for time, distance, and points
        double time = Math.sqrt((2*height)/9.8);
        double distance = speed * time;
        double points = 60 + (distance - par)*points_per_meter;

        //output different messages based on amount of points
        if (points >= 61) {
            System.out.println("Great job for doing better than par!");
        }
        else if (points < 10) {
            System.out.println("What happened?");
        }else{
            System.out.println("Sorry you didn’t go very far");
        }

        //output distance and points
        System.out.println("You went "+ distance + " far and got "+ points+  " points!");



    }
}

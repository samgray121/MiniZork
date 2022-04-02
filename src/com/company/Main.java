package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("You are standing in an open field west of a white house.");
        System.out.println("With a boarded front door.");
        System.out.println("There is a small mailbox here.");
        System.out.println("Go to the house, or open the mailbox?");

        String action = sc.nextLine();

        if (action.equals("open the mailbox")) {
            System.out.println("You open the mailbox.");
            System.out.println("It's really dark in there.");
            System.out.println("Look inside or stick your hand in?");
            action = sc.nextLine();

            if (action.equals("look inside")) {
                System.out.println("You peer inside the mailbox.");
                System.out.println("It's really very dark. So ... so very dark.");
                System.out.println("Run away or keep looking?");
                action = sc.nextLine();


                if (action.equals("keep looking")) {
                    System.out.println("Turns out, hanging out around dark places isn't a good idea.");

                    System.out.println("You've been eaten by a grue.");
                } else if (action.equals("run away")) {
                    System.out.println("You run away screaming across the fields = looking very foolish.");
                    System.out.println("But you are alive. Possibly a wise choice.");
                }
            }
            if (action.equals("stick your hand in")) {
                System.out.println("You stick your hand in the mailbox.");
                System.out.println("You feel a strange object in the back.");
                System.out.println("Grab the object or run away?");
                action = sc.nextLine();
                if (action.equals("grab the object")) {
                    System.out.println("It was a venomous snake, it bit you and you died.");
                    System.out.println("Oh well.");
                } else if (action.equals("run away")) {
                    System.out.println("You made it out alive. Good job");
                }

            }


        } else if (action.equals("go to the house")) {
            System.out.println("You made it into the house.");
            System.out.println("There is a staircase that leads to the 2nd floor.");
            System.out.println("Explore first floor or go upstairs?");
            action = sc.nextLine();

            if (action.equals("explore first floor")){
                System.out.println("You explore the first floor and find a dragon, it kills you.");
            } else if(action.equals("go upstairs")) {
                System.out.println("You trip on the first step and die.");
            }

        }


    }

}
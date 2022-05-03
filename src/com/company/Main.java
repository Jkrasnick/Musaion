package com.company;

import javax.swing.*;
import java.util.Scanner;



public class Main extends JFrame {

    private int money;


    private static void InitUI(String uiName){
        JFrame frame = new JFrame(uiName);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300,300);
        JButton button = new JButton("Press");

        frame.add(new JLabel()); // Adds Button to content pane of frame
        frame.setVisible(true);
    }
    public static void main(String[] args) throws InterruptedException {
        //InitUI("yes");
        runGame();

    }

    public static void runGame() throws InterruptedException {
        System.out.println("Welcome to Olympics simulator! Pick a character");
        System.out.println("----------");
        Scanner scan = new Scanner(System.in);
        System.out.println("Barbarian: Specializes in strength but lacks in speed\nRacer: A speedy contestant that specializes in short distance\nBoxer: A tough opponent that will do whatever it takes to win");
        System.out.println("Type 1 for barbarian, 2 for racer, or 3 for boxer");
        String playerString = "";
        if (scan.nextInt() == 1){
            playerString = "Barbarian";
        }
        else if (scan.nextInt() == 2){
            playerString = "Racer";
        }
        else if (scan.nextInt() == 3){
            playerString = "Boxer";
        }
        else{
            System.out.println("Invalid! You have been assigned a neutral character");
            playerString = "Normal";
        }
        System.out.println("You chose the " + playerString + " type!");
        Player player = new Player(playerString);
        Horse horse = new Horse(player.getHorsePower());
        HorseRunner horseRunner = new HorseRunner();
        while (true) {
            System.out.println("----------");
            System.out.println("Would you like to:\n1. Train to improve your stats!\n2. Compete for money\n3. Shop");
            if (scan.nextInt() == 1){
                player.printStats();
                System.out.println("Would you like to: \n1. Improve your strength\n2. Improve your speed\n3. Improve your horse");
                if (scan.nextInt() == 3){
                    player.setHorsePower(horseRunner.startGame());
                }
            }
        }
    }
}

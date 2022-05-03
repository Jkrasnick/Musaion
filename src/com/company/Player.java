package com.company;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Player implements ActionListener {

    private String playerType;
    private int strength;
    private int speed;
    private int horsePower;


    private static void InitUI(String uiName){
        JFrame frame = new JFrame(uiName);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300,300);
        JButton button = new JButton("Press");
        frame.getContentPane().add(button); // Adds Button to content pane of frame
        frame.setVisible(true);
    }
    public Player(String playerType){
        if (playerType.equals("Barbarian")){
            strength = 20;
            speed = 5;
            horsePower = 10;
        }
        else if (playerType.equals("Racer")){
            strength = 5;
            speed = 20;
            horsePower = 15;
        }
        else if (playerType.equals("Boxer")){
            strength = 15;
            speed = 15;
            horsePower = 5;
        }
        else if (playerType.equals("Normal")){
            strength = 7;
            speed = 7;
            horsePower = 7;
        }
    }

    private void addStrength(int x){
        strength += x;
    }
    private void addSpeed(int x){
        speed += x;
    }
    private void addHorse(int x){
        horsePower += x;
    }
    public int getStrength() {
        return strength;
    }
    public int getSpeed(){
        return speed;
    }
    public int getHorsePower(){
        return horsePower;
    }
    public void printStats(){
        String finalString = "";
        finalString += "Strength: ";
        for (int i = 0; i < 10; i++) {
                if (strength > i * 10){
                    finalString += "🟩";
                }
                else{
                    finalString += "⬜️";
                };
        }
        System.out.println(finalString + "(" + strength + "/" + "100)");
        finalString = "Speed: ";
        for (int i = 0; i < 10; i++) {
            if (speed > i * 10){
                finalString += "🟩";
            }
            else{
                finalString += "⬜️";
            }
        }
        System.out.println(finalString + "(" + speed + "/" + "100)");
        finalString = "Horse power: ";
        for (int i = 0; i < 10; i++) {
            if (horsePower > i * 10){
                finalString += "🟩";
            }
            else{
                finalString += "⬜️";
            }
        }
        System.out.println(finalString + "(" + horsePower + "/" + "100)");
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }

    public void setHorsePower(int newHorsePower){
        horsePower += newHorsePower;
    }
}

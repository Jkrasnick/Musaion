package com.company;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class HorseRunner extends JFrame implements ActionListener{

    private static int horsePos;
    private static ArrayList<HorseEnemy> enemyList;
    private static boolean dead;
    private static JButton button1;
    private static JButton button2;
    private static JButton button3;

    public int startGame() throws InterruptedException {
        JFrame f = new JFrame();
        f.setVisible(true);
        f.setSize(200, 1000);
        button2 = new JButton("2");
        button1 = new JButton("1");
        button3 = new JButton("3");
        button1.addActionListener(this);
        button1.setBounds(0, 0,200, 250);
        button1.setVisible(true);
        button2.setBounds(0, 200, 200, 300);
        button2.setVisible(true);
        button2.addActionListener(this);
        button3.setBounds(0, 400, 200, 350);
        button3.setVisible(true);
        button3.addActionListener(this);
        JButton button4 = new JButton("Lane 234724832974");
        button4.setBounds(0, 600, 200, 300);
        button4.setVisible(true);
        f.add(button1);
        f.add(button2);
        f.add(button3);
        f.add(button4);
        horsePos = 1;
        System.out.println("Starting game in 3");
        Thread.sleep(100);
        System.out.println("2");
        Thread.sleep(100);
        System.out.println(1);
        return reloadGame();

    }
    public static int reloadGame() throws InterruptedException{
        int anotherIterations = 0;
        Scanner scan = new Scanner(System.in);
        boolean added = false;
        int iterations = 0;
        dead = false;
        ArrayList<Integer> positionList = new ArrayList<Integer>();
        enemyList = new ArrayList<HorseEnemy>();
        HorseEnemy starterEnemy = new HorseEnemy(10);
        enemyList.add(starterEnemy);
        while (!dead) {
            System.out.println(enemyList.size());
            System.out.println("1. ----------");
            int randomNum = ThreadLocalRandom.current().nextInt(1, 20 + 1);
            String finalString = "";
            if (randomNum == 3) {
                System.out.println("random NUADFSUNFFSNFSDJLKFNS");
                enemyList.add(new HorseEnemy(10));
            }
            finalString = "";
            if (horsePos == 1){
                finalString += "\uD83D\uDC34";
            }
            for (int i = 1; i < 11; i++) {
                for (int a = 0; a < enemyList.size(); a++){
                    if (enemyList.get(a).getPosition() == i && enemyList.get(a).getLine() == 1){
                        added = true;
                        finalString += "\uD83D\uDCA5";
                        break;
                    }
                }
                if (!added) {
                    finalString += " ";
                }
                added = false;
            }
            System.out.println(finalString);
            finalString = "";
            System.out.println("2. ----------");
            randomNum = ThreadLocalRandom.current().nextInt(1, 20 + 1);
            finalString = "";
            if (horsePos == 2){
                finalString += "\uD83D\uDC34";
            }
            for (int i = 1; i < 11; i++) {
                for (int a = 0; a < enemyList.size(); a++){
                    if (enemyList.get(a).getPosition() == i && enemyList.get(a).getLine() == 2){
                        added = true;
                        finalString += "\uD83D\uDCA5";
                        break;
                    }
                }
        if (!added) {
                    finalString += " ";
                }
        added = false;
            }
            System.out.println(finalString);
            finalString = "";
            System.out.println("3. ----------");
            randomNum = ThreadLocalRandom.current().nextInt(1, 20 + 1);
            finalString = "";
            if (horsePos == 3){
                finalString += "\uD83D\uDC34";
            }
            for (int i = 1; i < 11; i++) {
                for (int a = 0; a < enemyList.size(); a++){
                    if (enemyList.get(a).getPosition() == i && enemyList.get(a).getLine() == 3){
                        added = true;
                        finalString += "\uD83D\uDCA5";
                        break;
                    }
                }
                if (!added) {
                    finalString += " ";
                }
                added = false;
            }
            System.out.println(finalString);
            finalString = "";
            iterations += 1;
            anotherIterations ++;
            Thread.sleep(1000);
            for (int i = 0; i < enemyList.size(); i++){
                if (enemyList.get(i).getPosition() == 1 && enemyList.get(i).getLine() == horsePos){
                    dead = true;
                }
            }
            if (iterations == 3){
                iterations = 0;
                positionList.clear();
                for (int i = 0; i < enemyList.size(); i++){
                    enemyList.get(i).setPosition(enemyList.get(i).getPosition() - 1);
                    for (int a = 0; a < enemyList.size(); a++){
                        positionList.add(enemyList.get(a).getPosition());
                    }
                }
            }
            if (iterations == 1000){
                dead = true;
            }
        }
        System.out.println("Great job! You earned " + anotherIterations/10 + " horse levels!");
        return anotherIterations/10;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        boolean b = e.getSource() == getButton1();
        if (b){
            horsePos = 1;
        }
        boolean c = e.getSource() == getButton2();
        if (c){
            horsePos = 2;
        }
        boolean d = e.getSource() == getButton3();
        if (d){
            horsePos = 3;
        }
    }

    private JButton getButton2() {
        return button2;
    }
    private JButton getButton3(){
        return button3;
    }

    public static JButton getButton1() {
        return button1;
    }


    static class HorseEnemy {


        private int position;
        private String image;
        private int line;




        public HorseEnemy(int position){
            line = ThreadLocalRandom.current().nextInt(1, 3 + 1);
            this.position = position;
            int randomNum = ThreadLocalRandom.current().nextInt(1, 3 + 1);
            if (randomNum == 1){
                image = "\uD83D\uDCA5"; //💥
            }
            else if (randomNum == 2){
                image = "\uD83D\uDED1";
            }
            else if (randomNum == 3){
                image = "\uD83C\uDFC7";
            }
        }


        public int getPosition() {
            return position;
        }

        public void setPosition(int position) {
            this.position = position;
        }
        public int getLine() {
            return line;
        }

        public void setLine(int line) {
            this.line = line;
        }
        public String getImage() {
            return image;
        }

        public void setImage(String image) {
            this.image = image;
        }

    }
}

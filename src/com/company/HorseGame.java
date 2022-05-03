package com.company;


import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.font.FontRenderContext;
import java.awt.font.GlyphVector;
import java.awt.image.BufferedImageOp;
import java.awt.image.ImageObserver;
import java.awt.image.RenderedImage;
import java.awt.image.renderable.RenderableImage;
import java.text.AttributedCharacterIterator;
import java.util.*;
import java.awt.geom.AffineTransform;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Ellipse2D.Double;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.Timer;

public class HorseGame extends JPanel implements MouseListener {



    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        try {
            this.drawHorse(g);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private void drawHorse(Graphics g) throws IOException, InterruptedException {
//        JFrame f = new JFrame("Horse game");
//        f.setLayout(new FlowLayout());
//        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        f.setSize(1200, 590);
//        f.setPreferredSize(f.getSize());
//        f.pack();
//        f.setVisible(true);




        boolean dead = false;
        Image horse = ImageIO.read(new File("/Users/krasj25/Desktop/Horse/horse1.png"));
        Image background = ImageIO.read(new File("/Users/krasj25/Desktop/colosem.png"));
        Graphics2D g2d = (Graphics2D) g;
        RenderingHints rh = new RenderingHints(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        rh.put(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
        g2d.setRenderingHints(rh);
        g2d.drawImage(background, 0, 0, 1500, 1000, this);
        g2d.drawImage(horse, 250, 250, 100, 100, this);
        Font font = new Font("Serif", Font.PLAIN, 12);
        g2d.setFont(font);

    }
    public void reloadBackground(Graphics g) throws IOException {
        Image background = ImageIO.read(new File("/Users/krasj25/Desktop/colosem.png"));
        Graphics2D g2d =  (Graphics2D) g;
        g2d.drawImage(background, 0, 0, 1500, 1000, this);
    }
    public void reloadGame(Graphics g, int x, int y) throws IOException{
        Image horse = ImageIO.read(new File("/Users/krasj25/Desktop/Horse/horse1.jpg"));
        Image background = ImageIO.read(new File("/Users/krasj25/Desktop/colosem.png"));
        //g2d.drawImage(background, 0, 0, 1500, 1000, this);
        //g2d.drawImage(horse, x, y, 100, 100, this);
    }
    public void runHorseAnimation(){

    }
    public HorseGame(){

    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

}

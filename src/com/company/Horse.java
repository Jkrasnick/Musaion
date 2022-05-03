package com.company;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.font.FontRenderContext;
import java.awt.font.GlyphVector;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;
import java.awt.image.BufferedImageOp;
import java.awt.image.ImageObserver;
import java.awt.image.RenderedImage;
import java.awt.image.renderable.RenderableImage;
import java.io.File;
import java.io.IOException;
import java.text.AttributedCharacterIterator;
import java.util.Map;

public class Horse extends JPanel implements KeyListener {

    static int x = 100;
    static int y = 100;
    int horse = 0;

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        RenderingHints rh = new RenderingHints(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        rh.put(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
        Image horse = null;
        try {
            horse = ImageIO.read(new File("/Users/krasj25/Desktop/Horse/horse1.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHints(rh);
        Image background = null;
        try {
            background = ImageIO.read(new File("/Users/krasj25/Desktop/colosem.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            reloadGame(g, x, y);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public Horse(int horse) {
        this.horse = horse;
    }

    public void startGame(){

            JFrame f = new JFrame("Horse game");
            f.setSize(new Dimension(1500, 1000));
            f.add(new HorseGame());
            f.setVisible(true);
            f.addKeyListener(this);
//        JFrame f = new JFrame("Horse game");
//        f.setLayout(new FlowLayout());
//        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        f.setSize(1200, 590);
//        f.setPreferredSize(f.getSize());
//        f.pack();
//        f.setVisible(true);
//        var lion = "/Users/krasj25/Desktop/colosem.png";
//        ArrayList<String> horseGif = new ArrayList<>();
//        for (int i = 1; i < 11; i++) {
//            horseGif.add("/Users/krasj25/Desktop/Horse/horse" + i + ".jpg");
//        }
//        var horse = "/Users/krasj25/Desktop/Horse/horse1.jpg";
//        ImageIcon icon = new ImageIcon(lion);
//        ImageIcon horseIcon = new ImageIcon(horseGif.get(0));
//        JButton button = new JButton("TOUCH ME");
//        JLabel lionLabel = new JLabel(icon);
//        JLabel horseLabel = new JLabel(horseIcon);
//        hors

        File lionn = new File("/Users/krasj25/Desktop/lion.jpg");
        System.out.println(lionn.exists());
    }

    public void reloadGame(Graphics gCreate, int x, int y) throws IOException{
        paintComponent(gCreate);
        RenderingHints rh = new RenderingHints(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        rh.put(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
        Image horse = ImageIO.read(new File("/Users/krasj25/Desktop/Horse/horse1.png"));
        Graphics2D g2d = new Graphics2D() {
            @Override
            public void draw(Shape s) {

            }

            @Override
            public boolean drawImage(Image img, AffineTransform xform, ImageObserver obs) {
                return false;
            }

            @Override
            public void drawImage(BufferedImage img, BufferedImageOp op, int x, int y) {

            }

            @Override
            public void drawRenderedImage(RenderedImage img, AffineTransform xform) {

            }

            @Override
            public void drawRenderableImage(RenderableImage img, AffineTransform xform) {

            }

            @Override
            public void drawString(String str, int x, int y) {

            }

            @Override
            public void drawString(String str, float x, float y) {

            }

            @Override
            public void drawString(AttributedCharacterIterator iterator, int x, int y) {

            }

            @Override
            public void drawString(AttributedCharacterIterator iterator, float x, float y) {

            }

            @Override
            public void drawGlyphVector(GlyphVector g, float x, float y) {

            }

            @Override
            public void fill(Shape s) {

            }

            @Override
            public boolean hit(Rectangle rect, Shape s, boolean onStroke) {
                return false;
            }

            @Override
            public GraphicsConfiguration getDeviceConfiguration() {
                return null;
            }

            @Override
            public void setComposite(Composite comp) {

            }

            @Override
            public void setPaint(Paint paint) {

            }

            @Override
            public void setStroke(Stroke s) {

            }

            @Override
            public void setRenderingHint(RenderingHints.Key hintKey, Object hintValue) {

            }

            @Override
            public Object getRenderingHint(RenderingHints.Key hintKey) {
                return null;
            }

            @Override
            public void setRenderingHints(Map<?, ?> hints) {

            }

            @Override
            public void addRenderingHints(Map<?, ?> hints) {

            }

            @Override
            public RenderingHints getRenderingHints() {
                return null;
            }

            @Override
            public void translate(int x, int y) {

            }

            @Override
            public void translate(double tx, double ty) {

            }

            @Override
            public void rotate(double theta) {

            }

            @Override
            public void rotate(double theta, double x, double y) {

            }

            @Override
            public void scale(double sx, double sy) {

            }

            @Override
            public void shear(double shx, double shy) {

            }

            @Override
            public void transform(AffineTransform Tx) {

            }

            @Override
            public void setTransform(AffineTransform Tx) {

            }

            @Override
            public AffineTransform getTransform() {
                return null;
            }

            @Override
            public Paint getPaint() {
                return null;
            }

            @Override
            public Composite getComposite() {
                return null;
            }

            @Override
            public void setBackground(Color color) {

            }

            @Override
            public Color getBackground() {
                return null;
            }

            @Override
            public Stroke getStroke() {
                return null;
            }

            @Override
            public void clip(Shape s) {

            }

            @Override
            public FontRenderContext getFontRenderContext() {
                return null;
            }

            @Override
            public Graphics create() {
                return null;
            }

            @Override
            public Color getColor() {
                return null;
            }

            @Override
            public void setColor(Color c) {

            }

            @Override
            public void setPaintMode() {

            }

            @Override
            public void setXORMode(Color c1) {

            }

            @Override
            public Font getFont() {
                return null;
            }

            @Override
            public void setFont(Font font) {

            }

            @Override
            public FontMetrics getFontMetrics(Font f) {
                return null;
            }

            @Override
            public Rectangle getClipBounds() {
                return null;
            }

            @Override
            public void clipRect(int x, int y, int width, int height) {

            }

            @Override
            public void setClip(int x, int y, int width, int height) {

            }

            @Override
            public Shape getClip() {
                return null;
            }

            @Override
            public void setClip(Shape clip) {

            }

            @Override
            public void copyArea(int x, int y, int width, int height, int dx, int dy) {

            }

            @Override
            public void drawLine(int x1, int y1, int x2, int y2) {

            }

            @Override
            public void fillRect(int x, int y, int width, int height) {

            }

            @Override
            public void clearRect(int x, int y, int width, int height) {

            }

            @Override
            public void drawRoundRect(int x, int y, int width, int height, int arcWidth, int arcHeight) {

            }

            @Override
            public void fillRoundRect(int x, int y, int width, int height, int arcWidth, int arcHeight) {

            }

            @Override
            public void drawOval(int x, int y, int width, int height) {

            }

            @Override
            public void fillOval(int x, int y, int width, int height) {

            }

            @Override
            public void drawArc(int x, int y, int width, int height, int startAngle, int arcAngle) {

            }

            @Override
            public void fillArc(int x, int y, int width, int height, int startAngle, int arcAngle) {

            }

            @Override
            public void drawPolyline(int[] xPoints, int[] yPoints, int nPoints) {

            }

            @Override
            public void drawPolygon(int[] xPoints, int[] yPoints, int nPoints) {

            }

            @Override
            public void fillPolygon(int[] xPoints, int[] yPoints, int nPoints) {

            }

            @Override
            public boolean drawImage(Image img, int x, int y, ImageObserver observer) {
                return false;
            }

            @Override
            public boolean drawImage(Image img, int x, int y, int width, int height, ImageObserver observer) {
                return false;
            }

            @Override
            public boolean drawImage(Image img, int x, int y, Color bgcolor, ImageObserver observer) {
                return false;
            }

            @Override
            public boolean drawImage(Image img, int x, int y, int width, int height, Color bgcolor, ImageObserver observer) {
                return false;
            }

            @Override
            public boolean drawImage(Image img, int dx1, int dy1, int dx2, int dy2, int sx1, int sy1, int sx2, int sy2, ImageObserver observer) {
                return false;
            }

            @Override
            public boolean drawImage(Image img, int dx1, int dy1, int dx2, int dy2, int sx1, int sy1, int sx2, int sy2, Color bgcolor, ImageObserver observer) {
                return false;
            }

            @Override
            public void dispose() {

            }
        };
        g2d.setRenderingHints(rh);
        Image background = ImageIO.read(new File("/Users/krasj25/Desktop/colosem.png"));
        g2d.drawImage(background, 0, 0, 1500, 1000, this);
        g2d.drawImage(horse, 200, 200, 1000, 1000, this);
    }
    @Override
    public void keyTyped(KeyEvent e) {
    }

@Override
    public void keyPressed(KeyEvent e) {

    if (e.getKeyCode() == 87){
        y -= 10;
        try {
            reloadGame(g, x, y);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        //System.out.println("up move");
    }
    else if (e.getKeyCode() == 65){
        x -= 10;
        try {
           reloadGame(g, x, y);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        //System.out.println("left move");
    }
    else if (e.getKeyCode() == 83){
        y += 10;
        try {
            reloadGame(g, x, y);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        //System.out.println("down move");
    }
    else if (e.getKeyCode() == 68){
        x += 10;
        try {
            reloadGame(g, x, y);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        //System.out.println("right move");
    }
    System.out.println(e.getKeyCode());
    System.out.println(x + ", " + y);
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
    Graphics g = new Graphics() {
        @Override
        public Graphics create() {
            return null;
        }

        @Override
        public void translate(int x, int y) {

        }

        @Override
        public Color getColor() {
            return null;
        }

        @Override
        public void setColor(Color c) {

        }

        @Override
        public void setPaintMode() {

        }

        @Override
        public void setXORMode(Color c1) {

        }

        @Override
        public Font getFont() {
            return null;
        }

        @Override
        public void setFont(Font font) {

        }

        @Override
        public FontMetrics getFontMetrics(Font f) {
            return null;
        }

        @Override
        public Rectangle getClipBounds() {
            return null;
        }

        @Override
        public void clipRect(int x, int y, int width, int height) {

        }

        @Override
        public void setClip(int x, int y, int width, int height) {

        }

        @Override
        public Shape getClip() {
            return null;
        }

        @Override
        public void setClip(Shape clip) {

        }

        @Override
        public void copyArea(int x, int y, int width, int height, int dx, int dy) {

        }

        @Override
        public void drawLine(int x1, int y1, int x2, int y2) {

        }

        @Override
        public void fillRect(int x, int y, int width, int height) {

        }

        @Override
        public void clearRect(int x, int y, int width, int height) {

        }

        @Override
        public void drawRoundRect(int x, int y, int width, int height, int arcWidth, int arcHeight) {

        }

        @Override
        public void fillRoundRect(int x, int y, int width, int height, int arcWidth, int arcHeight) {

        }

        @Override
        public void drawOval(int x, int y, int width, int height) {

        }

        @Override
        public void fillOval(int x, int y, int width, int height) {

        }

        @Override
        public void drawArc(int x, int y, int width, int height, int startAngle, int arcAngle) {

        }

        @Override
        public void fillArc(int x, int y, int width, int height, int startAngle, int arcAngle) {

        }

        @Override
        public void drawPolyline(int[] xPoints, int[] yPoints, int nPoints) {

        }

        @Override
        public void drawPolygon(int[] xPoints, int[] yPoints, int nPoints) {

        }

        @Override
        public void fillPolygon(int[] xPoints, int[] yPoints, int nPoints) {

        }

        @Override
        public void drawString(String str, int x, int y) {

        }

        @Override
        public void drawString(AttributedCharacterIterator iterator, int x, int y) {

        }

        @Override
        public boolean drawImage(Image img, int x, int y, ImageObserver observer) {
            return false;
        }

        @Override
        public boolean drawImage(Image img, int x, int y, int width, int height, ImageObserver observer) {
            return false;
        }

        @Override
        public boolean drawImage(Image img, int x, int y, Color bgcolor, ImageObserver observer) {
            return false;
        }

        @Override
        public boolean drawImage(Image img, int x, int y, int width, int height, Color bgcolor, ImageObserver observer) {
            return false;
        }

        @Override
        public boolean drawImage(Image img, int dx1, int dy1, int dx2, int dy2, int sx1, int sy1, int sx2, int sy2, ImageObserver observer) {
            return false;
        }

        @Override
        public boolean drawImage(Image img, int dx1, int dy1, int dx2, int dy2, int sx1, int sy1, int sx2, int sy2, Color bgcolor, ImageObserver observer) {
            return false;
        }

        @Override
        public void dispose() {

        }
    };
}
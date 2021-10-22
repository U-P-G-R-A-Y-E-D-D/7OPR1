package cz.osu;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.util.ArrayList;

public class Gui  implements KeyListener, MouseMotionListener, MouseListener {
    private JFrame window;
    private Color background;
    private BufferedImage image;
    private ArrayList<Shape> shapes;

    public Gui() {
        window = new JFrame();
        window.setSize(800, 600);
        window.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        window.setLocationRelativeTo(null);
        window.setVisible(true);
        window.addKeyListener(this);
        window.addMouseMotionListener(this);
        window.addMouseListener(this);
        window.setResizable(false);

        shapes = new ArrayList<>();

        background =  window.getBackground();

        image = new BufferedImage(window.getWidth(), window.getHeight(), BufferedImage.TYPE_INT_RGB);
        cleanImage();
        printImage();
    }

    private void refresh(){
        cleanImage();
        printEnvironment();
    }

    private void cleanImage(){
        Graphics2D graphics = image.createGraphics();
        graphics.setColor(background);
        graphics.fillRect(0, 0, image.getWidth(), image.getHeight());
    }

    public void addShape(Shape shape){
        shapes.add(shape);
    }

    public void printEnvironment(){
        for (Shape shape : shapes) {
            shape.draw(this);
        }
        printImage();
    }

    public void printImage(){
        try {
            Thread.sleep(40);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        window.getGraphics().drawImage(image, 0, 0, null);
    }

    public void putPixel(int x, int y, Color color){
        image.setRGB(x, y, color.getRGB());
        //printImage();
    }

    public Color getPixel(int x, int y){
        return new Color(image.getRGB(x, y));
    }

    public Color getBackground() {
        return background;
    }

    @Override
    public void keyTyped(KeyEvent e) {
        char c = e.getKeyChar();
        window.setTitle(String.format("%d", e.getID()));

    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

    @Override
    public void mouseDragged(MouseEvent e) {

    }

    @Override
    public void mouseMoved(MouseEvent e) {
        window.setTitle(String.format("(%d,%d)", e.getX(), e.getY()));
    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {
        window.setTitle("Pressed " + e.getButton());
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        window.setTitle("Released");
    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}

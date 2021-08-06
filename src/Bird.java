import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.geom.Ellipse2D;

public class Bird extends JPanel implements KeyListener {
    double x = 0;
    double y = 0;
    double velX = 1;
    double velY = -0;

    public Bird(){
        this.addKeyListener(this);
        setFocusable(true);
        setFocusTraversalKeysEnabled(false);
    }


    public void paintComponent(Graphics g){
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        Ellipse2D circle = new Ellipse2D.Double(x, y, 40, 40);
        g2.fill(circle);
    }
    public void act(){
        y = y - velY;
        if(velY > -9.0){
            velY = Math.round(100.0 * (velY - 0.1)) / 100.0;
        }
        repaint();
        //System.out.println("repaint: "+velY);
    }
    public void jump(){
        velY = 3;
        System.out.println("b.jump");
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
        System.out.println(e.getKeyCode());
        int key = e.getKeyCode();
        if (key == KeyEvent.VK_SPACE){
            jump();
            System.out.println("jump");
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }
}

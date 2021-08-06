import javax.swing.*;
import javax.swing.JFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Game implements ActionListener {
    Timer t = new Timer(5, this);
    static Bird bObject;

    public Game(){
        t.start();

    }

    public static void main(String args[]){
        JFrame fenster = new JFrame();
        fenster.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fenster.setVisible(true);
        fenster.setSize(400, 600);
        fenster.setTitle("Flappy Bird");
        Game g = new Game();
        Bird b = new Bird();
        bObject = b;
        fenster.add(b);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        bObject.act();

    }

}

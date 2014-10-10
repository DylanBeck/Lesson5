
import processing.core.*;
import g4p_controls.*;
import javax.swing.*;

public class ProcessTemplate extends PApplet {

    GButton gbred, gbgreen;
    Ball b;

    public void setup() {
        size(680, 480, JAVA2D);
        frameRate(2);//calls draw 2 times per second
        gbred = new GButton(this, 10, 10, 120, 25);
        gbgreen = new GButton(this, 140, 10, 120, 25);
        gbred.setText("Make a red ball");
        gbgreen.setText("Make a green ball");
    }

    public void handleButtonEvents(GButton button, GEvent event) { /* code */

        int x = (int) (Math.random() * 640);
        int y = (int) (Math.random() * 480);
        if (button == gbred) {
            b = new Ball(this, x, y, 'r');
        } else if (button == gbgreen) {
            b = new Ball(this, x, y, 'g');
        }
        b.draw(); //draw the ball 
    }

    public void draw() {
         background(255, 255, 255);
        if (b != null   ) {
           b.relocate();
            b.draw(); //draw the ball 
           
        }
        
    }

}

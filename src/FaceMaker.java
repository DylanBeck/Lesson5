
import javax.swing.JOptionPane; //to ask user 
import processing.core.PApplet;
import g4p_controls.*;
import java.awt.Color;
import javax.swing.JColorChooser;

public class FaceMaker extends PApplet {

    Face f;
    GButton button1;
    GButton button2;
    GButton button3;
    GButton button4;
    float x, y;

    public void setup() {
        size(400, 400);
        background(255);
        f = new Face(this, 200, 200);
        button1 = new GButton(this, 22, 20, 80, 30);
        button1.setText("Move Face");
        button2 = new GButton(this, 119, 20, 80, 30);
        button2.setText("Resize Face");
        button3 = new GButton(this, 217, 20, 80, 30);
        button3.setText("Change Color");
        button4 = new GButton(this, 311, 20, 80, 30);
        button4.setText("Set Mood");
    }

    public void handleButtonEvents(GButton button, GEvent event) {
        if (button == button1) {
            //ask for new x-y location
            x = Float.parseFloat(JOptionPane.showInputDialog(this, "Enter new x:"));
            y = Float.parseFloat(JOptionPane.showInputDialog(this, "Enter new y:"));
            //move to new x-y location 
            f.erase(); //erase face in current state
            f.move(x, y);
        }
         if (button == button3) {
             Color temp =JColorChooser.showDialog(this, "Choose Face Color", Color.yellow);
             f.erase();
             f.setColor(temp);
         }
    }

    public void draw() {
        f.draw();
    }

}

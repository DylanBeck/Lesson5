
import java.awt.Color;
import processing.core.PApplet;

public class Face {

    private float xPosition, yPosition, radius;
    private Color color;

    private PApplet pen;

    public Face(PApplet p, float x, float y) {
        xPosition = x;
        yPosition = y;
        radius = 100;
        color = Color.red;
        pen = p;
    }

    public void draw() {
        pen.stroke(0); //black outline 
        pen.fill(color.getRed(), color.getGreen(), color.getBlue());//head color
        drawCircle(xPosition, yPosition, radius, radius);//head
        //yellow eyes 
        pen.fill(255, 255, 0);
        drawCircle(xPosition - radius / 5, yPosition-radius / 5, radius / 4, radius / 4);
        drawCircle(xPosition + radius / 5, yPosition-radius / 5, radius / 4, radius / 4);
        //mouth - Line across and 2 lines pointing up 
        drawLine(xPosition - .2 * radius, yPosition + .3 * radius, xPosition + .20 * radius, yPosition + .3 * radius);
        drawLine(xPosition - .2 * radius, yPosition + .3 * radius, xPosition - .25 * radius, yPosition + .2 * radius);
        drawLine(xPosition + .2 * radius, yPosition + .3 * radius, xPosition + .25 * radius, yPosition + .2 * radius);

    }

    //private helper methods
    private void drawCircle(float x, float y, float wid, float ht) {
        pen.ellipse(x, y, wid, ht);
    }

    private void drawLine(double x1, double y1, double x2, double y2) {
        pen.line((float) x1, (float) y1, (float) x2, (float) y2);
    }

    public void erase() {
        pen.fill(255);
        pen.noStroke();
        pen.ellipse(xPosition, yPosition, radius + 5, radius + 5);
    }

    public void setColor(Color c) {
        color = c;
    }

    public void move(float x, float y) {
        xPosition = x;
        yPosition = y;
    }
    
    public void resize()
    {
        
    }
}

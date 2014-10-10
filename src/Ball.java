import processing.core.*;
public class Ball {
    PApplet pen;
    int xloc,yloc;
    
    public Ball(PApplet p, int x, int y, char c)
    {
        pen=p;
        xloc=x;
        yloc=y;
        if (c=='r') pen.fill(255,0,0);
        else pen.fill(0,255,0);
    }
    public void draw()
    {
        pen.ellipse(xloc, yloc, 100, 100);
    }
    public void relocate()
    {
        xloc=(int)(Math.random()*640)+1;
        yloc=(int)(Math.random()*640)+1;
    }
}

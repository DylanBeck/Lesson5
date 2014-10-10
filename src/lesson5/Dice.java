

package lesson5;


public class Dice {
    private int value;
    public Dice()
    {
        value = (int)(Math.random()*6)+1;
        
    }
    public void roll()
    {
        value=(int)(Math.random()*6)+1;
    }
    public int getValue()
    {
        return value;
    }
}

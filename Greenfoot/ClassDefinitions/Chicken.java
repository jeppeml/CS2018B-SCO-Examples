import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Chicken here.
 * 
 * @author Jeppe
 * @version 1
 */
public class Chicken extends Actor
{
    public int health=100;
    public boolean glasses=false;
    
    private boolean goingLeft=false;
    private int counter=0;
   
    public void act()
    {
        if(counter % 6 == 0)
        {
            bob();
        }
        if(counter % getRandomNumber(20,60) == 0)
        {
            turn(Greenfoot.getRandomNumber(360));
        }
        move(1);
        counter = counter + 1;
    }
    
    private int getRandomNumber(int lowerBound, int upperBound)
    {
        return Greenfoot.getRandomNumber(upperBound-lowerBound)+lowerBound;
    }
    
    public void bob()
    {
        if(goingLeft)
        {
            turn(5);
        }
        else
        {
            turn(-5);
        }
        goingLeft = !goingLeft;
    }
      
}

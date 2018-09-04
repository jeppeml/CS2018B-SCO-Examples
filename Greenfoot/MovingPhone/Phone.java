import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Phone here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Phone extends Actor
{
    int health=100;
    int myX;
    int myY;
    int amountOfStepsTaken=0;
    
    public Phone(int myX, int myY)
    {
        this.myX=myX;
        this.myY=myY;
    }
    
    public void move()
    {
        getWorld().showText("Rhello!",10,10);
    }
    
    /**
     * Act - do whatever the Phone wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        //getWorld().showText(health+"", getX(), getY());
        this.move();
        super.turn(1);
        if(super.isAtEdge())
        {
            super.setLocation(myX,myY);
            health = health -1;
            super.turn(90);
        }
        step();
        if(amountOfStepsTaken==50)
        {
            //getWorld().removeObject(this);
        }
    }   
    
    public void step()
    {
        amountOfStepsTaken = amountOfStepsTaken +1;
    }
}

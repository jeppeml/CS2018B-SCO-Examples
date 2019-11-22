import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    private int babyWait=0;
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 500, 1); 
        Alligator ally = new Alligator();
        this.addObject(ally, 200, 200);
        
    }
    
    public void act(){
        babyWait++;
        if(babyWait>150)
        {
            Baby b = new Baby();
            this.addObject(b, Greenfoot.getRandomNumber(800), Greenfoot.getRandomNumber(500));
            babyWait=0;
        }
        
    }
    
}

import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        showText("Rhello!", 100, 100);
        Phone myPhone1 = new Phone(170, 100);
        Phone myPhone2 = new Phone(130,150);
        Phone myPhone3 = new Phone(170,190);
        Phone myPhone4 = new Phone(170,260);
        addObject(myPhone1,170,100);
        addObject(myPhone2,130,150);
        addObject(myPhone3,170,190);
        addObject(myPhone4,170,260);
    }
}

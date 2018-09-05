import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    
    public int add(int number1, int number2)
    {
        int result = number1 + number2;
        return result;
    }
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        Robot r = new Robot();
        //addObject(r,100,100);
        int res = add(3,6);
        showText(res+"", 100,100);
    }
}

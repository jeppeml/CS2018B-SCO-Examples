import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Dolphin here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Dolphin extends Actor
{
    /**
     * Act - do whatever the Dolphin wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        swim();
        tryToEat();
    }    
    
    private void tryToEat(){
        Kangaroo someKanga = (Kangaroo)getOneIntersectingObject(Kangaroo.class);
        if(someKanga!=null)
        {
            someKanga.die(); // Bloody death
        }
    }
    
    private void swim(){
        if(isAtEdge())
        {
            int rand = Greenfoot.getRandomNumber(140)+35;
            turn(rand);
        }
        move(2);
    }
}

import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Smiley here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Smiley extends Actor
{
    /**
     * Act - do whatever the Smiley wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        controls();
        checkForDeath();
    }
    
    private void checkForDeath(){
        Object skull = getOneIntersectingObject(Skull.class);
        if(skull!=null){
            Greenfoot.stop();
        }
    }
    
    private void controls()
    {
        if(Greenfoot.isKeyDown("right"))
        {
            move(2);
        }
 
        if(Greenfoot.isKeyDown("left"))
        {
            move(-2);
        }
    }  
}

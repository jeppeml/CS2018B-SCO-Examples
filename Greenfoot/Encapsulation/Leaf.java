import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Leaf extends Actor
{

    public void act() 
    {
        if(isTouching(Wombat.class))
        {
            Wombat wom = (Wombat)getOneIntersectingObject(Wombat.class);
            wom.eatLeaf();
            getWorld().removeObject(this);
        }
    }    
}

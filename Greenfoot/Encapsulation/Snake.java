import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Snake extends Actor
{

    public void act() 
    {
        java.util.List<Wombat> wombatsInRange = getObjectsInRange(100, Wombat.class);
        if(wombatsInRange.size()>0)
        {
            Wombat closeWombat = wombatsInRange.remove(0);
            
        }
    }    
}

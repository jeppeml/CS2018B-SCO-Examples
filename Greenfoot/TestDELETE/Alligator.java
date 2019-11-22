import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Alligator here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Alligator extends Actor
{
    /**
     * Act - do whatever the Alligator wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        
        if(this.isAtEdge()){
            int someNumber = Greenfoot.getRandomNumber(160)+100;
            this.setRotation(someNumber+this.getRotation());
        }
        move(3);
        
        checkForFood();
    }    
    
    private void checkForFood(){
        Baby b = (Baby)this.getOneIntersectingObject(Baby.class);
        if(b!=null)
        {
            this.getWorld().removeObject(b);
            GreenfootImage allyImg = this.getImage();
            allyImg.scale((int)(allyImg.getWidth()*1.05), (int)(allyImg.getHeight()*1.05));
        }
        
    }
}

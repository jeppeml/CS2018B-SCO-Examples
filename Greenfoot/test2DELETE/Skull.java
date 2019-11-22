import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Skull here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Skull extends Actor
{
    private int speed = Greenfoot.getRandomNumber(5);
    private int timeCounter = 0;
    public Skull(){
        setNewRandomRotation();
    }
    /**
     * Act - do whatever the Skull wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        timeCounter++;
        if(timeCounter>100){
            setNewRandomRotation();
            timeCounter=0;
        }
        move(speed);
        if(getY()>590){
            getWorld().removeObject(this);
        }
    }    
    
    private void setNewRandomRotation(){
        setRotation(70+Greenfoot.getRandomNumber(40));
    }
}

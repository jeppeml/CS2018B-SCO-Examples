import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Kangaroo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Kangaroo extends Actor
{
    // Instance variable
    private int jumps = 0;
    private String name = "Peter Stegger";
    
    /**
     * Act - do whatever the Kangaroo wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        jump();
        checkIfDead();
        // Add your action code here.
    }    
    
    private void jump(){
        if(isAtEdge())
        {
            int rand = Greenfoot.getRandomNumber(140)+35;
            turn(rand);
        }
        move(1);
        jumps = jumps + 1;
    }
    
    public void die(){
        
        
        Bloodsplatter blood = new Bloodsplatter();
        this.getWorld().addObject(blood, this.getX(), this.getY());
        this.getWorld().removeObject(this);
    }
    
    private void checkIfDead(){
        // Local variable
        int whenToDie = 40000;
        
        if(jumps>whenToDie)
        {
            die();
        }
        
        
    }
}

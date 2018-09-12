import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Flower extends Actor
{
    // Attribute/ Instance variable (only once)
    boolean doit = true;
    
    // Methods / behavior
    public void act()
    {
        move(4);
        int i = 0;
        boolean a = true;
        boolean b = true;
        
        
        // true  && true  == true
        // false && true  == false
        // true  && false == false
        // false && false == false
        // true  || true  == true
        // false || true  == true
        // true  || false == true
        // false || false == false
        char[] someChar = {'n','o'};
        String newOne = new String(someChar); // = "no"
        String name = "jebbe"; // Remember equals
        
        if(doit) // Condition must be true/false
        {
            turn(6);
            // DO THIS!!!
        }
        doit = !doit;
    }
       
}

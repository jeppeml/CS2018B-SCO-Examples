import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class MyWorld extends World
{
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        for(int i=0;i<35;i++) // 35 iterations
        {
            Leaf l = new Leaf();
            addObject(l,Greenfoot.getRandomNumber(600),
                    Greenfoot.getRandomNumber(400));
        }
        
        for(int i=0;i<3;i++) // 3 iterations
        {
            Wombat w = new Wombat();
            addObject(w,Greenfoot.getRandomNumber(600),
                    Greenfoot.getRandomNumber(400));
        }
        
        for(int i=0;i<2;i++) // 2 iterations
        {
            Snake s = new Snake();
            addObject(s,Greenfoot.getRandomNumber(600),
                    Greenfoot.getRandomNumber(400));
        }
        
    }
}

import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
public class MyWorld extends World
{
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        int xSpace = 40;
        int ySpace = 40;
        // for(instantiation;condition;increment)
        for(int x=0;x<600/xSpace;x++)
        {
            for(int y=0;y<400/ySpace;y++)
            {
                Flower flower = new Flower();
                //xSpace = xSpace * 0.9;
                //ySpace = ySpace * 0.9;
                addObject(flower,x*xSpace+xSpace/2,y*xSpace*xSpace+ySpace/2);
            }
        }
        String n = "Hi ";
        
        int d = 0;
        int stopNumber = 40;
        
        int x = 2;
        int y = 3;
        
        float p = (float)Math.PI;
        showText(""+p, 200, 100);
        while(stopNumber>0)
        {
            Flower flower = new Flower();
            addObject(flower,200,200);
            stopNumber = stopNumber - 1;
        }
    }
}

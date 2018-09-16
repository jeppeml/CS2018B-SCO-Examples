import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class MyWorld extends World
{
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        Alligator.resetNumberOfAlligators();
        int avg = Alligator.getAvgLifespanYears(); // Static/class variable
        
        // Creating alligator instances
        Alligator herman = new Alligator(); // instance/object of Alligator
        herman.setName("Herman");
        Alligator sherman = new Alligator(); // instance/object of Alligator
        sherman.setName("Sherman");
        Alligator peterS = new Alligator(); // instance/object of Alligator
        peterS.setName("Peter G. Stegger");
        
        // Adding instances to the greenfoot world
        addObject(herman,100,100);
        addObject(sherman,400,100);
        addObject(peterS,200,200);
        
        Cherry sweet = new Cherry();
        Cherry sour  = new Cherry();
        addObject(sweet,175,146);
        addObject(sour,345,276);
        
        
        // Testing Calculator class
        double dist = ActorCalculator.getDistanceBetweenActors(sweet, sour);
                        
        showText(""+dist, 400, 300);
    }
}

import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Alligator extends Actor
{
    private static int avgLifespanYears = 40; // Class variable
    private static int numberOfAlligators = 0; // Class variable
    private static String origin="America";// Class variable
    private String name; // Instance variable (attribute)
    private int health = 100; // Instance variable (attribute)
    
    // Constructor
    public Alligator()
    {
        numberOfAlligators++;
    }
    
    public int getHealth()
    {
        return health;
    }
    
    public int setHealth(int newValue)
    {
        health=newValue;
        return getHealth();
    }
    
    public static void resetNumberOfAlligators()
    {
        numberOfAlligators = 0;
    }
    
    public void setName(String alliName)
    {
        name=alliName;
    }
    
    public void act() 
    {
        // Add your action code here.
    }    
    
    public static int getAvgLifespanYears()
    {
        return avgLifespanYears;
    }
}

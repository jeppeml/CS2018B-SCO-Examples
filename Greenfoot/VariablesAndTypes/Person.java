import greenfoot.*;  
public class Person extends Actor
{
    int health = 0; // weird measurement of health
    float height = 0.0f; // meters
    float weight = 0.0f; // kilo-grams
    boolean isCool = false;
    String name = "";
    int acts = 0;
    
    // Constructor
    public Person()
    {
        health = Greenfoot.getRandomNumber(110-11)+11; // 10-100
        height = (Greenfoot.getRandomNumber(250-100)+100)/100f;
        weight = (Greenfoot.getRandomNumber(1500-500)+500)/10f;
        isCool = (Greenfoot.getRandomNumber(2)==1);
        name = getRandomName();
    }
    
    // Constructor
    public Person(String name)
    {
        this();
        this.name = name;
    }
    
    // Constructor
    public Person(String name, int health, 
        float height, float weight, boolean isCool)
    {
        this.health = health; 
        this.height = height;
        this.weight = weight;
        this.isCool = isCool;
        this.name = name;
        
    }
    
    public void act()
    {
        acts = acts + 1;
        if(acts % 30 == 0)
        {
            health=health-1;
        }
        
        if(acts % (Greenfoot.getRandomNumber(30)+1) == 0)
        {
            turn(Greenfoot.getRandomNumber(360));
        }
        move(2);
        checkAndDie();
        
        
    }
    
    private void checkAndDie()
    {
        if(health<1)
        {
            getWorld().removeObject(this);
        }
    }
    
    private String getRandomName()
    {
        int randNameNum = Greenfoot.getRandomNumber(4);
        if(randNameNum == 0)
        {
            return "Pietre Chztegra";
        }
        else if (randNameNum == 1)
        {
            return "Peter Beggar";
        }
        else if (randNameNum == 2)
        {
            return "Phetar Stegaard";
        }
        else
        {
            return "Peter Stegger";
        }
    }
    
}

import greenfoot.*;  

public class Robot extends Actor
{
  public int counter=0;
    
  public void act()
  {
      counter = counter +1;
      if(counter % 40 == 0)
      {
          turn(5);
      }
      move(1);
  }
}

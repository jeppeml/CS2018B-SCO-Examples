/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritanceandpolymorphism;

import java.util.ArrayList;

/**
 *
 * @author jeppjleemoritzled
 */
public class TestIt {
    
    
    public void testInsertIntoList()
    {
        Robot mrRobot = new Robot();
        mrRobot.setName("Pietr Stegreskey");
        mrRobot.setBrand("Xiaomi");
        
        Robot hum = new Humanoid();
        hum.setName("Piotr Stroganoff");
        hum.setBrand("HTC");
        
        Robot lwn = new Lawnmower();
        lwn.setName("Peter Cutter");
        lwn.setBrand("Husquarna");
        
        ArrayList<Robot> list = new ArrayList();
        list.add(lwn);
        list.add(hum);
        list.add(mrRobot);
        for (Robot robot : list) {
            // Polymorphism to add lastname for instances of subclasses
            System.out.println(robot.getName());
            // No polymorphism
            System.out.println(robot.getBrand());
            // Polymorphism for acting differently based on type
            robot.doSomething();
        }
    }
}

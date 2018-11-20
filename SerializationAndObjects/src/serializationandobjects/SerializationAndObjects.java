/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serializationandobjects;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jeppjleemoritzled
 */
public class SerializationAndObjects {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ClassNotFoundException {

        Phone p=null;
        
        if(p!=null) 
            if(p.getMake().equals("Xiaomi"))
                System.out.println("Rhello1");
        
        String filename = "myPhoneShop.ser";

        try (ObjectInputStream ois = new ObjectInputStream(
                new FileInputStream(filename))) {
            Shop s = (Shop) ois.readObject();
            
            for (Phone phone : s.getPhones()) {
                System.out.println(phone);
            }
        }
        catch (IOException ex) {
            Logger.getLogger(SerializationAndObjects.class.getName()).log(Level.SEVERE, null, ex);
        }

        /*Shop shop = new Shop();
        
        Phone p1 = new Phone(23322123, "Samsung", "S8");
        Phone p2 = new Phone(54359832, "IPhone", "6S");
        shop.getPhones().add(p1);
        shop.getPhones().add(p2);
        System.out.println("Phones:");
        for (Phone phone : shop.getPhones()) {
            System.out.println(phone);
        }
        // Try with resources (auto-close)
        try (ObjectOutputStream oos = new ObjectOutputStream(
                    new FileOutputStream(filename))){
            oos.writeObject(shop);
        }
        catch (IOException ex) {
            Logger.getLogger(SerializationAndObjects.class.getName()).log(Level.SEVERE, null, ex);
        }*/
    }

}

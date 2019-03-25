/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package queueexamples;

import java.util.*;

/**
 *
 * @author jeppjleemoritzled
 */
public class QueueExamples {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.add("Hi");
        queue.add("I");
        queue.add("like");
        queue.add("queues");
        queue.add("and");
        queue.add("queues");
        queue.add("like");
        queue.add("me");
        
        System.out.println("HEAD: " + queue.peek());
        System.out.println("TAIL: " + queue.peekLast());
        
        int i = 0;
        while(queue.size()>0) {
            System.out.println(i++ + " " + queue.pollLast());
        }
        
        Element head = new Element();
        head.setValue("head");
        Element some = new Element();
        some.setValue("some");
        Element something = new Element();
        something.setValue("something");
        
        head.setNext(some);
        some.setPrev(head);
        some.setNext(something);
        something.setPrev(some);
        
        Element iterator = head;
        while(iterator!=null)
        {
            System.out.println(iterator.getValue());
            iterator=iterator.getNext();
        }
        
        
    }
    
}

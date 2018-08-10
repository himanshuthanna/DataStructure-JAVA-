package queueinterface;

import java.util.LinkedList;
import java.util.Queue;

public class QueueInterface {
    public static void main(String[] args) {
        Queue<Integer> q=new LinkedList<>();
        for(int i=1;i<10;i++)
        { q.add(i); }
        System.out.println("Queue is:  "+q);
        System.out.println("Removed element is: "+q.remove());//it removes head of queue
        System.out.println("Updated Queue is:  "+q);
        System.out.println("Size of queue is: "+q.size());
        System.out.println("Head of queue is: "+q.peek());
        
        
    }
    
}

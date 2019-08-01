/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package queues;

/**
 *
 * @author Steven Nyanumba
 */
public class Queues {
    int front;
    int rear;
    int capacity=5; //size of queue
    int[] object; //initializing array
    
    Queues(){
    front=-1;
    rear=-1;
    object=new int[capacity];
    }
    boolean isEmpty(){
    return rear<=front;
    }
    
    int enqueue(int data){
    return object[++rear]=data;
    }
    
    int dequeue(){
    if(rear>=front){
        return object[++front];
    }
    return (Integer)null;
    }
    int size(){
    return rear-front;
    }


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Queues q = new Queues();
        System.out.println(q.isEmpty());
        q.enqueue(7);
        q.enqueue(16);
        q.enqueue(25);
        System.out.println(q.size());
        System.out.println(q.isEmpty());
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
    }
    }
    


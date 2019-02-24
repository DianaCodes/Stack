/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stack;
import java.util.*;
import java.util.EmptyStackException;

/**
 *
 * @author DianaCodes
 */

public class Stack{

    public int arr[];
    public int top;
    public int capacity;
    
    Stack() {
        arr = new int[20];
        capacity = 20;
        top = -1;
    }
    
    Stack(int cap){
        //initialize stack that's capacity is chosen by user
        arr = new int[cap];
        capacity = cap;
        top = -1;
    }
    
    public int pop(){
        if(isEmpty()) {
            System.out.println("Stack is empty.");
            throw new EmptyStackException();
        }
        
        //remove the top item
        System.out.println("Removing " + peek());
            
        return arr[top--];
    }
    
    public void push(int val){
        if(isFull()){
            System.out.println("Stack is full.");
            throw new ArrayIndexOutOfBoundsException();
        }
    
        System.out.println("Inserting " + val);
        
        arr[++top] = val;
    }
    
    public int peek() {
        if(!isEmpty()) {
            //return top item
            return arr[top];
         } else {
            System.out.println("Stack is empty.");
            throw new EmptyStackException();
         }
    }
    
    public boolean isEmpty(){
         return top == -1;
    }
    
    public boolean isFull() {
        return top == capacity - 1;
    }
    
    public int size() {
        return top + 1;
    }
    
     public static void main(String []args){
         Stack stack = new Stack(3);
         
         stack.push(1);
         stack.push(8);
         
         stack.pop();;
         
         stack.push(5);
         
         System.out.println("Top element is: " + stack.peek());
         System.out.println("Stack size is " + stack.size());
         
         if(stack.isEmpty()) {
             System.out.println("Stack is empty.");
         } else{
             System.out.println("Stack is not empty.");
         }
     }
}

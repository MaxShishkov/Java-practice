/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sllinsdemo;

/**
 *
 * @author Max
 */
public class SLLInsDemo {

    static class Node
    {
        String name;
        Node next;
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Node top = null;
        
        //the list doesnt exist
        top = new Node();
        top.name = "A";
        top.next = null;
        dump("Case 1", top);
        
        //List exists, the node must be inserted before the first node
        Node temp;
        temp = new Node();
        temp.name = "B";
        temp.next = top;
        top = temp;
        dump("Case 2", top);
        
        //List exists, the node must be inserted after the last node
        temp = new Node();
        temp.name = "C";
        temp.next = null;
        Node temp2 = top;
        
        while (temp2.next != null)
        {
            temp2 = temp2.next;
        }
        
        temp2.next = temp;
        dump("Case 3", top);
        
        //List exists, node must be inserted between two nodes
        temp = new Node();
        temp.name = "D";
        temp2 = top;
        
        while(temp2.name.equals("A") == false)
        {
            temp2 = temp2.next;
        }
        
        temp.next = temp2.next;
        temp2.next = temp;
        dump("Case 4", top);
        
        
    }
    
    static void dump(String msg, Node topNode)
    {
        System.out.print(msg + " ");
        
        while(topNode != null)
        {
            System.out.print(topNode.name + " ");
            topNode = topNode.next; 
        }
        System.out.println();
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;
import java.util.Arrays;
import java.util.Random;

public class Practice
{
    public static void main(String args[])
    {
        MyThread mt = new MyThread();
        mt.start();
        
        try
        {
            mt.join();
        }
        catch (InterruptedException e)
        {
            
        }
        System.out.println("pi = " + mt.pi);
        
    }
    
}

class MyThread extends Thread
{
    boolean negative = true;
    double pi;
    
    
    MyThread()
    {
        
    }
    
    MyThread(String name)
    {
        super(name);
    }
    
    public void run()
    {
        for (int i = 3; i < 100000; i += 2)
        {
            if (negative)
                pi -= (1.0 / i);
            else
                pi += (1.0 / i);
            negative = !negative;
        }
        
        pi += 1.0;
        pi *= 4.0;
        System.out.println("Finished calculating PI");
    }
}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bubblesort;

/**
 *
 * @author Max
 */
public class BubbleSort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int i, pass;
        int [] x = {20, 15, 12, 30, -5, 72, 456};
        
        for (pass = 0; pass < x.length - 1; pass++)
            for (i = 0; i < x.length - pass - 1; i++)
            {
                if(x[i] > x[i+1])
                {
                    int temp = x[i];
                    x[i] = x[i+1];
                    x[i+1] = temp;
                }
            }
        
        for(int number : x)
            System.out.print(number + " ");
        
    }
    
}

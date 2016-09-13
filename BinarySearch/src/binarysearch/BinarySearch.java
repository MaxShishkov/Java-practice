/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binarysearch;

/**
 *
 * @author Max
 */
public class BinarySearch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int [] x = {-5, 12, 15, 20, 30, 72, 456};
        int loIndex = 0;
        int hiIndex = x.length - 1;
        int midIndex = 0, srch = 72;
        while(loIndex <= hiIndex)
        {
            midIndex = (loIndex + hiIndex) / 2;
            
            if(srch > x[midIndex])
                loIndex = midIndex + 1;
            else
                if(srch < x[midIndex])
                    hiIndex = midIndex - 1;
            else
                break;
        }
        
        if(loIndex > hiIndex)
            System.out.println(srch + " not found");
        else
            System.out.println(srch + " found at position " + (midIndex + 1));
    }
    
}

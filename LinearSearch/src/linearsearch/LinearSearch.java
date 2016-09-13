/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linearsearch;

/**
 *
 * @author Max
 */
public class LinearSearch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int srch = 72;
        int [] x = {20,15,12,30,-5,72,456};
        
        for(int i = 0; i < x.length; i++)
        {
            if (x[i] == srch)
            {
                System.out.println("Found " + srch + " at position " + (i+1));
                return;
            }
        }
        System.out.println("Did not find " + srch);
    }
    
}

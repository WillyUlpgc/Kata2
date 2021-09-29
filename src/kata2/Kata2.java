/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kata2;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author thewi
 */
public class Kata2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] data = new int[]{1, 2, -4, 100, 1, 20, 15, 8, 14, 100, 100, 100, 20, 14,15};
        
        Histogram histo = new Histogram(data);
        Map<Integer, Integer> histogr = histo.getHistogram();
        
        for(Integer key : histogr.keySet()){
            System.out.println(key + " ==> " + histogr.get(key));
        }
    }
    
}

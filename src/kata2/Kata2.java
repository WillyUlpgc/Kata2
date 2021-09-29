/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kata2;

import java.util.HashMap;

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
        HashMap<Integer, Integer> histogram = new HashMap<Integer, Integer>();
        
        
        
        for (int i = 0; i < data.length; i++) {
            int j = data[i];
            if(histogram.containsKey(j)) histogram.put(j, histogram.get(j)+1);
            else histogram.put(j, 1);
        }
        
        for(Integer key : histogram.keySet()){
            System.out.println(key + " ==> " + histogram.get(key));
        }
    }
    
}

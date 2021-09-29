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
        String[] data = new String[]{"Hola", "Que", "Tal", "Casa", "Ordenador", "Hola", "Hola", "Casa"};
        
        Histogram histo = new Histogram(data);
        Map<String, Integer> histogr = histo.getHistogram();
        
        for(String key : histogr.keySet()){
            System.out.println(key + " ==> " + histogr.get(key));
        }
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Samy
 */
public class HistogramViewer <Type> {
    public void print (Histogram<Type> histogram){
        for (Type Key : histogram.keySet()) {
            System.out.println(Key + "-->" + histogram.get(Key));
        }
                
    }
}

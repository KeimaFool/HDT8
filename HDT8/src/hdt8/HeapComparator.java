/*
HDT8
Sang Woo Shin Ji 15372
Diego Ricardo Valdez 15397
24/10/2016
 */
package hdt8;
import java.util.Comparator;
/**
 *
 * @author Shin
 */
public class HeapComparator implements Comparator<Nodo>{
    @Override
    public int compare(Nodo n1, Nodo n2) {
        String s1=n1.getCode().toString();
        String s2=n2.getCode().toString();
        
        int v1=0;
        int v2=0;
        
        if ("A".equals(s1)){
            v1=5;
        }
        if ("B".equals(s1)){
            v1=4;
        }
        if ("C".equals(s1)){
            v1=3;
        }
        if ("D".equals(s1)){
            v1=2;
        }
        if ("E".equals(s1)){
            v1=1;
        }
        if ("A".equals(s2)){
            v2=5;
        }
        if ("B".equals(s2)){
            v2=4;
        }
        if ("C".equals(s2)){
            v2=3;
        }
        if ("D".equals(s2)){
            v2=2;
        }
        if ("E".equals(s2)){
            v2=1;
        }
        if (v1<v2){
            return 1;
        }
        if (v2<v1){
            return -1;
        }
        return 0;
    }
}

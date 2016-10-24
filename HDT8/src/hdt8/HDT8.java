/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hdt8;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Scanner;

/**
 *
 * @author Shin
 */
public class HDT8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    /**
     * @param args the command line arguments
     */
        VectorHeap line = new VectorHeap();
        int err=0;
        File dir = new File(".");
        try{
            File find = new File(dir.getCanonicalPath()+File.separator + "pacientes.txt");
            err=line.reader(find);
        } catch(Exception e){
            System.err.println("NO SE PUDO ENCONTRAR 'pacientes.txt'");
        }
        while (err!=0){
            System.out.println(line.getQueue().remove());
            err=err-1;
        }
        
        
        
        
    }
}
    

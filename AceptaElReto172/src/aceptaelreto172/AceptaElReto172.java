/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aceptaelreto172;

import java.util.Scanner;


/**
 *
 * @author Usuario 1 DAM
 */
public class AceptaElReto172 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
       
    int numsillas;
     numsillas= sc.nextInt();
     while(numsillas!=0){
         
      String silla= sc.nextLine();
      boolean I=false;
    boolean D=false;
    for(int i=0;i<silla.length(); i++){
    
    if(silla.charAt(i)=='I'){
        I=true;
    }          
    if(silla.charAt(i)=='D'){
        D=true;
    }
    }
    
    if(I&&D){
        System.out.println("ALGUNO NO COME");
        
    }
    else{
        System.out.println("TODOS COMEN");
    }
        numsillas= sc.nextInt();
    }
}
}

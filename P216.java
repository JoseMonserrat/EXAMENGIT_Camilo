package vectores;

import java.util.Scanner;

public class P216 {

 public static void main( String[] args ) {
    
	Scanner sc = new Scanner (System.in); 
    
     	int ncasos, gota;
     	int c; 
     
     	ncasos = sc.nextInt();
     
     	for (c = 0; c < ncasos; c++) {
         gota = sc.nextInt();
         
       	int  d = gota / 3600;
       	int b = (gota / 60) - (d * 60) ;
       	int  a = gota - (b * 60) - (d * 3600);            
        
        System.out.printf("%02d:%02d:%02d\n", d, b, a);
     }
     
 } 
 
} 


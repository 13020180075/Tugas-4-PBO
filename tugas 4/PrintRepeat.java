/*
	nama : ilfah sahra
	tanggal : 28 maret 2020
	waktu : 22.00
*/
import java.util.Scanner; 
 public class PrintRepeat { 
 
 
 public static void main(String[] args) {   		
	int N;   	
	int i; 
	  	Scanner masukan=new Scanner(System.in); 
	  	
 
	  	System.out.print  ("Nilai N >0 = ");  
	  	 
	  	N = masukan.nextInt(); 
 
	  	i = 1;  
	  	
	  	System.out.print ("Print i dengan REPEAT: \n");  
	  	do{ 
	  	 	System.out.print (i+"\n"); /* Proses */  
	  	 	i++;  
	  	} 
 
	  	while (i <= N);   
 } 
 
} 

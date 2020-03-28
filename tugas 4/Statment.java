/*
	nama : ilfah sahra
	tanggal : 28 maret 2020
	waktu : 22.00
*/
import java.util.Scanner;

public class Statment {
   public static void main (String [] denny){
        Scanner input = new Scanner (System.in);
        
        String nama, grade;                
        
        final double nilai , n_akhir;
        
        
        System.out.println("Menghitung Nilai");
      
        System.out.print("Masukan nama : ");
        nama = input.nextLine();
               
        System.out.print("Masukan Nilai : ");
        nilai = input.nextInt();
        
        n_akhir = (nilai);
        
        if (n_akhir >= 86 && n_akhir <=100){
            grade = "A";
        }
        
        else if (n_akhir > 76 && n_akhir < 85){
            grade = "AB";
        }
        
        else if (n_akhir > 66 && n_akhir < 75){
            grade = "B";
        }
        
        else if (n_akhir > 51 && n_akhir < 65){
            grade = "C";
        }
        
        else if (n_akhir > 41 && n_akhir < 50){
            grade = "D";
        }
        
        else {
            grade = "E";
        }
        
        if (grade == "A" || grade == "B" || grade == "C"){
            System.out.println("n"+nama+"  memiliki nilai "+n_akhir+" = ("+grade+")"+""
                    + "ndan dinyatakan Lulus");
        }
        
        else {
            System.out.println("n"+nama+"  memiliki nilai "+n_akhir+" = ("+grade+")"+""
                    + "ndan dinyatakan Tidak Lulus");
        }  
        
    } 
}

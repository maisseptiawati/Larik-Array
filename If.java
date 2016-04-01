/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgif;

/**
 *
 * @author Ma'is
 */
import java.util.Scanner;
public class If {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner masukan = new Scanner (System.in);
        int nilai ;
        System.out.println("Masukan niali akhir mata kuliahnya : ");
        nilai = masukan.nextInt();
        if (nilai < 55)
            System.out.println("Mahasiswa tersebut tidak LULUS");
    }
   
}

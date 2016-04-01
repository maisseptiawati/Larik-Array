/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifelse;

/**
 *
 * @author Ma'is
 */
import java.util.Scanner;
public class IfElse {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner masukan = new Scanner(System.in);
        System.out.println("Masukan nilai mata kuliahnya :");
        int nilai = masukan.nextInt();
        if (nilai>=80)
            System.out.println("Nilainya A");
        else if (nilai >=70)
            System.out.println("Nilainya B");
        else if (nilai >=55)
            System.out.println("Nilainya C");
        else if (nilai >=40)
            System.out.println("Nilainya D");
         else 
            System.out.println("Nilainya E");
    }
    
}

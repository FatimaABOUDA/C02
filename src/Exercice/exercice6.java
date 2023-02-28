package Exercice;
import java.util.Scanner;

public class exercice6 {
    public static void main(String[] args) {
        System.out.println("Saisissez la température");
        Scanner sc = new Scanner(System.in);
        double temp = sc.nextDouble();
         if (temp >= 36 && temp <= 38)
         {
             System.out.println("OK");
         } 
         else 
         {
             System.out.println("Allez voir un médecin");
         }

    }
}

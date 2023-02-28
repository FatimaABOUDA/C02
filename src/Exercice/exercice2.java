package Exercice;
import java.util.Random;
import java.util.Scanner;

public class exercice2 {
    public static void main(String[] args) {
        System.out.println("Saisissez votre age : ");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        int tarif =0;
        if (age < 5)
        {
            tarif =2 ;
        } 
        else if (age <18 )
        {
            tarif =5 ;
        } 
        else
        {
            tarif = 9;
        }
        System.out.println("le tarif est : " + tarif +"€");

    }
}

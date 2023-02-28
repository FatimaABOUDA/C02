package Exercice;

public class exercice3 {
    public static void main(String[] args) {
        boolean flag = true;
        System.out.println(flag);//vrai
        System.out.println(! flag);//faux
        boolean negation = ! flag;
        System.out.println("negation vaut : " + negation);//faux
        if (flag == true)
            System.out.println("1 - flag vaut true");//1-flag vaut true
        if (flag)
            System.out.println("2 - flag vaut true");//1-flag vaut true
        if (negation == false)
            System.out.println("3 - negation vaut false");//flag est fausse
        if (! negation == true)
            System.out.println("4- NOT negation vaut true");//flag vaut true
        if (! negation)
            System.out.println("5- NOT negation vaut true");//flag vaut true
    }
}

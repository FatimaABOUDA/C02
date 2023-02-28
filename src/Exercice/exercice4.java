package Exercice;

public class exercice4 {
    public static void main(String[] args) {
        boolean flag = true;
        boolean negation = false;
        if (flag && flag)
            System.out.println("6 - les deux sont true");
        if (flag && negation)
            System.out.println("7 - l'un des deux est false");
        if (negation && negation)
            System.out.println("8 - l'un des deux est false");
        if (flag || flag)
            System.out.println("9 - l'un ou l'autre est true");
        if (flag || negation)
            System.out.println("10 - l'un ou l'autre est true");
        if (negation || negation)
            System.out.println("11 - les deux sont false");
    }
}

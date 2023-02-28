package Exercice;

public class exercice5 {
    public static void main(String[] args) {
        System.out.println("Saisissez 3 nombres");
        int nb1 = sc.nextInt();
        int nb2 = sc.nextInt();
        int nb3 = sc.nextInt();
        int max = 0;
        if (nb1 < nb3 && nb2 < nb3)
        {
            max =nb1;
        }
    }
    else if (nb1 < nb2 && nb3 < nb2)
    {
        max =nb2;
    }
    else
    {
        max =nb3;
    }
    System.out.println("Le plus grand est " + max);
}
}

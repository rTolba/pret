package projet5;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        // Gagner plus de 3000 euros par moi

        int salaire;
        int experience;
        int pret = 3000;
        int deuxAnsExperience = 2;

        // demander le salaire

        System.out.println("Quelle est votre salaire mensuel ? ");
        Scanner clavier = new Scanner(System.in);
        salaire = clavier.nextInt();

        // demander combien d'année d'experience

        System.out.println("combien d'année d'experience avez-vous ");
        experience = clavier.nextInt();
        clavier.close();

        // condition

        if (salaire > pret) {
            System.out.println("Félicitation vous pouvez obtenir votre prêt !  ");
        } else if (salaire < pret) {
            System.out.println("Désolé votre salaire n'est pas assez élevé pour vous accordez votre prêt ");
        } else if (experience < deuxAnsExperience) {
            System.out.println("désolé vous n'avez pas assez d'experience  ");

        }
        if (experience > deuxAnsExperience) {
            System.out.println("Félicitation vous pouvez obtenir votre prêt !  ");
        }
    }
}

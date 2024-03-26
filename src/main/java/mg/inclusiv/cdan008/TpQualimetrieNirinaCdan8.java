/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package mg.inclusiv.cdan008;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import static mg.inclusiv.cdan008.TpQualimetrieNirinaCdan8.TriListeEntiers.trierListeCroissant;

/**
 *
 * @author Inclusiv Academy
 */
public class TpQualimetrieNirinaCdan8 {


    public class TriListeEntiers {

        //Création de la classe avec la méthode sort   
        public static void trierListeCroissant(List<Integer> liste) throws IllegalArgumentException {

            // Vérification si la liste ne contient pas d'entiers valides ou vide:
            if (liste == null || liste.isEmpty()) {
                throw new IllegalArgumentException("La liste ne contient pas de nombres entiers ou vide");
            }

            // pour trier la liste par ordre croissant:
            Collections.sort(liste);
        }
    }

    public static void main(String[] args) {

        // Saisir la liste des nombres entiers:
        Scanner scanner = new Scanner(System.in);
        List<Integer> listeEntiers = new ArrayList<>();

        //Affichage de la liste d'entiers:
        System.out.println("Entrez votre liste d'entiers (séparés par des virgules) :");
        String input = scanner.nextLine();

        // Traitement de l'entrée textuelle pour extraire les entiers
        String[] entiersStr = input.split(",");
        for (String entierStr : entiersStr) {
            try {
                int entier = Integer.parseInt(entierStr.trim());
                listeEntiers.add(entier);
            } catch (NumberFormatException e) {
                System.err.println("Erreur : '" + entierStr + "' n'est pas un entier valide, veuillez resaisir la liste !.");
            }
        }

        try {
            // Tri de la liste par ordre croissant
            trierListeCroissant(listeEntiers);

            // Affichage de la liste après le tri croissant
            System.out.println("Liste après le tri croissant : " + listeEntiers);

        } catch (IllegalArgumentException e) {
            // Gestion de l'erreur si la liste n'est pas un nombre entier ou vide
            System.err.println("Erreur : " + e.getMessage());
        }

        scanner.close();
    }

}

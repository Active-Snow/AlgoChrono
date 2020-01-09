/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package afpaalgo;

import java.util.Comparator;

/**
 *
 * @author Snow ya
 */
public class part3  {
    
    public static void exo1 (int val) {
        
        
        
        if ( val > 0) {
            System.out.println("Votre nombre est positif");
        }
        
        if ( val < 0) {
            System.out.println("Votre nombre est négatif");
        }
    }
    
    public static void exo2 (int a, int b) {
    
        if ( a > 0 && b > 0) {
            System.out.println("Le produit sera positif");
        }
        
        if ( a < 0 && b < 0 ) {
             
            System.out.println("Le produit sera positif");
        }
        
        if ( a < 0 && b > 0) {
            
             System.out.println("Le produit sera negatif");
        }
        
        if ( a > 0 && b < 0) {
            
             System.out.println("Le produit sera negatif");
        }
    }
    
    public static void exo3 (String A, String B, String C) {
        int comparaison1 ;
        comparaison1 = A.compareTo(B);
        int comparaison2 ;
        comparaison2 = B.compareTo(C);
        int comparaison3;
        comparaison3 = A.compareTo(C);
        
        
        if ( comparaison1 == 0 && comparaison2 ==0 ) {
            System.out.println( "Ce sont les mêmes chaines de caractères." );
        }
        if ( comparaison1 == 0 || comparaison2 == 0)
            System.out.println("Deux des trois chaines sont similaire");
        
        if (comparaison1 < 0 && comparaison2 < 0 && comparaison3 < 0 ) {
            System.out.println( "Les chaines de caractères sont dans l'ordre. Ou Similaire." );
        }
        
        else {
            System.out.println( "Les chaines de caractère ne sont pas dans le bonnes ordre." );
        }
        
    }
    
    public static  void exo4 (int a) {
        if ( a == 0) {
            System.out.println("Votre nombre est zero"); 
        }
        
        if ( a > 0) {
            System.out.println("Votre nombre est positif");
        }
        
        if ( a < 0) {
            System.out.println("Votre nombre est négatif");
        }
    }
    
    public static void exo5 (int a, int b){
        
        if (a == 0 || b == 0 ) {
            System.out.println("Le produit sera nul");
        }
        
        if ( a > 0 && b > 0) {
            System.out.println("Le produit sera positif");
        }
        
        if ( a < 0 && b < 0 ) {
             
            System.out.println("Le produit sera positif");
        }
        
        if ( a < 0 && b > 0) {
            
             System.out.println("Le produit sera negatif");
        }
        
        if ( a > 0 && b < 0) {
            
             System.out.println("Le produit sera negatif");
        }
        
    }
    
    public static void exo6 (int age) {
        if (age >= 6 && age <= 7) {
            System.out.println("catégorie = poussin");
        }
        if (age >= 8 && age <= 9) {
            System.out.println("catégorie = pupille");
        }
        if (age >= 10 && age <= 11) {
            System.out.println("catégorie = Minime");
        }
        if ( age >= 12) {
            System.out.println("Catégorie = Cadet");
        }
    }
    
}

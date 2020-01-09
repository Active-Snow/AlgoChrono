/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package afpaalgo;

/**
 *
 * @author Snow ya
 */
public class part4 {
    
    public static void exo1 (int tutu, int toto, String tata){
        
       if ( tata =="ok" || toto +4 < tutu  ) {
        tutu = tutu+1;
       }
        else {
                 tutu = tutu-1;
                }
    System.out.println("tutu"+tutu);
    System.out.println("toto"+toto);
    System.out.println("tata="+tata);
    
    }
    
    public static void exo2 (int H, int M) {
        // verif' validité Heures et minutes
        if (H < 0 || H > 23) {
            System.out.println("Heure Invalide");
        }
        if( M < 0 || M > 59) {
            System.out.println("Minute invalide");
        }
        
        //
        
        if ( M == 59) {
            if (H == 23) {
                M = 0;
                H = 0;
                System.out.println("Il  sera");
                System.out.println(H+":"+M);
            }
            M = 0;
            H = H +1;
            System.out.println("Il  sera");
           System.out.println(H+":"+M);
        }
        
        else {
            M = M + 1 ;
                System.out.println("Il  sera");
                System.out.println(H+":"+M);
        }
        
    }
    
    public static void exo3 (int H, int M, int S) {
         // verif' validité Heures et minutes
        if (H < 0 || H > 23) {
            System.out.println("Heure Invalide");
        }
        if( M < 0 || M > 59) {
            System.out.println("Minute invalide");
        }
        if ( S < 0 || S > 59 ) {
            System.out.println("Seconde invalide");
        }
        
        //
        if ( S == 59) {
            
            if ( M == 59) {
                
                if (H == 23) 
                    {
                        M = 0;
                        H = 0;
                        S = 0;
                        System.out.println("Il  sera");
                        System.out.println(H+":"+M +S);
                    }
            S = 0;
            M = 0;
            H = H +1;
            System.out.println("Il  sera");
                        System.out.println(H+":"+M +S);
        } 
             S = 0;
             M = M +1;
             System.out.println("Il  sera");
                        System.out.println(H+":"+M +S);
        }
        
        else {
            S = S + 1 ;
                System.out.println("Il  sera");
                        System.out.println(H+":"+M +S);
        }
    }
    public static void exo4 (double NB) {
    
      double fact;
      double fact2;
      double fact3;
    if ( NB == 0 ) {
        System.out.println("Aucune copie à faire");
    }
    
    if ( NB <= 10 ) {
        fact = 0.1 * NB;
        
         System.out.println("Facture de ="+fact);
    }
    
    if ( NB <= 30 ) {
        // 10 premier
        fact = 0.1 * 10;
        
       NB = NB - 10 ;
       // reste
       fact2 = 0.09 * NB;
       
       // retour affichage
       fact3 = fact + fact2;
       
       System.out.println("Facture de ="+fact3);
     }
   
    if ( NB > 30 ) {
        // 10 premier
        fact = 0.01 * 10;
        NB = NB - 10 ;
        
        // 20 après
        
       fact2 = 0.09 * 20 ;
       NB = NB - 20 ;
       
       // reste
       
       fact3 = 0.08 * NB;
       
       // affichage
       
       fact3 = fact + fact2 + fact3;
       System.out.println("Facture de ="+fact3);
    }
    }
    
    public static void exo5 (int age, boolean sexe) {
        // boolean sexe true = homme / false = femme
        
        if (age >20 && sexe ==true){
            System.out.println("Paye l'impot");
        }
        
        if (age > 18 && age <35 && sexe == false){
            System.out.println("Paye l'impot");
        }
        else{
            System.out.println("Paye pas d'impot");
        }
    }
    public static void exo6 (int cand1,int cand2, int cand3, int cand4) {
        
        double suffr;
        int totalsuff;
        
        totalsuff = cand1 + cand2 + cand3 + cand4;
        suffr = ( 100 * cand1) / totalsuff;
        
        if ( suffr >= 50) {
            System.out.println("élu dès le 1er tour");
        }
        if ( suffr < 12.5){
            System.out.println("Battu");
        }
        if ( suffr > 12.5) {
            if ( cand1 > cand2) {
                if ( cand1 > cand3) {
                    if ( cand1 > cand4) {
                        System.out.println("ballottage favorable");
                    }
                }
            }
            else {
                System.out.println("Ballottage défavorable");
            }
        }
    }
    public static void exo7 (int age, int permage, int respacc, int fidel) {
        
         if ( fidel >= 1){
             System.out.println("Tarif bleu");
         }
         if ( fidel < 1) {
             if ( age < 25 && permage < 2) {
                 if( respacc == 0) {
                     System.out.println("Tarif rouge");
                 }
                 else {
                     System.out.println("Non");
                 }
             }
             if (( age < 25 && permage > 2) || (age > 25 && permage < 2)) {
                 if( respacc == 0) {
                     System.out.println("Tarif orange");
                 }
                 if ( respacc == 1) {
                     System.out.println("Tarif rouge");
                 }
                 else {
                     System.out.println("Non");
                 }
             }
             if ( age > 25 && permage > 2) {
                 if ( respacc == 0) {
                     System.out.println("Tarif vert");
                 }
                 if( respacc == 1) {
                     System.out.println("Tarif orange");
                 }
                 if ( respacc == 2) {
                     System.out.println("Tarif rouge");
                 }
                 else {
                     System.out.println("Non");
                 }
             }
         }
        
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package afpaalgo;
import static java.lang.System.in;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author Snow ya
 */
public class part5 {
    
    public static void exo1 (int a)  {
         
        while ( a < 1 || a > 3) 
            {
            
               
                try 
                { 
                    BufferedReader reader =new BufferedReader(new InputStreamReader(System.in));
                    System.out.println("Mettez votre nombre ");
                    a = Integer.parseInt(reader.readLine());
                } 
                catch (IOException ex)
                {
                    Logger.getLogger(part5.class.getName()).log(Level.SEVERE, null, ex);
                }
 
                System.out.println("Votre nombre est: "+a);
            
               
                }
        
    
    System.out.println("Votre nombre est bon ! ");
}
    
    public static void exo2 (int a) {
        while ( a < 10 || a > 20) {
            try 
                { 
                    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
                    System.out.println("Mettez votre nombre ");
                    a = Integer.parseInt(reader.readLine());
                } 
                catch (IOException ex)
                {
                    Logger.getLogger(part5.class.getName()).log(Level.SEVERE, null, ex);
                }
            
            if ( a < 10) {
                 System.out.println("Plus grand !");
            }
            if ( a > 20){
                 System.out.println("Plus petit !");
            }
            
        }
        System.out.println("Votre nombre "+a+" est bien compris entre 10 et 20");
    }
    public static void exo3 (int a) {
        int n =0;
        System.out.println("le nombre est"+a);
        while ( n <10 ) {
          a = a + 1;
         System.out.println("le nombre précedent +1 = "+a);
         n = n + 1;
        }
    }
    
    public static void exo4 (int a) {
       int n = 0;
       
       while (n <= 10) {
           System.out.println(a*n);
           n = n +1;
       }
    }
    
    public static void exo5 (int a){
        int n = 0;
        int var = 0;
        
        while (n < a) {
            n = n +1;
            var = var + n;
            
        
        }
        System.out.println(var);
    }
    public static int exo6 (int a){
        /*int n = 1;
        int var = 1;
        
        while (n <= a) {
           
            var = var * n;
             n = n +1;
        
        }
        return var;*/
        int f = 1;
        for (int i=1; i<=a; i++){
        f=f*i;}
        return(f);
    }
    public static void exo7 (int var) throws IOException {
     int  a, n, nod = 1;
     n = 1 ;
     
     while ( n < 20){
                    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
                    System.out.println("Mettez votre nombre ");
                    a = Integer.parseInt(reader.readLine());
                    if ( a > var ) {
                        var = a ;
                        nod = n ;
                    }
                    
     }
     System.out.println("la plus grande"+var);
     System.out.println("la position"+nod);
    }
    public static void exo8 (int var) throws IOException {
         int  a = 1 , n, nod = 1;
         n = 1 ;
     
     while ( a != 0){
                    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
                    System.out.println("Mettez votre nombre ");
                    a = Integer.parseInt(reader.readLine());
                    if ( a > var ) {
                        var = a ;
                        nod = n ;
                    }
                    
     }
     System.out.println("la plus grande"+var);
     System.out.println("la position"+nod);
    }
    
    public static void exo10 (int nb_chev_part, int nb_chev_jouer) {
     int fact_chev_jouer;
     int fact_chev_part;
     int fact_1;
     int fact_2;
     int x;
     int y;
     
     fact_2 = nb_chev_part - nb_chev_jouer;
     fact_chev_jouer = part5.exo6(nb_chev_part);
     fact_chev_part = part5.exo6(nb_chev_jouer);
     fact_1 = part5.exo6(fact_2);
     
     
     
     x = fact_chev_part / fact_1 ;
     y = fact_chev_part / (fact_chev_jouer * fact_1 );
     
     System.out.println("Dans l’ordre : une chance sur"+x+ "de gagner");
     System.out.println("Dans le désordre : une chance sur"+y+" de gagner");
     
    }
    public static void exo10_2 (int n, int p) {
        int i, A, B;
         A = 1;
         B = 1 ;
          for ( i = 1; i <= p; i++ ){
              A = A * ( i + n - p);
              B = B * i;
          }
           System.out.println("Dans l’ordre : une chance sur "+A+ " de gagner");
           System.out.println("Dans le désordre : une chance sur "+B+" de gagner");
    }
}
        
    


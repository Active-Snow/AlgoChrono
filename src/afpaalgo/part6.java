/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package afpaalgo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Snow ya
 */
public class part6 {
    
    public static void exo1 () {
        int tabint[] = {0,0,0,0,0,0,0};
        for (int i = 0; i < tabint.length; i++ ) {
          System.out.println(i +" du tableau nous avons = " + tabint[i]);
        }
        
    }
    
    public static void exo2 () {
        char tabchar[] = {'a','e','i','o','u','y'};
        for (int i = 0; i < tabchar.length; i++ ) {
          System.out.println(i +" du tableau nous avons = " + tabchar[i]);
        }
    }
    
    public static void exo3 () throws IOException {
        int a;
       int[] tabnote = new int[9];
            for (int i = 0; i < tabnote.length; i++ ) {
                BufferedReader reader =new BufferedReader(new InputStreamReader(System.in));
                    System.out.println("Mettez votre nombre ");
                    a = Integer.parseInt(reader.readLine());
                    tabnote[i] = a;
            }
            
            for (int i = 0; i < tabnote.length; i++ ) {
            System.out.println(i +" du tableau nous avons = " + tabnote[i]);
            }
    }
    
    public static void exo4 () {
        int[] nb = new int[6];
        int i = 0;
        while ( i <= 5) {
            nb[i] = i*i;
            i = i + 1 ;
        }
        
            for ( i = 0; i < nb.length; i++ ) {
            System.out.println(i +" du tableau nous avons = " + nb[i]);
            }
        
    }
    /*public static void exo5 () {
        int[] N = new int[7];
        int i, k;
        k = 1;
        
        
        N[0] = 1;
        while (k <= 6 ) {
            N[k] =  N[k-1] +2;
        }
            for ( i = 0; i < N.length; i++ ) {
            System.out.println(i +" du tableau nous avons = " + N[i]);
            }
    }*/
    
    public static void exo6 () {
        int[] suite = new int[8];
        int i = 2 ;
        
        suite[0] = 1;
        suite[1] = 1;
        while ( i <= 7){
            suite[i] = suite[i-1] + suite[i-2];
            i = i +1;
        }
            for ( i = 0; i < suite.length; i++ ) {
            System.out.println(i +" du tableau nous avons = " + suite[i]);
            }
        
    }
    public static void exo7 () throws IOException {
    int a;
    int moy;
    moy = 0;
       int[] tabnote = new int[9];
            for (int i = 0; i < tabnote.length; i++ ) {
                BufferedReader reader =new BufferedReader(new InputStreamReader(System.in));
                    System.out.println("Mettez votre nombre ");
                    a = Integer.parseInt(reader.readLine());
                    tabnote[i] = a;
            }
            
            for (int i = 0; i < tabnote.length; i++ ) {
            System.out.println(i +" du tableau nous avons = " + tabnote[i]);
            }
            
            for (int i = 0; i < tabnote.length;i++) {
                moy = moy + tabnote[i];
            }
            moy = moy / tabnote.length;
            System.out.println("moyenne "+moy);
    }
    
    public static void exo8 (int nb) throws IOException{
        int pos;
        int neg;
        int netr;
        netr = 0;
        pos = 0;
        neg = 0;
        int a ;
        
        int[] tabnb = new int[nb];
         for (int i = 0; i < tabnb.length; i++ ) {
                BufferedReader reader =new BufferedReader(new InputStreamReader(System.in));
                    System.out.println("Mettez votre nombre ");
                    a = Integer.parseInt(reader.readLine());
                    tabnb[i] = a;
                    if ( a > 0) {
                        pos = pos +1;
                    }
                    if (a < 0 ) {
                        neg = neg +1;
                    }
                    else {
                        netr = netr +1;
                    }
            }
         System.out.println("positif = "+pos);
         System.out.println("negatif = "+neg);
         System.out.println("zero = "+netr);
    }
    
    public static void exo9 () {
        int sum;
        sum = 0;
       int tabsum[] = {1,2,3,4,5,6,7,8};
       for (int i = 0; i < tabsum.length;i++) {
                sum = sum + tabsum[i];
            }
       System.out.println("somme = "+sum);
    }
    
    public static void exo10() {
        int tab1[] = {4,8,7,9,1,5,4,6};
        int tab2[] = {7,6,5,2,1,3,7,4};
        int[] tabsum = new int[8];
        for (int i = 0; i < tab1.length;i++) {
               tabsum[i] = tab1[i] + tab2[i];
            }
        for (int i = 0; i < tabsum.length; i++ ) {
            System.out.println(i +" du tableau nous avons = " + tabsum[i]);
            }
    }
    
    public static void exo11() {
        int tab1[] = {4,8,7,12};
        int tab2[] = {7,6};
        int strch;
        strch = 0 ;
        for (int i = 0; i < tab2.length;i++) {
               for ( int n = 0; n < tab1.length;i++) {
                strch = strch + ( tab2[i] * tab1[n] );
                }
            }
        System.out.println("schtroumf = "+strch);
    }
    public static void exo12(int nb) throws IOException {
        int a;
    
        int[] tabnb = new int[nb];
         for (int i = 0; i < tabnb.length; i++ ) {
                BufferedReader reader =new BufferedReader(new InputStreamReader(System.in));
                    System.out.println("Mettez votre nombre ");
                    a = Integer.parseInt(reader.readLine());
                    tabnb[i] = a +1;
            }
         for (int i = 0; i < tabnb.length; i++ ) {
            System.out.println(i +" du tableau nous avons = " + tabnb[i]);
            }
    }
    public static void exo13 (int nb) throws IOException {
    int a;
    int n;
    int max ;
    
        int[] tabnb = new int[nb];
         for (int i = 0; i < tabnb.length; i++ ) {
                BufferedReader reader =new BufferedReader(new InputStreamReader(System.in));
                    System.out.println("Mettez votre nombre ");
                    a = Integer.parseInt(reader.readLine());
                    tabnb[i] = a;
            }
          max = tabnb[0];
          n = 0 ;
            for (int i = 1 ; i < tabnb.length; i++ ) {
                if ( max < tabnb[i]) {
                    max  = tabnb[i];
                    n = i;
                }
            }
            System.out.println(" plus grand nombre = "+max);
            System.out.println(" ça position = "+n);
    }
    
public static void exo14 (int nb) throws IOException {
    int a;
    int n;
    int moy ;
    moy = 0;
    n = 0;
        int[] tabnb = new int[nb];
         for (int i = 0; i < tabnb.length; i++ ) {
                BufferedReader reader =new BufferedReader(new InputStreamReader(System.in));
                    System.out.println("Mettez votre nombre ");
                    a = Integer.parseInt(reader.readLine());
                    tabnb[i] = a;
            }
         for (int i = 0; i < tabnb.length;i++) {
                moy = moy + tabnb[i];
            }
            moy = moy / tabnb.length;
         for (int i = 0 ; i < tabnb.length; i++ ) {
                if ( moy < tabnb[i]) {
                    
                    n = n + 1;
                }
            }
          System.out.println(" plus grand nombre = "+moy);
            System.out.println(" ça position = "+n);
}
}

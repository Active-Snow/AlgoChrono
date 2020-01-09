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
public class part1 {
    /* exo 1 */
    
    public static void exo1 () {
          int a = 1;
          int b = a + 3;
          a = 3;
          System.out.println("a = "+a); 
          System.out.println("b ="+b);
        //a = 3
        //b = 4
      } 
    
    public static void exo2 () {
         int a = 5;
         int b = 3;
         int c = a + b;
         a = 2;
         c = b - a;
         System.out.println("a ="+a);
         System.out.println("b ="+b);
         System.out.println("c ="+c);
         // a = 2
         // b = 3
         // c = 1
         
    }
    public static void exo3 () {
        int a = 5;
        int b = a + 4;
         a = a + 1;
         b = a - 4;
         System.out.println(" a ="+a);
         System.out.println(" b = " +b);
         // a =  6 
         // b =  2     
    }
    public static void exo4 () {
        int a = 3;
        int b = 10;
        int c = a + b;
        b = a + b;
        a = c ;
        System.out.println(" a ="+a);
        System.out.println(" b ="+b);
        System.out.println(" c ="+c);
        // a = 13
        // b = 13
        // c = 13
    }
    public static void exo5 () {
        int a = 5;
        int b = 2;
        a = b ;
        b = a ;
        System.out.println("a ="+ a);
        System.out.println(" b ="+ b);
        // a = 2
        // b = 2    
    }
    
    public static int exo6 (int a, int b) {
        int c;
        
        c = a;
        a = b;
        b = c;
        
        return a + b;
    }
    
    public static int exo7 (int a, int b, int c) {
        int d;
        int e;
        int f;
        
         d = b ;
         e = c;
         f = a;
         
         a = e;
         b = f ;
         c = d ;
                
        return a + b + c;
          }
    public static String exo8 () {
        String a =" 423 ";
        String b = "12";
        String c = a + b ;
        
        return c;
        // c = " 42312"
   }
    
    public static String exo9() {
        String a ="432";
        String b ="12";
        String c =a + b;
        
        return c;
        // meme resultat que exo8
    }
}

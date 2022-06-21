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
public class part2 {
    
    public static void exo1 () {
        int val = 231;
        int doble = val * 2;
        System.out.println("valeur ="+val);
        System.out.println("double ="+ doble);
    }
    public static void exo2 (int a) {
        a = a*a;
        
        System.out.println("a au carré = "+ a);
    }
    
    public static void exo3 (double HT, double nbr) {
        double vol = HT * nbr;
        double tva = 0.2;
        double totaltva = vol * tva;
        double ttotal = totaltva + HT;
         
        System.out.println(" le prix HT est  "+ HT);
        System.out.println("LE nombre d'article est"+ nbr);
        System.out.println("La tva est de  "+ tva);
        System.out.println("prix total HT"+ vol);
        System.out.println("prix total de la tva "+ totaltva);
        System.out.println("prix total avec tva "+ ttotal);
    }
    
    public static void exo4 () {
        String A = " belle marquise, vos beaux yeux me font mourir d’amour" ;
        String B = "  belle marquise, ";
        String C = " vos beaux yeux ";
        String D = " me font mourir";
        String E = "d’amour ";
        
        System.out.println("Phrase de base "+ A);
        System.out.println("1ere version "+ B + C + E+ D);
        System.out.println("2em version "+ C + B + D +E);
        System.out.println("3eme version "+ D + E + B + C);
        System.out.println("4eme version "+ D + C + B + E);
    }
}

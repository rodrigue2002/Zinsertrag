import java.util.*;
import java.text.DecimalFormat;
public class Zinsertrag{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Wieviel Geld zahlen Sie ein? " );
        double betrag = sc.nextDouble();
        System.out.print("Wie hoch ist der Zinssatz? " );
        double a = sc.nextDouble();
        betrag(betrag, a);
    }


    public static void betrag(double betrag, double a){
        DecimalFormat df = new DecimalFormat("0.00");
        for(int i = 0 ; i < 5; i++){
        double b = betrag * a/100;
        betrag += betrag * a/100; 
        System.out.println("Jahr " + (i+1) + " Zinsertrag : " + df.format(b) + " Kontostand : " + df.format(betrag));
        }    
    }
}

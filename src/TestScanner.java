import java.util.Scanner;

public class TestScanner {

    public static void main(String[] args) {
        Scanner entree = new Scanner(System.in);

        int nombre = 0;
        float somme = 0;
        
        System.out.print("Donner les nombres (terminer par -1): ");
        float x = entree.nextFloat();
        while (x >= 0) {
            somme += x;
            nombre++;
            x = entree.nextFloat();         
        }
        
        System.out.println("moyenne: " + somme / nombre);
    }
}


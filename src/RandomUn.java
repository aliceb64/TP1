public class RandomUn {

    public static void main(String[] args) {
        int nombre = 100000;
        double somme = 0;
        double sommeCarres = 0;
        
        for (int i = 0; i < nombre; i++) {
            double x = Math.random();
            somme += x;
            sommeCarres += x * x;
        }
        double moyenne = somme / nombre;
        double ecart = Math.sqrt(sommeCarres / nombre - moyenne * moyenne);
        
        System.out.println("moyenne " + moyenne + ", ecart-type " + ecart);
    }
    
    /*
     * La documentation officielle présente la fonction Math.random() comme une manière simple 
     * d’utiliser une instance de la classe plus complète java.util.Random mais, à défaut 
     * d’information plus précise, il faut penser que les algorithmes utilisés par Math.random() 
     * et unObjetRandom.nextDouble() sont les mêmes.
     */
}

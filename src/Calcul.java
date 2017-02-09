public class Calcul {

    public static void main(String[] args) {
        if (args.length < 3) {
            System.out.println("Emploi: java Calcul <nombre> <opérateur> <nombre>");
            return;
        }
        double nb1 = Double.parseDouble(args[0]);
        double nb2 = Double.parseDouble(args[2]);
        double calcul = 0;
        switch (args[1].charAt(0)) {
        case '+':
            calcul = nb1 + nb2;
            break;
        case '-':
        	calcul = nb1 - nb2;
            break;
        case '*':
            calcul = nb1 * nb2;
            break;
        case '/':
            calcul = nb1 / nb2;
            break;
        }
        System.out.println(nb1 + " " + args[1] + " " + nb2 + " = " + calcul);
    }
}

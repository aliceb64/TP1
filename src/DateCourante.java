import java.text.*;
import java.util.*;

public class DateCourante {

    public static void main(String[] args) {
        // première manière
        long t = System.currentTimeMillis() / 1000;
        System.out.println("maintenant: " + t + " secondes depuis le 1/01/1970");
        
        // deuxième manière
        Date d = new Date();
        System.out.println("maintenant: " + d);
        
        // troisième manière
        String[] jour = { null, "Dimanche", "Lundi", "Mardi", "Mercredi", "Jeudi", "Vendredi", "Samedi" };
        String[] mois = { "janvier", "février", "mars", "avril", "mai", "juin", "juillet", "août", "septembre", "octobre", "novembre", "décembre" };
        
        Calendar c = Calendar.getInstance();
        System.out.println("maintenant: " + c.get(Calendar.HOUR) + " heures " 
                + c.get(Calendar.MINUTE) + ", le "
                + jour[c.get(Calendar.DAY_OF_WEEK)] + " " 
                + c.get(Calendar.DAY_OF_MONTH) + " "
                + mois[c.get(Calendar.MONTH)] + " " + c.get(Calendar.YEAR));
        
        // quatrième manière (deux exemples)
        DateFormat f = new SimpleDateFormat();
        System.out.println("maintenant: " + f.format(d));
        
        f = new SimpleDateFormat("dd MMMMM yyyy HH:mm");
        System.out.println("maintenant: " + f.format(d));
    }
} 

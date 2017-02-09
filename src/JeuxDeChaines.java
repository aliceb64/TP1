public class JeuxDeChaines {

	public static void main(String[] args) {
		int i = Integer.valueOf(args[0]);
		String s1 = args[1];
		String s2 = args[2];

		/* A */
		String s = String.valueOf(i);
		System.out.println("résultat: \"" + s + "\"");

		/* B */
		i = Integer.parseInt(s);
		System.out.println("résultat: " + i);

		/* C */
		double x = Double.parseDouble(s) + 1;
		System.out.println("résultat: " + x);

		/* D */
		System.out.println("Chaine lue '" + s1 + "'");
		s = s1.trim();
		System.out.println("Chaine nette '" + s + "'");
		s = s.toUpperCase();
		System.out.println("Chaine capitalisée '" + s + "'");

		/* E */
		System.out.print("elles commencent par la meme lettre? ");
		if (s1.length() > 0 && s2.length() > 0 && s1.charAt(0) == s2.charAt(0))
			System.out.println("oui");
		else
			System.out.println("non");

		/* F */
		System.out.println("s1 == s2  : " + (s1 == s2));
		System.out.println("s1.equals(s2) : " + s1.equals(s2));
		System.out.println("s1.compareTo(s2) : " + s1.compareTo(s2));
		System.out.println("s1.compareToIgnoreCase(s2) : " + s1.compareToIgnoreCase(s2));

		/* G */
		System.out.println("'" + s1 + "' commence par '" + s2 + "' : " + s1.startsWith(s2));
		System.out.println("'" + s1 + "' finit par '" + s2 + "' : " + s1.endsWith(s2));
		System.out.println("'" + s1 + "' contient '" + s2 + "' : " + s1.contains(s2));
		System.out.println("'" + s1 + "' contient '" + s2 + "' : " + (s1.indexOf(s2) >= 0));

		/* H */
		i = s1.indexOf(s2);
		if (i >= 0)
			s1 = s1.substring(0, i) + s1.substring(i + s2.length());
		System.out.println("s1 sans s2 : '" + s1 + "'");

		/* I */
		if (!(s1.equals("bonjour") && s2.equals("bonjour")))
			System.out.println("Suivez les instructions!");
		else {
			System.out.println("s1.equals(s2) est " + s1.equals(s2));

			System.out.println("\ns1 == s2 est " + (s1 == s2));
			System.out.println("s1 == \"bonjour\" est " + (s1 == "bonjour"));

			System.out.println("\non fait s1 = s1.intern()");
			s1 = s1.intern();

			System.out.println("s1 == s2 est encore " + (s1 == s2));
			System.out.println("mais s1 == \"bonjour\" est deja " + (s1 == "bonjour"));

			System.out.println("\non fait s2 = s2.intern()");
			s2 = s2.intern();
			System.out.println("enfin, même s1 == s2 est " + (s1 == s2));
		}
	}
}

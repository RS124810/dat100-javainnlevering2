package no.hvl.dat100.lab5.tabeller;

public class Tabeller {

	// a)
	public static void skrivUt(int[] tabell) {
		
		// TODO
		//throw new UnsupportedOperationException("skrivUt ikke implementert");
		for (int i=0; i <tabell.length; i++) {
			
			System.out.print(tabell [i] +(" "));	
		}

	}

	// b)
	public static String tilStreng(int[] tabell) {

		// TODO
		//throw new UnsupportedOperationException("tilStreng ikke implementert");
		String tab= "[";
			
		for (int i=0; i <tabell.length; i++) {
			if (i < tabell.length-1) {
				tab += tabell[i]+",";
			}else {
				tab += tabell[i];
			}
					
		}
		tab +="]";
		return tab;
	}

	// c)
	public static int summer(int[] tabell) {

		// TODO
		throw new UnsupportedOperationException("summer ikke implementert");
	}

	// d)
	public static boolean finnesTall(int[] tabell, int tall) {

		// TODO
		throw new UnsupportedOperationException("finnesTall ikke implementert");
	}

	// e)
	public static int posisjonTall(int[] tabell, int tall) {

		// TODO
		throw new UnsupportedOperationException("posisjonTall ikke implementert");

	}

	// f)
	public static int[] reverser(int[] tabell) {

		// TODO
		throw new UnsupportedOperationException("reverser ikke implementert");
		
	}

	// g)
	public static boolean erSortert(int[] tabell) {

		// TODO
		throw new UnsupportedOperationException("erSortert ikke implementert");
	}

	// h)
	public static int[] settSammen(int[] tabell1, int[] tabell2) {

		// TODO
		throw new UnsupportedOperationException("settSammen ikke implementert");
	}
}

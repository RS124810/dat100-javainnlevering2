package no.hvl.dat100.lab5.tabeller;

public class Tabeller {

	// a)
	public static void skrivUt(int[] tabell) {
		
		for (int i=0; i <tabell.length; i++) {
			
			System.out.print(tabell [i] +(" "));	
		}

	}

	// b)
	public static String tilStreng(int[] tabell) {

		String tab= "[";
			
		for (int i=0; i <tabell.length; i++) {
			if (i < tabell.length-1) {
				tab += tabell[i]+",";
			}else{
				tab += tabell[i];
				}
					
		}
		tab +="]";
		return tab;
	}

	// c)
	public static int summer(int[] tabell) {
		
	// For-løkke
		int summer=0;
		
		for (int i=0;i<tabell.length;i++) {
			summer +=tabell[i];
		}
		return summer;
	}
	// While-løkke
		//		int sum =0;
		//		int i =0;
		//		while ( i < tabell.length ) {
		//			sum +=tabell[i];
		//			i++;
		//		}
	
	// Utvidet for-løkke
		//		int sum =0;
		//		for (int i: tabell) {
		//			sum +=i;
		//		}
	
	// d)
	public static boolean finnesTall(int[] tabell, int tall) {

		boolean svar = false;
		for (int i: tabell) {
			if (i == tall) {
				svar = true;
				return svar;
			}else{
				svar = false;					
				}
		}
		return svar;
	}

	// e)
	public static int posisjonTall(int[] tabell, int tall) {
		
		int x=0;
		for (int i: tabell) {
			if (i == tall) {
				return x;
			}else{
				x++;
				}
		}
		return x=-1;
	}

	// f)
	public static int[] reverser(int[] tabell) {

		final int ant = tabell.length;
		int []tab = new int [ant];
		int I =0;
		for (int i=tabell.length-1; i >=0; i--) {
			tab[I] =tabell[i];
			I++;
		}
		return tab;
	}

	// g)
	public static boolean erSortert(int[] tabell) {

		boolean svar = false;
		
		for (int i=0; i<tabell.length-1; i++) {
			if (tabell[i]<=tabell[i+1]){
				svar = true;
				return svar;
			}
		}
		if (tabell.length<=1) {
			svar = true;
		}
		return svar;
				
	}

	// h)
	public static int[] settSammen(int[] tabell1, int[] tabell2) {
		
		int L = tabell1.length+tabell2.length;
		int []tab= new int[L];
		for (int i=0; i<tabell1.length;i++) {
			tab[i]=tabell1[i];
		}
		for (int j=0; j<tabell2.length;j++) {
			tab[tabell1.length+j]= tabell2 [j];
		}
		return tab;
		
	}
}

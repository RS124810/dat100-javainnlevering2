package no.hvl.dat100.lab6.matriser;

public class Matriser {

	// a)
	public static void skrivUt(int[][] matrise) {
	
		for (int[] i:matrise) {
			for (int j:i) {
				System.out.print(j);
			}
			System.out.println();
		}
		
	}

	// b)
	public static String tilStreng(int[][] matrise) {
		
		String tab = "";
		for (int[]i:matrise) {
			for (int j:i) {
				tab += j+" ";
			}
			tab +="\n";
		}
		return tab;
		
	}

	// c)
	public static int[][] skaler(int tall, int[][] matrise) {
		
		int [][] skalert= new int [matrise.length][matrise[0].length];
		
		for (int i=0; i<matrise.length;i++) {
			for (int j=0; j<matrise[i].length;j++) {
				skalert[i][j]= matrise[i][j]*tall;
			}
		}
		return skalert;
		
	}

	// d)
	public static boolean erLik(int[][] a, int[][] b) {
		int matA=0;
		int matB=0;
		
		for (int []i:a) {
			for (int j:i) {
				matA +=j;
			}
		}
		for (int[]x:b) {
			for (int y:x) {
				matB +=y;
			}
		}
		if (matA==matB) {
			return true;
		}else {
			return false;
		}
		
	}
	
	// e)
	public static int[][] speile(int[][] matrise) {
		int a [][]= matrise;
        int rad = a.length;
		
        for (int i = 0; i < rad; i++){
            for (int j = i; j < rad; j++){
                int temp = a [i][j];
                a [i][j] = a[j][i];
                a [j][i] = temp;
            }
        }
        return a;
		
		
	}

	// f)
	public static int[][] multipliser(int[][] a, int[][] b) {
		
		int c[][]= new int [a.length][a[0].length];
		
		for(int i=0;i<a.length;i++){  
			for(int j=0;j<a.length;j++){  
			   
				for(int k=0;k<a.length;k++){    
					c[i][j]+=a[i][k]*b[k][j];  
				}
			}
		}
		return c;
	}
		
	
}


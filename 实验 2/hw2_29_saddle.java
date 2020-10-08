//find the saddle; ²»¿¼ÂÇ¸ºÊý

import java.util.Scanner;

public class hw2_29_saddle {

	static final int INF = 0x3f3f3f3f;
	
	static int saddle(int a[][], int n, int m) {
		int sad = -1;
		for(int i = 0; i < n; i++) {
			int rmax = -1, maxpos = 0;
			int cmin = INF, minpos = 0;
			for(int j = 0; j < m; j++) 
				if(a[i][j] > rmax) {rmax = a[i][j]; maxpos = j;} 
			for(int ii = 0; ii < n; ii++) 
				if(a[ii][maxpos] < cmin) {cmin = a[ii][maxpos]; minpos = ii;}
			if(minpos == i) sad = a[minpos][maxpos];
		}
		return sad;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int a[][] = new int[n][m];
		for(int i = 0; i < n; i++)
			for(int j = 0; j < m; j++)
				a[i][j] = sc.nextInt();
		int sad = hw2_29_saddle.saddle(a, n, m);
		System.out.println(sad);
		System.out.println("\nCharxy@FJNU, 20-10-02");
	}
	
}

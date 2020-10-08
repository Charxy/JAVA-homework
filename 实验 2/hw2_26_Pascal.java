//Pascal triangle by array[]
import java.util.Scanner;

public class hw2_26_Pascal {
	
	//print blank
	static void blk(int n) {for(int i = 0; i < n; i++) System.out.print("  ");}
	
	//print prt[], add pls[] 
	static void solve(int i, int prt[], int pls[]) {
		for(int j = 0; j <= i; j++) {
			System.out.printf("%-4d", prt[j]);
			pls[j+1] = prt[j] + prt[j+1]; 
		}
		pls[i+1] = 1;
	}
	
	static void yh(int n) {
		if(n <= 0) {System.out.println("error"); return ;}
		hw2_26_Pascal.blk(n);
		System.out.println("1");
		if(n == 1) return ;
		int even[] = new int[n+2];
		int odd[] = new int[n+2];
		even[0] = 1;
		even[1] = 2;
		even[2] = 1;
		odd[0] = 1;
		for(int i = 2; i <= n; i++) {
			hw2_26_Pascal.blk(n-i);
			if(i%2 == 0) 
				hw2_26_Pascal.solve(i, even, odd);
			else 
				hw2_26_Pascal.solve(i, odd, even);
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		hw2_26_Pascal.yh(n);
		System.out.println("\nCharxy@FJNU, 20-09-30");
	}
	
}
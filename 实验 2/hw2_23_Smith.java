
//Math.sqrt(): return double
//final static double PI = 3.14

public class hw2_23_Smith {
	final static int MAXN = 10000;
	
	// sum of each digit
	static int each(int n) {
		int ans = 0, tmp = n;
		while(tmp > 0) {
			ans += tmp%10;
			tmp /= 10;
		}
		return ans;
	}
	
	// is prime
	static boolean isp(int n) {
		int lmt = (int)Math.sqrt(n);
		for(int i = 2; i < lmt; i++)
			if((n%i) == 0) return false;
		return true;
	}

	// decomposit, sum
	static int decom(int n) {
		int lmt = (int)Math.sqrt(n), ans = 0;
		for(int i = 2; i <= lmt; ) {
			if(n%i == 0 && hw2_23_Smith.isp(i)) {	//factor && prime
				ans += hw2_23_Smith.each(i);
				n /= i;
			}
			else i++;	//repeated factors
		}
		return ans;
	}
	
	public static void main(String args[]) {
		for(int i = 4; i <= MAXN; i++) {
			if(hw2_23_Smith.each(i) == hw2_23_Smith.decom(i))
				System.out.println(i);
		}
		System.out.println("\nCharxy@FJNU, 20-09-27");
	}
}

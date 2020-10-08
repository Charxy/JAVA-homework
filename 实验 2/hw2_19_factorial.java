//factorial by for/while/dfs
public class hw2_19_factorial {

	static long fffor(int n) {
		long ans = 1;
		for(int i = 2; i <= n; i++) ans *= i;
		return ans;
	} //for
	
	static long wwwhile(int n) {
		long ans = 1, i = 1;
		while(i<n) {i++; ans *= i;}
		return ans;
	} //while
	
	static long dowhile(int n) {
		long ans = 1, i = 1;
		do {i++; ans *= i;} while(i < n);
	return ans;
	} //do while
	
	static long dfs(int n) {
		if(n == 1) return 1;
		else return dfs(n-1) * n;
	}
	
	public static void main(String[] args) {
		int a = 5;
		System.out.println(hw2_19_factorial.fffor(a));
		System.out.println(hw2_19_factorial.wwwhile(a));
		System.out.println(hw2_19_factorial.dowhile(a));
		System.out.println(hw2_19_factorial.dfs(a));
	}

}

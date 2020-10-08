//palindromic judging
import java.util.Scanner;

public class hw2_36_palinfromic {

	static void judge(char[] s) {
		for(int i = 0; i < s.length; i++) {
			if(s[i] != s[s.length-1-i]) {
				System.out.println("no");
				return;
			}
		}
		System.out.println("yes");
	}
	
	public static void main(String[] args) {
		System.out.println("\nCharxy@FJNU, 20-10-06");
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			String str = sc.next();
			char[] s =  str.toCharArray();
			hw2_36_palinfromic.judge(s);
		}
	}
}

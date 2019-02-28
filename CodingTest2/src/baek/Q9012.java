package baek;

import java.util.Scanner;
import java.util.Stack;

public class Q9012 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Stack<Character> stack = new Stack<>();
		

		String str = sc.next();
		
		for(int i=0;i<str.length();i++) {
			int ans = 0;
			str = sc.nextLine();
			
			if(str.charAt(i) == '(') {
				stack.push(str.charAt(i));
			}else {
				if(stack.isEmpty()) {
					System.out.println("NO");
					return;
				}
				stack.pop();
				ans++;
			}
		}
		if(!stack.isEmpty()) {
			System.out.println("NO");
			return;
		}
		System.out.println("YES");
	}
}

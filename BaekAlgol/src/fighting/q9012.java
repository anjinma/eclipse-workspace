package fighting;

import java.util.Scanner;

public class q9012 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		
		
		for(int i=0;i<count;i++) {
			String val = sc.next();
			int top = -1;
			
			for(int j=0;j<val.length();j++) {
				if(top < -1) {
					break;
				}
				if(val.substring(j, j+1).equals("(")) {
					top++;
				}else {
					top--;
				}
			}
			
			if(top == -1) {
				System.out.println("YES");
			}else {
				System.out.println("NO");
			}
			
		}
		
	}
}
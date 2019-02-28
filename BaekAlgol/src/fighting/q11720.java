package fighting;

import java.util.Scanner;

public class q11720 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cnt = sc.nextInt();
		String[] arr = new String[cnt];
		int sum=0;
		
		String str = sc.next();
		if(str.length() != cnt) {
			System.out.println("에러입니다");
		}else {
			arr = str.split("");
			
			for(int i=0;i<arr.length;i++) {
				sum += Integer.parseInt(arr[i]);
			}
			System.out.println(sum);
		}
	}
}

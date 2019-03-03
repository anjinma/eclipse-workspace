package fighting;

import java.util.Scanner;

public class q10799 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		String val = sc.next();
		char[] arr = new char[val.length()];
		int size = 0;
		
		int sum = 0;
		
		for(int i=0;i<val.length();i++) {
			if(val.charAt(i) == '(') {
				arr[size] = val.charAt(i);
				size++;
			}else {
				if(val.charAt(i-1) == '(') {
					size--;
					sum += size;
				}else {
					size--;
					// 여기서 헤맸다.... 막대기의 꼭다리 부분 하나를 더해 줘야 했다..
					sum += 1;
				}
			}
		}
		System.out.println(sum);
		
	}
}

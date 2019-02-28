package cafe24;

import java.util.Scanner;

public class threesixnine {

	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.print("값을 입력하시요:");
//		int num = sc.nextInt();
		boolean clap = false;
		
		for(int i=1;i<100;i++) {
			clap = calcul(i);
			
			if(clap == true) {
				System.out.println(i+" -> 박수");
			}else {
				System.out.println(i+" ->");
			}
			
		}
		
	}
	
	public static boolean calcul(int number) {
		String val = Integer.toString(number);
		String[] arr = new String[number];
		
		arr = val.split("");
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i].equals("3") ||arr[i].equals("6") ||arr[i].equals("9")) {
				return true;
			}
		}
		return false;
		
	}
}

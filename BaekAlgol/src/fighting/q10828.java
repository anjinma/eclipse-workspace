package fighting;

import java.util.Scanner;

public class q10828 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cnt = sc.nextInt();
		
		int[] arr = new int[cnt];
		int stkcnt = -1;
		String command = "";
		
		for(int i=0;i<cnt;i++) {
			command = sc.next();
			
			if(command.startsWith("pu")) {
				int value = sc.nextInt();
				stkcnt++;
				arr[stkcnt] = value;
			}else if(command.startsWith("po")) {
				if(stkcnt == -1) {
					System.out.println("-1");
				}else {
					System.out.println(arr[stkcnt]);
					stkcnt--;
				}
			}else if(command.startsWith("s")) {
				System.out.println(stkcnt+1);
			}else if(command.startsWith("e")) {
				if(stkcnt == -1) {
					System.out.println("1");
				}else {
					System.out.println("0");
				}
			}else if(command.startsWith("t")) {
				if(stkcnt == -1) {
					System.out.println("-1");
				}else {
					System.out.println(arr[stkcnt]);
				}
			}
		}
		
		
	}
}

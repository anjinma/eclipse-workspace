package fighting;

import java.util.Scanner;

public class StackResizing {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cnt = sc.nextInt();

		int[] arr = new int[3];
		int stkcnt = -1;
		String command = "";

		for(int i=0;i<cnt;i++) {
			command = sc.next();

			if(command.startsWith("pu")) {
				stkcnt++;
				if(stkcnt >= arr.length) {
					System.out.println("전 스택 사이즈:"+arr.length);
					int arrSize = arr.length+3;
					int[] temp = arr;
					arr = new int[arrSize];
					for(int k=0;k<stkcnt;k++) {
						arr[k] = temp[k];
					}
				}
				System.out.println("후 스택 사이즈:"+arr.length);
				int value = sc.nextInt();
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

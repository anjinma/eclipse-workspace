package baek;

import java.util.Scanner;

public class q2750 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int[] arr = new int[num];
		int min=0,temp=0,index=0;
		
		for(int i=0;i<num;i++) {
			arr[i] = scan.nextInt();
		}
		
		for(int i=0;i<num;i++) {
			min=1001;
			for(int j=i;j<num;j++) {
				if(min>arr[j]) {
					min=arr[j];
					index=j;
					System.out.println("min:"+min);
				}
			}
			temp = arr[i];
			arr[i] = arr[index];
			arr[index] = temp;
		}
		for(int i=0;i<num;i++) {
			System.out.println(arr[i]);
		}
	}
}

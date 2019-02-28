package baek;

import java.util.Scanner;

// 카운팅 정렬
public class q10989 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int[] data = new int[num];
		int[] count = new int[10000];
		
		for(int i=0;i<num;i++) {
			data[i] = sc.nextInt();
		}
		
		for(int i=0;i<10000;i++) {
			count[i]=0;
		}
		for(int i=0;i<num;i++) {
			count[data[i]]++;
		}
		for(int i=0;i<10000;i++) {
			if(count[i] != 0) {
				for(int j=0;j<count[i];j++) {
					System.out.println(i);
				}
			}
		}
	}
}

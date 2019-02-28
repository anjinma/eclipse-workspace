package baek;

import java.util.Scanner;

// 힙정렬
public class q2751 {
	static Scanner sc = new Scanner(System.in);
	static int num = sc.nextInt();
	static int[] arr = new int[num];

	public static void heap(int[] data, int number) {
		for(int i=1; i<number; i++) {
			int child = i;
			while(child > 0) {
				int parent = (child-1)/2;
				if(data[child] > data[parent]) {
					int temp = data[parent];
					data[parent] = data[child];
					data[child] = temp;
				}
				child = parent;
			}
		}
	}
	
	public static void main(String[] args) {
		for(int i=0;i<num;i++) {
			arr[i] = sc.nextInt();
		}

		heap(arr, num);
		
		for(int i=num-1;i>0;i--) {
			int temp = arr[0];
			arr[0] = arr[i];
			arr[i] = temp;
			
			heap(arr,i);
		}
		
		for(int t: arr) {
			System.out.println(t);
		}
	}
}

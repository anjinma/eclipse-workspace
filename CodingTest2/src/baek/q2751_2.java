package baek;

import java.util.Scanner;

// 힙정렬
public class q2751_2 {

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
		 Scanner sc = new Scanner(System.in);
		 int num = sc.nextInt();
		 int[] arr = new int[num];
		 
		for(int i=0;i<num;i++) {
			arr[i] = sc.nextInt();
		}

		for(int i=1; i<num; i++) {
			int child = i;
			while(child > 0) {
				int parent = (child-1)/2;
				if(arr[child] > arr[parent]) {
					int temp = arr[parent];
					arr[parent] = arr[child];
					arr[child] = temp;
				}
				child = parent;
			}
		}
		
		for(int i=num-1;i>0;i--) {
			int temp = arr[0];
			arr[0] = arr[i];
			arr[i] = temp;
			
			for(int j=1; j<num; j++) {
				int child = j;
				while(child > 0) {
					int parent = (child-1)/2;
					if(arr[child] > arr[parent]) {
						int temp2 = arr[parent];
						arr[parent] = arr[child];
						arr[child] = temp2;
					}
					child = parent;
				}
			}
		}
		
		for(int t: arr) {
			System.out.println(t);
		}
	}
}

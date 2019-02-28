package programmers;

import java.util.Arrays;
import java.util.Vector;

public class Solution3 {
    public int[] solution(int[] healths, int[][] items) {
        int[] answer = {};
        return answer;
    }
	
	public static void main(String[] args) {
		int[] answer = {};
		int[] healths= {200,120,150};
		int[][] items = {{30,100},{300,30},{100,400}};
		int temp1= 0;
		int temp2= 0;

		Arrays.sort(healths);
		//이차원배열 정렬
		for(int i=0;i<items.length-1;i++) {
			for(int j=i+1;j<items.length;j++) {
				
				if(items[i][1]>items[j][1]) {
					temp1 = items[i][0];
					temp2 = items[i][1];
					
					items[i][0] = items[j][0];
					items[i][1] = items[j][1];
					
					items[j][0] = temp1;
					items[j][1] = temp2;
				}
			}
		}

		for(int i=0;i<3;i++) {
			for(int j=0;j<2;j++) {
				System.out.print(i+","+j+":"+items[i][j]+"  ");
			}
			System.out.println();
		}
		
		for(int chp=0;chp<healths.length;chp++) {
			
			for(int itemhp=0;itemhp<items.length;itemhp++) {
				
				if(healths[chp]>items[itemhp][1]) {
					System.out.println("healths:"+healths[chp]+","+"itemshp:"+items[itemhp][1]);
					break;
				}
				
			}
			
		}
		
		
	}
	
	
}

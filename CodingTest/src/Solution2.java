import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class Solution2 {
	public static void main(String[] args) {
		
		int[] aa = {5,4,0,3,1,6,2};
		
		solution(aa);
	}
	
	public static int solution(int[] A) {
		int start = 0;
		int next = A[0];
		List<Integer> count= new ArrayList<>();
		List<Integer> newList = new ArrayList<>();
		int endcount = 0;
		int smallcount = 0;
		
		Arrays.sort(A);
		int[] B = A;
		
		while(endcount == A.length) {
			smallcount++;
			
			if(A[next] != start) {
				next = A[next];
			}
			if(A[next] == start) {
//				start = 다음으로 작은 인덱스의 변수 값;
				next = A[start];
				count.add(smallcount);
				smallcount=0;
			}
			for(int a : B) {
				if(A[next] == a) {
					
				}
			}
			endcount++;
			
		}
		return 0;
    }
	
}

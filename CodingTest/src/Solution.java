import java.util.Arrays;
import java.util.HashMap;

public class Solution {
	public static void main(String[] args) {
		int[] arr= {4,4,3,3,1,0};

		solution(arr);
	}

	public static int solution(int[] ranks) {
		HashMap<Integer , Integer> map = new HashMap<Integer , Integer>();
		int sum=0;
		Arrays.sort(ranks);
		
		for(int i=0;i<ranks.length;i++) {
			int count=1;
			for(int j=i+1;j<ranks.length;j++) {
				if(ranks[i] != ranks[j]) {
					break;
				}
				count++;
			}
			if(!map.containsKey(ranks[i])) {
				map.put(ranks[i],count);
			}
		}
		
		Object[] keys = map.keySet().toArray();
		Object[] values = map.values().toArray();
		
		for(int i=0;i<keys.length-1;i++) {
			for(int j=i+1;j<keys.length;j++) {
				int ival = (int) keys[i];
				int jval = (int) keys[j];
				if((ival+1) == jval) {
					sum+=(int)values[i];
				}
			}
		}
		
		return sum;
	}
}

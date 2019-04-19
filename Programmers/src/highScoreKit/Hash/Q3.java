package highScoreKit.Hash;

import java.util.HashMap;

public class Q3 {

	public static int solution(String[][] clothes) {
		int answer = 1;

		HashMap<String, Integer> map = new HashMap<>();

		for(int i=0;i<clothes.length;i++) {
			String key = clothes[i][1];

			if(!map.containsKey(key)) {
				map.put(key,1);
			}else {
				map.put(key, map.get(key)+1);
			}
			
			System.out.println("key:"+key);
			System.out.println("value:"+map.get(key));
			System.out.println("================");
		}
		
		for(Integer i : map.values()) {
			answer = answer*(i+1);
		}

		return answer-1;
	}

	public static void main(String[] args) {
		String[][] arr= {
				{"a","head"},
				{"b","head"},
				{"kk","body"}
		};

		System.out.println(solution(arr));
	}
}

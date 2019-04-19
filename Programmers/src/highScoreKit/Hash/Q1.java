package highScoreKit.Hash;

import java.util.HashMap;
class Q1 {
	public static String solution(String[] participant, String[] completion) {
		String answer = "";
		HashMap<String, Integer> hm = new HashMap<>();
		for (String player : participant) {
			hm.put(player, hm.getOrDefault(player, 0) + 1);
		}
		for (String player : completion) {
			hm.put(player, hm.get(player) - 1);
		}
		for (String key : hm.keySet()) {
			if (hm.get(key) != 0){ // value값을 찾는다
				answer = key;
			}
		}
		return answer;
	}
	
	public static void main(String[] args) {
		String[] p = {"leo","kiki","chan"};
		String[] c = {"kiki","chan"};
		String answer = solution(p, c);
		
		System.out.println(answer);
	}
}
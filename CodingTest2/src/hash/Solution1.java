package hash;

import java.util.HashMap;

class Solution1 {
	public static String solution(String[] participant, String[] completion) {
		String answer = "";
		HashMap<String, Integer> hm = new HashMap<>();
		for (String player : participant) {
			hm.put(player, hm.getOrDefault(player, 0) + 1);
		}
/*
getOrDefault()
일부의 경우에, 우리가 찾는 key를 가지지 않는 map이 있을 수 있다. 그러나 여전히 
value를 가지기 원하고 map이 변경되지 않기를 원하는 경우가 있다. 이런 경우에 
getOrDefault() 메소드를 사용할 수 있는데, 매우 유용하다.
*/
		hm.keySet().forEach(key -> System.out.println("key:"+key));
		hm.values().forEach(value -> System.out.println("value:"+value));

		for (String player : completion) {
			hm.put(player, hm.get(player) - 1);
		}
		System.out.println("=========================================");

		hm.keySet().forEach(key -> System.out.println("key:"+key));
		hm.values().forEach(value -> System.out.println("value:"+value));
		
		for (String key : hm.keySet()) {
			if (hm.get(key) != 0){ // value값을 찾는다
				answer = key;
			}
		}
		return answer;
	}

	public static void main(String[] args) {
		String[] p = {"leo", "kiki", "eden"};
		String[] c = {"kiki", "eden"};

		System.out.println(solution(p,c));
	}
}

/*
문제 설명
수많은 마라톤 선수들이 마라톤에 참여하였습니다. 단 한 명의 선수를 제외하고는 모든 선수가 마라톤을 완주하였습니다.
마라톤에 참여한 선수들의 이름이 담긴 배열 participant와 완주한 선수들의 이름이 담긴 배열 completion이 주어질 때, 
완주하지 못한 선수의 이름을 return 하도록 solution 함수를 작성해주세요.

제한사항
마라톤 경기에 참여한 선수의 수는 1명 이상 100,000명 이하입니다.
completion의 길이는 participant의 길이보다 1 작습니다.
참가자의 이름은 1개 이상 20개 이하의 알파벳 소문자로 이루어져 있습니다.
참가자 중에는 동명이인이 있을 수 있습니다.

입출력 예
participant	                                       completion	         return
[leo, kiki, eden]	                            [eden, kiki]	          leo
[marina, josipa, nikola, vinko, filipa]	[josipa, filipa, marina, nikola]  vinko
[mislav, stanko, mislav, ana]	           [stanko, ana, mislav]	      mislav
 */

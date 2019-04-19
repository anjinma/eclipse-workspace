package highScoreKit.Hash;

import java.util.HashMap;
import java.util.Vector;

public class Q4 {
	
    public static Vector<Integer> solution(String[] genres, int[] plays) {
        Vector<Integer> answer = new Vector<>();
        
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        for(int i=0;i<genres.length;i++) {
        	String key = genres[i];
        	
        	if(!map.containsKey(key)) {
        		map.put(key, plays[i]);
        	}else {
        		map.put(key, map.get(key)+plays[i]);
        	}
        }
        
        int big = 0;
        String bigkey = "";
        for(String kk:map.keySet()) {
        	if(big<map.get(kk)) {
        		big = map.get(kk);
        		bigkey = kk;
        	}
        }
        
        
        
        
        return answer;
    }
    
    public static void main(String[] args) {
    	String[] gen = {"c","p","c","p","c"};
    	int[] pl = {500,600,150,800,2500};
    	
    	System.out.println(solution(gen,pl));
    }

}

package programmers;

import java.util.Arrays;
import java.util.List;

public class Soulution2 {
    public static int solution(int[] people, int[] tshirts) {
        int answer = 0;
        Integer[] p = {};
        Integer[] t = {};
        for(int k : people) {
        	int i=0;
        	p[i] = k;
        	i++;
        }
        for(int k : tshirts) {
        	int i=0;
        	t[i] = k;
        	i++;
        }
        
        List<Integer> plist = Arrays.asList(p);
        List<Integer> tlist = Arrays.asList(t);
        System.out.println("test");
        for(Integer i:plist) {
        	System.out.println(i);
        }
        
        return answer;
    }
    
    public static void main(String[] args) {
    	int[] people = {2,3};
    	int[] tshirts = {1,2,3};
    	
        Integer[] p = {};
        Integer[] t = {};
        int i=0;
        int j=0;
        for(int k : people) {
        	p[i] = k;
        	i++;
        }
        for(int k : tshirts) {
        	
        	t[j] = k;
        	j++;
        }
        
        List<Integer> plist = Arrays.asList(p);
        List<Integer> tlist = Arrays.asList(t);
        System.out.println("test");
        for(Integer k:plist) {
        	System.out.println(k);
        }
    }
}

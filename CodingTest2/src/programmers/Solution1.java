package programmers;

import java.util.Vector;

public class Solution1 {
	class Solution {
	    public int solution(int n) {        
	        Vector<Integer> sosu = new Vector<Integer>();
			
			for(int i=2; i<=1000; i++) {
				boolean isSosu = true;
				for(int j=2; j*j<=i; j++) {
					if(i % j == 0) {
						isSosu = false;
						break;
					}
				}
				if(isSosu) {
					sosu.addElement(i);
				}
			}
			
			//int test = 33;
			int cntTest = 0;
			
			for(int i=0;i<sosu.size()-2;i++) {
				for(int j=i+1;j<sosu.size()-1;j++) {
					for(int k=j+1;k<sosu.size();k++) {
						int sum = sosu.elementAt(i)+sosu.elementAt(j)+sosu.elementAt(k);
						if(n == sum) {
							cntTest++;
						}
					}
				}
			}
	        
	        return cntTest;
	    }
	}
	
	public static void main(String[] args) {
		Vector<Integer> sosu = new Vector<Integer>();
		
		for(int i=2; i<=1000; i++) {
			boolean isSosu = true;
			
			for(int j=2; j*j<=i; j++) {
				if(i % j == 0) {
					isSosu = false;
					break;
				}
			}
			if(isSosu) {
				sosu.addElement(i);
			}
		}
		
		int test = 33;
		int cntTest = 0;
		
		for(int i=0;i<sosu.size()-2;i++) {
			for(int j=i+1;j<sosu.size()-1;j++) {
				for(int k=j+1;k<sosu.size();k++) {
					
					int sum = sosu.elementAt(i)+sosu.elementAt(j)+sosu.elementAt(k);
					if(test == sum) {
						cntTest++;
						System.out.println(sosu.elementAt(i)+","+sosu.elementAt(j)+","+sosu.elementAt(k));
					}
					
				}
			}
		}
		
		
		System.out.println(cntTest);
	}
}

package fighting;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class q11719 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<String> list = new ArrayList<>();
		int count =1;
		
		while(sc.hasNextLine()) {
			String val = sc.nextLine();
			
			if(val.length()>100 || count>100 || val.equals("end")) {
				break;
			}
			list.add(val);
			count++;
		}
		for(String t : list) {
			System.out.println(t);
		}
		
		sc.close();
	}
}

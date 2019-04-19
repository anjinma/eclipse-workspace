package fighting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Vector;

public class q1406 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String def=br.readLine();
		int count = Integer.parseInt(br.readLine());
		
		Vector<String> vec = new Vector<>();
		for(int i=0;i<def.length();i++) {
			vec.add(i,Character.toString(def.charAt(i)));
		}

		int top = def.length()-1;
		
		
		while(count-->0) {
			String command = br.readLine();
			
			if(command.equals("L")) {
				if(top!=-1) {
					top--;
				}
			}else if(command.equals("D")) {
				if(top!=vec.size()-1) {
					top++;
				}
			}else if(command.equals("B")) {
				if(top!=-1) {
					vec.remove(top);
					top--;
				}
			}else if(command.startsWith("P")) {
				if(top == vec.size()-1) {
					vec.addElement(command.substring(2));
					top++;
				}else {
					vec.add(top+1, command.substring(2));
					top++;
				}
			}else{
				System.out.println("잘못된 입력");
				count++;
			}
		}
		
		for(String t : vec) {
			System.out.print(t);
		}
	}
}

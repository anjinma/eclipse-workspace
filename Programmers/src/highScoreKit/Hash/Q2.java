package highScoreKit.Hash;

class Q2 {
    public static boolean solution(String[] phoneBook) {
        
        for(int i=0; i<phoneBook.length-1; i++) {
            for(int j=i+1; j<phoneBook.length; j++) {
                if(phoneBook[i].startsWith(phoneBook[j])) {return true;}
                if(phoneBook[j].startsWith(phoneBook[i])) {return true;}
            }
        }
        return false;
    }
    
    public static void main(String[] args) {
    	String[] arr = {"12","1345","29","43567","87777"};
    	System.out.println(solution(arr));
    }
    
}
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * 
 */

/**
 * @author BABAI
 *
 */
class EvenLengthPalindrome {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();             
        long a[] = new long[n];
        for(int i=0; i<n; i++) {
        	a[i] = s.nextLong();
        }
        a = calculateEvenPalindrome(a);
        
        for(long i : a) {
        	String str = new String(Long.toString(i));
        	HashMap<Character,Integer> map = new HashMap<Character,Integer>();
        	for(char c : str.toCharArray()){
        	if(map.containsKey(c)){
        		map.put(c, map.get(c)+1);
        	}
        	else{
        		map.put(c, 1);
        	}
        	}
        	
        	int max_occur = 0, count = 0;
            for(Map.Entry<Character,Integer> entry : map.entrySet()) {
            	if(entry.getValue() > count){
            		count = entry.getValue();
            		max_occur = Integer.parseInt(entry.getKey().toString());
            	}
            	else if(entry.getValue() == count) {
            		if(Integer.parseInt(entry.getKey().toString()) < max_occur){
            			max_occur= Integer.parseInt(entry.getKey().toString());
            		}
            	}
            }
            System.out.println(max_occur);
        }
        
        s.close();

	}
	
	static long[] calculateEvenPalindrome(long[] a) {
		for(int i=0; i<a.length; i++) {
			String str = new String(Long.toString(a[i]));
			StringBuilder sb = new StringBuilder(str);
			str = str + sb.reverse().toString();
			a[i] = Long.parseLong(str.toString());
        }
		return a;
	}

}

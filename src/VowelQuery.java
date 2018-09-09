import java.util.Scanner;

/**
 * 
 */

/**
 * @author BABAI
 *
 */
class VowelQuery {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

        //Scanner
        Scanner s = new Scanner(System.in);
        String name = s.nextLine();
        int N = s.nextInt();
        int val[] = new int[N];
        for(int i=0; i<N; i++){
        	val[i] = s.nextInt();
        }
        name = calculateXString(name, val);
        int Q = s.nextInt();
        int k[] = new int[Q];
        for(int i=0; i<Q; i++){
        	k[i] = s.nextInt();
        }
        s.close();
        for(int i=0; i<Q; i++){ 
        	if(k[i] > name.length()){
        		System.out.println(-1);
        	}
        	else{
        		System.out.println(name.charAt(k[i]-1));
        	}
        }
	}
	
	static String calculateXString(String str, int[] val) {
		String xString = new String();
		if(str != null && val != null) {
			for(int i=0; i<val.length; i++){
				if(val[i]>=0){
					xString = xString + str.substring(0, (Math.abs(val[i])+1));
				}
				else{
					xString = xString + str.substring(Math.abs(val[i]),str.length());
				}
			}
		}
		return xString;
	}

}

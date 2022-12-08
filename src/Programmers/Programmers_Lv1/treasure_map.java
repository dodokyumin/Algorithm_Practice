package Programmers.Programmers_Lv1;

public class treasure_map {

	public static void main(String[] args) {

		int n = 2;
		int[] arr1 = {0, 0};
		int[] arr2 = {2, 0};

		for (String i : solution(n, arr1, arr2)) {
			System.out.println("|" + i + "|");
		}

	}

	public static String[] solution(int n, int[] arr1, int[] arr2) {
        
    	String[] answer = new String[n];    	
    	
    	for(int i = 0; i < n; i++) {
    		String a1 = String.format("%0"+String.valueOf(n)+"d", Long.parseLong((Long.toBinaryString(arr1[i]))));
    		String a2 = String.format("%0"+String.valueOf(n)+"d", Long.parseLong((Long.toBinaryString(arr2[i]))));
    		System.out.println(a1 + " " + a2);
    		
    		StringBuffer sb = new StringBuffer();
    		
    		for(int j = 0; j < n; j++) {
    			if(a1.charAt(j) == a2.charAt(j) && a1.charAt(j) == '0') {
    				sb.append(" ");
    			} else {
    				sb.append("#");
    			}
    		}
    		
    		answer[i] = sb.toString();
    	}

        return answer;
    }
}

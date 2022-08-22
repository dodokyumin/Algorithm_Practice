package Programmers.Programmers_Lv1;

public class inner_product {

	public static void main(String[] args) {
		inner_product ip = new inner_product();
		int[] a = {1,2,3,4};
		int[] b = {-3,-1,0,2};
 		System.out.println(ip.solution(a, b));

	}
	 public int solution(int[] a, int[] b) {
	        int answer = 0;
	        
	        for(int i = 0; i < a.length; i++) {
	        	answer += a[i] * b[i];
	        }
	        
	        return answer;
	    }
}

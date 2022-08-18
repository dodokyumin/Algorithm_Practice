package Programmers.Programmers_Lv1;

public class gcd_and_lcm {

	public static void main(String[] args) {
		
		int n = 3;
		int m = 12;
		
		for(int item : solution(n, m)) {
			System.out.println(item);
		}
		
	}
	public static int[] solution(int n, int m) {
        int[] answer = new int[2];
        
        for(int i = n; i >= 1; i--) {
        	if(n % i == 0 && m % i == 0) {
        		answer[0] = i;
        		break;
        	}
        }
        
        for(int i = m; i <= n * m; i++) {
        	if(i % n == 0 && i % m == 0) {
        		answer[1] = i;
        		break;
        	}
        }
        
        return answer;
    }
}

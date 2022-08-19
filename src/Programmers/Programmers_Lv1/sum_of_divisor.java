package Programmers_Lv1;

public class sum_of_divisor {

	public static void main(String[] args) {
		sum_of_divisor sod = new sum_of_divisor();
		
		System.out.println(sod.solution(12));
	}
	public int solution(int n) {
        int answer = 0;
        
        for(int i = 1; i <= n; i++) {
        	if(n % i == 0) {
        		answer += i;
        	}
        }
        
        return answer;
    }
}

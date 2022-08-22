package Programmers.Programmers_Lv1;

public class sum_between_two_integers {

	public static void main(String[] args) {
		sum_between_two_integers sbti = new sum_between_two_integers();
		System.out.println(sbti.solution(5, 3));

	}
	public long solution(int a, int b) {
        long answer = 0;
        
        if(a > b) {
        	int tmp = a;
        	a = b;
        	b = tmp;
        }
        for(int i = a; i <= b; i++) {
        	answer += i;
        }
        
        return answer;
    }
}

package Programmers.Programmers_Lv1;

public class harshad_number {
	
	public static void main(String[] args) {
		
		System.out.println(solution(11));		

	}
	
	public static boolean solution(int x) {
        boolean answer = false;
        
        int mil = x / 10000;
        int tho = (x / 1000) % 10;
        int hun = (x / 100) % 10;
        int ten = (x /10) % 10;
        int one = x % 10;
        
        if(x % (mil + tho + hun + ten + one) == 0) {
        	answer = true;
        }
        return answer;
    }
	
}

package Programmers.Programmers_Lv1;

public class the_three_musketeers {

	public static void main(String[] args) {

		int[] number = {-3, -2, -1, 0, 1, 2, 3};
		
		System.out.println(solution(number));
	}
	
    public static int solution(int[] number) {
        int answer = 0;
        
        for(int i = 0; i < number.length; i++) {
        	for(int j = i + 1; j < number.length; j++) {
        		for(int k = j + 1; k < number.length; k++) {
        			
        			if(number[i] + number[j] + number[k] == 0) {
        				answer++;
        			}
        		}
        	}
        }
        
        return answer;
    }

}

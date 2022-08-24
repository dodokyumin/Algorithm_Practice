package Programmers.Programmers_Lv1;

import java.util.Arrays;

public class budget {

	public static void main(String[] args) {
		budget b = new budget();
		int[] d = {2, 2, 3, 3};
		int budget = 10;
		System.out.println(b.solution(d, budget));

	}
	
	public int solution(int[] d, int budget) {
        int answer = 0;
        
        Arrays.sort(d);
        
        for(int i = 0; i < d.length; i++) {
        	budget -= d[i];
        	if( budget < 0) {
        		break;
        	}
        	answer++;
        }
        
        return answer;
    }

}

package Programmers.Programmers_Lv1;

public class yin_plus_yang {

	public static void main(String[] args) {
		yin_plus_yang ypy = new yin_plus_yang();
		int[] a = {4,7,12};
		boolean[] b = {true,false,true};
		System.out.println(ypy.solution(a, b));

	}
	
	public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;
        
        for(int i = 0; i < absolutes.length; i++) {
        	if(signs[i]) {
        		answer += absolutes[i];
        	} else {
        		answer -= absolutes[i];
        	}
        }
        
        return answer;
    }

}

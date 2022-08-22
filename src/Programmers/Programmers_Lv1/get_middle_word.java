package Programmers.Programmers_Lv1;

public class get_middle_word {

	public static void main(String[] args) {
		get_middle_word gmw = new get_middle_word();
		System.out.println(gmw.solution("abcd"));

	}
	public String solution(String s) {
        String answer = "";
        
        if(s.length() % 2 == 0) {
        	answer = s.substring(s.length()/2-1, s.length()/2+1);
        } else {
        	answer = s.substring(s.length()/2, s.length()/2+1);
        }
        
        return answer;
    }
}

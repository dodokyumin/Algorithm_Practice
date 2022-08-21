package Programmers.Programmers_Lv1;

public class handle_string_basic {

	public static void main(String[] args) {
		handle_string_basic hsb = new handle_string_basic();
		System.out.println(hsb.solution("0000"));
		
	}
	public boolean solution(String s) {
        boolean answer = ((s.length() == 4 || s.length() == 6) && isItNum(s)) ? true : false;
        return answer;
    }
	private boolean isItNum(String s) {
		boolean answer = true; //49 ~57
		char[] charArr = s.toCharArray();
		for(char c : charArr) {
			if((int)c < 48 || (int)c > 57) {
				answer = false;
				break;
			}
		}
		return answer;
	}
	//정규식 활용
//	public boolean solution(String s) {
//        if (s.length() == 4 || s.length() == 6) return s.matches("(^[0-9]*$)");
//        return false;
//  }
}

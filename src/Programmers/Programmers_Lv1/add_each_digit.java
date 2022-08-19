package Programmers_Lv1;

public class add_each_digit {

	public static void main(String[] args) {
		add_each_digit aed = new add_each_digit();
		System.out.println(aed.solution(123));
	}

	public int solution(int n) {
        int answer = 0;
        for(int i = 0; i < String.valueOf(n).length(); i++)
        	answer += Character.getNumericValue(String.valueOf(n).charAt(i));
        
        return answer;
    }
}

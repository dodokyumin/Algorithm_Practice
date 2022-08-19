package Programmers_Lv1;

public class string_to_natural_number {

	public static void main(String[] args) {
		
		string_to_natural_number stnn = new string_to_natural_number();

		System.out.println(stnn.solution("+123"));
	}
	public int solution(String s) {
        
        return Integer.parseInt(s);
        
    }

}

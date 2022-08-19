package Programmers_Lv1;

public class natural_number_reverse_array {

	public static void main(String[] args) {
		natural_number_reverse_array nnra = new natural_number_reverse_array();
		for(int item : nnra.solution(12345))
			System.out.println(item);
	}
	public int[] solution(long n) {
        String[] str_answer = String.valueOf(n).split("");
        int [] answer = new int[str_answer.length];
        for(int i = 0, j = str_answer.length-1 ; i < str_answer.length; i++, j--) {
        	answer[j] = Integer.parseInt(str_answer[i]); 
        }
        
        return answer;
    }
}

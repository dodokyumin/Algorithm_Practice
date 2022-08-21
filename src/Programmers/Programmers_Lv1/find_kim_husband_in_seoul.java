package Programmers.Programmers_Lv1;

public class find_kim_husband_in_seoul {

	public static void main(String[] args) {
		find_kim_husband_in_seoul fkhis = new find_kim_husband_in_seoul();
		String[] names = {"john", "kim", "doe"};
		System.out.println(fkhis.solution(names));
		
	}
	 public String solution(String[] seoul) {
	        String where = "";
	        for(int i = 0; i < seoul.length; i++) {
	        	if(seoul[i] == "Kim") {
	        		where = String.valueOf(i);
	        		break;
	        	}
	        }
	        
	        String answer = "김서방은 " + where + "에 있다";
	        return answer;
	    }
}

package Programmers.Programmers_Lv1;

public class coke {

	public static void main(String[] args) {
		int a = 2; //마트에 주어야하는 병 수
		int b = 1;	//빈병 a개를 가져다 주면 마트가 주는 콜라 병 수
		int n = 20;	//상빈이가 가지고 있는 빈 병 개수
		System.out.println(solution(a,b,n));
	}

    public static int solution(int a, int b, int n) {
        int answer = 0;
        
        while(n >= a) {
        	answer += (n/a)*b;
        	n = ((n/a)*b + n%a);
        }
        
        return answer;
    }
}

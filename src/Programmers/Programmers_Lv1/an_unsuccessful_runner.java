package Programmers.Programmers_Lv1;

import java.util.Arrays;

public class an_unsuccessful_runner {

	public static void main(String[] args) {
		an_unsuccessful_runner aur = new an_unsuccessful_runner();
		String[] arr1 = {"mislav", "mislav", "stanko",  "ana"};
		String[] arr2 = {"mislav", "stanko", "ana" };

		System.out.println("Á¤´ä:"+aur.solution(arr1, arr2));
	}

	public String solution(String[] participant, String[] completion) {
		String answer = "";

		Arrays.sort(participant);
		Arrays.sort(completion);

		boolean last = true;
		
		for(int i = 0; i < completion.length; i++) {
			if(!participant[i].equals(completion[i])) {
				answer = participant[i];
				last = false;
				break;
			}
		}
		
		if(last) {
			answer = participant[participant.length-1];
		}

		return answer;
	}
}

package Programmers.Programmers_Lv2;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Printer {

	public static void main(String[] args) {
		Printer p = new Printer();

		int[] priorities = {2, 1, 3, 2};
		int location = 2;
		System.out.println(p.solution(priorities, location));

	}

	public int solution(int[] priorities, int location) {
		//프린트 해야할 값과, 위치 인덱스
		int[] needToPrint = {priorities[location], location};
		System.out.println("찾아야할 키값 "+ needToPrint[0] + ", 찾아야할 위치 "+needToPrint[1]);
		int answer = 1;
		
		//프린트할 내용을 담을 큐(값, 원래 priorities에서의 순서)와 뽑아야할 순서를 내림차순 정렬하여 담을 큐
		Queue<int[]> printerQueue = new LinkedList<>();//{{2,0},{1,1},{3,2},{2,3}}
		Queue<Integer> maxQueue = new LinkedList<>(); //3, 2, 2, 1

		// 큐에 담아주기
		for (int i = 0; i < priorities.length; i++) {
			int[] arr = { priorities[i], i };
			printerQueue.add(arr);
		}

		//priority의 내림차순 정렬
		Arrays.sort(priorities);
		for (int i = 0; i < priorities.length; i++) {
			maxQueue.add(priorities[priorities.length-1 -i]);
		}
		
		//프린터 큐 정렬하며 최댓값이 나오면 poll하여 두 큐에서 같이 빼주기.
		while (printerQueue.size() > 0) {
			
			// 만약 찾는 location의 값이 다음 출력해야할(maxQueue) 와 같고 프린터큐와 같다면
			if (printerQueue.peek()[0] == maxQueue.peek() && printerQueue.peek()[1] == needToPrint[1] && printerQueue.peek()[0] == needToPrint[0]) {
				break;
			}
			
			// 만약 제일 큰 수가 아니라면 뒤로 넘기기
			if (printerQueue.peek()[0] != maxQueue.peek()) {
				printerQueue.add(printerQueue.poll());
				
				// 만약 제일 큰 수라면 printerQueue와 maxQueue에서 둘다 빼기
			} else if (printerQueue.peek()[0] == maxQueue.peek()) {
				printerQueue.poll();
				maxQueue.poll();
				answer++;
			}
		}

		return answer;
	}
	
	//타인 솔루션
	// {2, 1, 3, 2}; //2
	public int solution2(int[] priorities, int location) {
        int answer = 0;
        int l = location;

        Queue<Integer> que = new LinkedList<Integer>();
        for(int i : priorities){
            que.add(i);
        }
        //큐 : [2, 1, 3, 2];

        Arrays.sort(priorities);
        //priorities : [1, 2, 2, 3];
        int size = priorities.length-1;
        // size : 3;


        while(!que.isEmpty()){
            Integer i = que.poll();
            //뽑은게 priorities 에서 제일 큰 수라면
            if(i == priorities[size - answer]){//size - answer = 3 //priorities의 뒤부터 접근 3, 2, 2, 1
            	
                answer++;
                l--; //앞 순번이 빠졌으니 location 순번을 앞당김
                if(l <0)
                    break;
            }else{ //뽑은게 priorities 에서 제일 큰 수가 아니라면,
                que.add(i); //다시 큐 맨 뒤로 넣어주고
                l--;
                if(l<0) //큐의 길이만큼 순서 재 정의(맨 뒤로 간다는 뜻)
                    l=que.size()-1; 
            }
        }

        return answer;
    }
}

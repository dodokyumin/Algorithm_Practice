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
		//����Ʈ �ؾ��� ����, ��ġ �ε���
		int[] needToPrint = {priorities[location], location};
		System.out.println("ã�ƾ��� Ű�� "+ needToPrint[0] + ", ã�ƾ��� ��ġ "+needToPrint[1]);
		int answer = 1;
		
		//����Ʈ�� ������ ���� ť(��, ���� priorities������ ����)�� �̾ƾ��� ������ �������� �����Ͽ� ���� ť
		Queue<int[]> printerQueue = new LinkedList<>();//{{2,0},{1,1},{3,2},{2,3}}
		Queue<Integer> maxQueue = new LinkedList<>(); //3, 2, 2, 1

		// ť�� ����ֱ�
		for (int i = 0; i < priorities.length; i++) {
			int[] arr = { priorities[i], i };
			printerQueue.add(arr);
		}

		//priority�� �������� ����
		Arrays.sort(priorities);
		for (int i = 0; i < priorities.length; i++) {
			maxQueue.add(priorities[priorities.length-1 -i]);
		}
		
		//������ ť �����ϸ� �ִ��� ������ poll�Ͽ� �� ť���� ���� ���ֱ�.
		while (printerQueue.size() > 0) {
			
			// ���� ã�� location�� ���� ���� ����ؾ���(maxQueue) �� ���� ������ť�� ���ٸ�
			if (printerQueue.peek()[0] == maxQueue.peek() && printerQueue.peek()[1] == needToPrint[1] && printerQueue.peek()[0] == needToPrint[0]) {
				break;
			}
			
			// ���� ���� ū ���� �ƴ϶�� �ڷ� �ѱ��
			if (printerQueue.peek()[0] != maxQueue.peek()) {
				printerQueue.add(printerQueue.poll());
				
				// ���� ���� ū ����� printerQueue�� maxQueue���� �Ѵ� ����
			} else if (printerQueue.peek()[0] == maxQueue.peek()) {
				printerQueue.poll();
				maxQueue.poll();
				answer++;
			}
		}

		return answer;
	}
	
	//Ÿ�� �ַ��
	// {2, 1, 3, 2}; //2
	public int solution2(int[] priorities, int location) {
        int answer = 0;
        int l = location;

        Queue<Integer> que = new LinkedList<Integer>();
        for(int i : priorities){
            que.add(i);
        }
        //ť : [2, 1, 3, 2];

        Arrays.sort(priorities);
        //priorities : [1, 2, 2, 3];
        int size = priorities.length-1;
        // size : 3;


        while(!que.isEmpty()){
            Integer i = que.poll();
            //������ priorities ���� ���� ū �����
            if(i == priorities[size - answer]){//size - answer = 3 //priorities�� �ں��� ���� 3, 2, 2, 1
            	
                answer++;
                l--; //�� ������ �������� location ������ �մ��
                if(l <0)
                    break;
            }else{ //������ priorities ���� ���� ū ���� �ƴ϶��,
                que.add(i); //�ٽ� ť �� �ڷ� �־��ְ�
                l--;
                if(l<0) //ť�� ���̸�ŭ ���� �� ����(�� �ڷ� ���ٴ� ��)
                    l=que.size()-1; 
            }
        }

        return answer;
    }
}

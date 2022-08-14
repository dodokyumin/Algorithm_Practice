package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class baekjoon_10845_Queue {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int back = 0;
		//Queue�� �������� �߰� ������ ���� LinkedList�� �����ϴ� ���� �� �����ϴ�.
		Queue<Integer> queue = new LinkedList<Integer>();
		int N = Integer.parseInt(br.readLine());
		//��� �Է��� N�� ������ ����.
		for(int i = 0; i < N; i++) {
			String order = br.readLine();
			
			switch (order) {
				//������ �Է� : add()
			case "push":
				int inputNum = Integer.parseInt(br.readLine());
				back = inputNum;
				queue.add(inputNum);
				break;
				
				//������ ���� �� ��� : poll()
			case "pop":
				if (queue.isEmpty()) {
					System.out.println(-1);
				} else {
					System.out.println(queue.poll());
				}
				break;
				
				//ť�� ����� ������ �� ��� : size()
			case "size":
				System.out.println(queue.size());
				break;
				
				//ť�� ����ִ��� Ȯ�� : isEmpty()
			case "empty":
				if(queue.isEmpty()) {
					System.out.println(1);
				} else {
					System.out.println(0);
				}
				break;
				
				//ť�� ���� �տ� �ִ� �����͸� ���� ���� ��� : peek()
			case "front":
				if (queue.isEmpty()) {
					System.out.println(-1);
				} else {
					System.out.println(queue.peek());
				}
				break;
				
				//Queue�� FIFO���. �������� �߰�("push")�� ���� �� ���� ���ڰ� �ǹǷ� back�� ������ش�. 
			case "back":
				if (queue.isEmpty()) {
					System.out.println(-1);
				} else {
					System.out.println(back);
				}
				break;
			}
			
		}
	}

}

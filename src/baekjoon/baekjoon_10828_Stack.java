package baekjoon_10828_Stack;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;
//���� 10828 ����
public class baekjoon_10828_Stack {
	
	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine());

		// Stack ��ü ����.
		Stack<Integer> stack = new Stack<>();

		// ù ���ο��� ���� ���� �� ��ŭ �Է��� �ݺ��Ѵ�.
		for (int i = 0; i < n; i++) {

			// �Ź� �޴� ������ ������ ����.
			String cons = br.readLine();

			// push ��� ����
			if (cons.contains("push")) {
				String spt[] = cons.split(" ");
				stack.push(Integer.parseInt(spt[1]));

				// pop ��� ����
			} else if (cons.contains("pop")) {
				if (stack.empty())
					bw.write(-1 + "\n"); // ������ empty() üũ�� �ʿ��ϴ�.
				else
					bw.write(stack.pop() + "\n");

				// size ��� ����
			} else if (cons.contains("size")) {
				bw.write(stack.size() + "\n");

				// empty ��� ����
			} else if (cons.contains("empty")) {
				if (stack.empty())
					bw.write(1 + "\n"); // ������ empty() üũ�� �ʿ��ϴ�.
				else
					bw.write(0 + "\n");

				// top ��� ����
			} else if (cons.contains("top")) {
				if (stack.empty())
					bw.write(-1 + "\n"); // ������ empty() üũ�� �ʿ��ϴ�.
				else
					bw.write(stack.peek() + "\n");
			}
		}

		bw.flush();
		bw.close();
		br.close();
	}
}
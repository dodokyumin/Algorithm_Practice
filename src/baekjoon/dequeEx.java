package baekjoon;

import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class dequeEx {

	public static void main(String[] args) {
		
		Deque<Integer> deque = new LinkedList<>();

		deque.add(3);
		deque.add(7);
		deque.add(5);

		for (int de : deque) {
			System.out.print(de + " ");
		}

		System.out.println();

		for (Iterator<Integer> it = deque.iterator(); it.hasNext();) {
			System.out.print(it.next() + " ");
		}

		System.out.println();

		Iterator<Integer> it = deque.iterator();
		while (it.hasNext()) {
			System.out.print(it.next() + " ");
		}

		deque.addFirst(1);
		System.out.println("\n맨 앞" + deque.peekFirst());
		
		deque.addLast(2);
		System.out.println("맨 뒤" + deque.peekLast());
	}

}

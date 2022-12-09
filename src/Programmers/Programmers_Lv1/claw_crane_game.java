package Programmers.Programmers_Lv1;

import java.util.Stack;

public class claw_crane_game {

	public static void main(String[] args) {

		int[][] board = { { 0, 0, 0, 0, 0 }, { 0, 0, 1, 0, 3 }, { 0, 2, 5, 0, 1 }, { 4, 2, 4, 4, 2 },
				{ 3, 5, 1, 3, 1 } };
		int[] moves = { 1, 5, 3, 5, 1, 2, 1, 4 };

		System.out.println(solution(board, moves));

	}

	public static int solution(int[][] board, int[] moves) {
		int answer = 0;

		Stack<Integer> bascket = new Stack<Integer>();
		bascket.add(0);
		
		for (int j = 0; j < moves.length; j++) {
			for (int i = 0; i < board.length; i++) {

				int y = i;
				int x = moves[j] -1;
				
				//인형 뽑기
				if (board[y][x] != 0) {

					System.out.println(board[y][x] + " : 뽑혔어유");
					
					//바구니 담기
					if (bascket.peek() != board[y][x]) {
						
						bascket.add(board[y][x]);
					
					} else {
						
						bascket.pop();
						answer++;
						System.out.println();
					}
					
					//뽑은 숫자 0으로 바꿔주기.
					board[y][x] = 0;
					
					//상태 확인 프린트
					for(int w = 0; w < board.length; w++) {
						for(int z = 0; z < board[w].length; z++) {
							System.out.print(board[w][z] + " ");
						}
						System.out.println();
					}
					break;
					
				}

				System.out.println();
				
			}
		}

		return answer*2;
	}

}

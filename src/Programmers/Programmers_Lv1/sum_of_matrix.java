package Programmers.Programmers_Lv1;

public class sum_of_matrix {

	public static void main(String[] args) {

		int[][] arr1 = { { 1, 2 }, { 2, 3 } };
		int[][] arr2 = { { 3, 4 }, { 5, 6 } };

		solution(arr1, arr2);
	}

	public static int[][] solution(int[][] arr1, int[][] arr2) {
		
		int col = arr1.length;
		int row = arr1[0].length;
		
		int[][] answer = new int[col][row];
		
		for (int i = 0; i < col; i++) {
			for(int j = 0; j < row; j++) {
				answer[i][j] = arr1[i][j] + arr2[i][j]; 
			}
			
		}
		
		return answer;
	}

}

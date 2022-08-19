package Programmers.Programmers_Lv1;

import java.util.Arrays;

public class mock_exam {

	public static void main(String[] args) {
		mock_exam me = new mock_exam();
		int[] answers = { 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3 };

		for (int item : me.solution(answers))
			System.out.println(item);

	}

	public int[] solution(int[] answers) {
		mock_exam me = new mock_exam();

		int[] one = { 1, 2, 3, 4, 5 };
		int[] two = { 2, 1, 2, 3, 2, 4, 2, 5 };
		int[] three = { 3, 3, 1, 1, 2, 2, 4, 4, 5, 5 };

		int ones_score = checkScore(answers, one);
		int twos_score = checkScore(answers, two);
		int threes_score = checkScore(answers, three);
		int highscore = me.getHighScoreDraw(ones_score, twos_score, threes_score)[0];
		int draw = me.getHighScoreDraw(ones_score, twos_score, threes_score)[1];

		int[] answer = whosTheBest(ones_score, twos_score, threes_score, highscore, draw);
		Arrays.sort(answer);

		return answer;
	}

	public int checkScore(int[] answers, int[] pattern) {

		int check_cnt = answers.length; // ���� ��
		int[] student_answers = new int[check_cnt]; // �л� �����
		int score = 0;

		// �л� ����� �����. �л� ������� ��ȸ�� i, �л� ��� ������ ��ȸ�� j
		for (int i = 0, j = 0; i < student_answers.length; i++, j++) {
			if (j > pattern.length - 1) {
				j = 0;
			}
			student_answers[i] = pattern[j];
		}

		// �л� ������� ä�� ����� ��
		for (int i = 0; i < student_answers.length; i++) {
			if (answers[i] == student_answers[i]) {
				score++;
			}
		}

		return score;
	}

	public int[] getHighScoreDraw(int a, int b, int c) {
		int[] score_arr = { a, b, c }; 
		int topScore = a;
		int draw = 0;

		for (int score : score_arr) {
			if (topScore < score) {
				topScore = score;
			} else if (topScore == score) {
				draw++;
			}
		}
		
		int[] topScore_draw = { topScore, draw };

		return topScore_draw;
	}

	public int[] whosTheBest(int a, int b, int c, int highscore, int draw) {
		int[] score_arr = { a, b, c };
		int[] best_student = new int[draw];
		int cnt = 0; //�ְ� ���� �л��� �迭�� �� ��ġ
		for (int i = 0; i < score_arr.length; i++) {
			if (score_arr[i] == highscore) {
				best_student[cnt] = i + 1;
				cnt++;
			}
		}

		return best_student;
	}
}

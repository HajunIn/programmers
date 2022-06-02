package com.codingTest;

import java.util.Arrays;

public class Marathon {
//	���� ����
//	������ ������ �������� �����濡 �����Ͽ����ϴ�. �� �� ���� ������ �����ϰ�� ��� ������ �������� �����Ͽ����ϴ�.
//
//	�����濡 ������ �������� �̸��� ��� �迭 participant�� ������ �������� �̸��� ��� �迭 completion�� �־��� ��, �������� ���� ������ �̸��� return �ϵ��� solution �Լ��� �ۼ����ּ���.
//
//	���ѻ���
//	������ ��⿡ ������ ������ ���� 1�� �̻� 100,000�� �����Դϴ�.
//	completion�� ���̴� participant�� ���̺��� 1 �۽��ϴ�.
//	�������� �̸��� 1�� �̻� 20�� ������ ���ĺ� �ҹ��ڷ� �̷���� �ֽ��ϴ�.
//	������ �߿��� ���������� ���� �� �ֽ��ϴ�.
//	����� ��
//	participant	completion	return
//	["leo", "kiki", "eden"]	["eden", "kiki"]	"leo"
//	["marina", "josipa", "nikola", "vinko", "filipa"]	["josipa", "filipa", "marina", "nikola"]	"vinko"
//	["mislav", "stanko", "mislav", "ana"]	["stanko", "ana", "mislav"]	"mislav"
//	����� �� ����
//	���� #1
//	"leo"�� ������ ��ܿ��� ������, ������ ��ܿ��� ���� ������ �������� ���߽��ϴ�.
//
//	���� #2
//	"vinko"�� ������ ��ܿ��� ������, ������ ��ܿ��� ���� ������ �������� ���߽��ϴ�.
//
//	���� #3
//	"mislav"�� ������ ��ܿ��� �� ���� ������, ������ ��ܿ��� �� ��ۿ� ���� ������ �Ѹ��� �������� ���߽��ϴ�.

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] participant = { "leo", "kiki", "eden" };
		String[] completion = { "eden", "kiki" };
		String answer = solution(participant, completion);

		System.out.println(answer);
	}

	private static String solution(String[] participant, String[] completion) {

		String answer = "";
		Arrays.sort(participant);
		Arrays.sort(completion);
		for (int i = 0; i < completion.length; i++) {
			if (!(participant[i].equals(completion[i]))) {
				return answer = participant[i];
			}
		}
		answer = participant[participant.length - 1];
		return answer;
	}

}

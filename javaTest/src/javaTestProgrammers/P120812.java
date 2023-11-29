package javaTestProgrammers;

import java.util.Arrays;

/*최빈값은 주어진 값 중에서 가장 자주 나오는 값을 의미합니다.
 * 정수 배열 array가 매개변수로 주어질 때, 최빈값을 return 하도록 solution 함수를 완성해보세요. 
 * 최빈값이 여러 개면 -1을 return 합니다. */
public class P120812 {
	class Solution {
		public int solution(int[] array) {
			int answer = 0;
			Arrays.sort(array); // 어레이 배열의 오름차순 정렬

			int max = array[array.length - 1];
			int[] countOne = new int[max + 1]; // 카운트 배열 생성

			for (int i = 0; i < array.length; i++) {
				if (array[i] == array[array.length - i])
					countOne[array[i]]++;
			}

			int top = countOne[0];
			for (int i = 1; i < countOne.length; i++) {
				if (top < countOne[i]) {
					top = countOne[i];
					answer = i;
				} else if (top == countOne[i]) {
					answer = -1;
				}
			}
			return answer;
		}
	}
}

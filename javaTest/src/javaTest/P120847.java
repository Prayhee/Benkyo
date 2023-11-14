package javaTest;

//정수 배열 numbers가 매개변수로 주어집니다.
//numbers의 원소 중 두 개를 곱해 만들 수 있는 최댓값을 return하도록 solution 함수를 완성해주세요.
public class P120847 {
	class Solution {
		public int solution(int[] numbers) {
			int answer = 0;
			int num1 = 0;
			int num2 = 0;
			
			for (int i = 0; i < numbers.length; i++) {
				if (numbers[i] >= num1) {
					num1 = numbers[i];
				}else if(numbers[i] >= num2) {
                    num2 = numbers[i];
                }
            }
			answer = num1 * num2;
			return answer;

		}
	}
}
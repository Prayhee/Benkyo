package javaTest;

/*머쓱이네 옷가게는 10만 원 이상 사면 5%, 30만 원 이상 사면 10%, 50만 원 이상 사면 20%를 할인해줍니다.
구매한 옷의 가격 price가 주어질 때, 지불해야 할 금액을 return 하도록 solution 함수를 완성해보세요.*/
public class P120818 {
	class Solution {
		public int solution(int price) {
			int answer = 0;
			int sale = 0;
			if (price >= 500000) {
				sale = 20;
			} else if (price >= 300000) {
				sale = 10;
			} else if (price >= 100000) {
				sale = 5;
			} else
			answer = answer / sale;
			return answer;
		}
	}
}

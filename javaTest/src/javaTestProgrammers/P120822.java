package javaTestProgrammers;
/*문자열 my_string이 매개변수로 주어집니다.
my_string을 거꾸로 뒤집은 문자열을 return하도록 solution 함수를 완성해주세요.
*/
public class P120822 {
	class Solution {
	    public String solution(String my_string) {
	        String answer = "";
	        
	        StringBuffer strre = new StringBuffer(my_string);
	        answer = strre.reverse().toString();
	        return answer;
	    }
	}
}

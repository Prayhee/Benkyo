package zoeproject;

import java.util.Scanner;

public class P120831 {
	public static void main(String[] args) {
		class Solution {
			public int solution(int n) {
				int answer = 0;
				
				for (int i = 0; i <= n; i++) {
					if (i % 2 == 0) {
						answer += i;
					}
				}
				return answer;
			}
		}
	}
}

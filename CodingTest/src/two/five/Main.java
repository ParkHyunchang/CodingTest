/*
5. 소수(에라토스테네스 체)
설명
자연수 N이 입력되면 1부터 N까지의 소수의 개수를 출력하는 프로그램을 작성하세요.
만약 20이 입력되면 1부터 20까지의 소수는 2, 3, 5, 7, 11, 13, 17, 19로 총 8개입니다.


입력
첫 줄에 자연수의 개수 N(2<=N<=200,000)이 주어집니다.


출력
첫 줄에 소수의 개수를 출력합니다.


예시 입력 1 
20

예시 출력 1
8
 */
package two.five;

import java.util.*;
class Main { // 에라토스테네스 체 방법이 소수를 구하는 가장 빠른 방법
	public int solution(int n){
		int cnt=0;
		int[] ch = new int[n+1]; // 배수 체크할 배열 // n+1 해야지 인덱스가 n까지 생겨 
		for(int i=2; i<=n; i++){
			if(ch[i]==0){ // 0이면 배수가 없다는 얘기이니 소수
				//System.out.printf("%d ", i); 소수인 인덱스 출력
				cnt++; // 소스 카운드
				for(int j=i; j<=n; j=j+i) ch[j]=1; // 배수 체크
			}
		}
		return cnt;
	}
	public static void main(String[] args){
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		int n=kb.nextInt();
		System.out.println(T.solution(n));
	}
}
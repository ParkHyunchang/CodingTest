/*
3. 문장 속 단어
설명

한 개의 문장이 주어지면 그 문장 속에서 가장 긴 단어를 출력하는 프로그램을 작성하세요.

문장속의 각 단어는 공백으로 구분됩니다.


입력
첫 줄에 길이가 100을 넘지 않는 한 개의 문장이 주어집니다. 문장은 영어 알파벳으로만 구성되어 있습니다.


출력
첫 줄에 가장 긴 단어를 출력한다. 가장 길이가 긴 단어가 여러개일 경우 문장속에서 가장 앞쪽에 위치한

단어를 답으로 합니다.


예시 입력 1 

it is time to study
예시 출력 1

study
*/
package one.three;

import java.util.*;
class Main {	
	public String solution(String str){
		String answer="";
		int m=Integer.MIN_VALUE; // 최대값으로 계속 갱신이 필요하니 처음에는 가장 작은값으로 초기화
		String[] s = str.split(" "); // 띄어쓰기로 구분해서 배열에 저장
		for(String x : s){
			int len=x.length();
			if(len>m){
				m=len; // 최대값을 m 으로 계속 갱신
				answer=x; // 긴 단어를 answer 에 저장
			}
		}
		return answer;
	}

	public static void main(String[] args){
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		String str=kb.nextLine();
		System.out.print(T.solution(str));
	}
}

/*
import java.util.*;
class Main {	
	public String solution(String str){
		String answer="";
		int m=Integer.MIN_VALUE, pos;
		while((pos=str.indexOf(' '))!=-1){
			String tmp=str.substring(0, pos);
			int len=tmp.length();
			if(len>m){
				m=len;
				answer=tmp;
			}
			str=str.substring(pos+1);
		}
		if(str.length()>m) answer=str; // 마지막 단어 처리해줌 // 이거 안해주면 마지막단어가 (pos=str.indexOf(' '))!=-1 여기에서 false 로 되서 검토안함.
		return answer;
	}

	public static void main(String[] args){
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		String str=kb.nextLine();
		System.out.print(T.solution(str));
	}
}
*/
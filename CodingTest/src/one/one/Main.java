package one.one;

import java.util.Scanner;

public class Main {
	public int solution(String str, char t){ // non static , instance method
		int answer=0;
		str=str.toUpperCase();
		t=Character.toUpperCase(t);
		//System.out.println(str+" "+t);
		/*for(int i=0; i<str.length(); i++){
			if(str.charAt(i)==t) answer++;
		}*/
		for(char x : str.toCharArray()){
			if(x==t) answer++;
		}
		return answer;
	}
	
	public static void main(String[] args){
		Main T = new Main(); // static 에서 instance method 호출 하려면 객체생성 필요
		Scanner kb = new Scanner(System.in);
		String str=kb.next(); // 콘솔로 문자열 하나 읽어 들이는 것
		char c=kb.next().charAt(0); // charAt 스트링에 인덱스로 접근하는 것
		System.out.print(T.solution(str, c));
	}
}

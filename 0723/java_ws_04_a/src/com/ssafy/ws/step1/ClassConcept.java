package com.ssafy.ws.step1;

/**
 * 클래스 개념 익히기
 * 
 * 객체 지향 프로그래밍(OOP, Object-Oriented Programming)은
 * 데이터를 객체(Object)로 취급하고 중심이 되는 프로그래밍 방식입니다.
 * 
 * 우리가 인식할 수 있는 모든 것을 객체로 표현할 수 있습니다.
 * 이러한 객체는 속성과 동작이 포함되어있습니다.
 * 
 */
public class ClassConcept {
	/*
	* hint1. 밑줄(_) 갯수는 단어의 글자수를 의미합니다. 예를 들어 답이 "홍길동" 이라면 ___ 으로 표시되어 있습니다.
	*/
	public static void main(String[] args) {
		
		System.out.println("클래스는 관련 있는 변수와 함수를 묶어서 만든 사용자 정의 ___ 입니다."); // hint2. "type"의 한글 명칭
		
		System.out.println("클래스의 속성(Attribute) == __");
		System.out.println("클래스의 동작(Behavior) == ___");
		
		System.out.println("클래스를 통해 생성된 객체를 ____라고 합니다.");
		
		System.out.println("클래스 선언 방법은 [접근___] [활용___] class 클래스이름 { ... } 과 같은 형식입니다.");
		
		System.out.println("사람을 객체로 표현 했을 때, 사람의 이름, 나이, 취미 같은 것들은 __라고 할 수 있습니다.");
		System.out.println("사람을 객체로 표현 했을 때, 자기 소개를 한다, 공부를 한다 같은 것들은 ___라고 할 수 있습니다.");
		
		System.out.println("___의 선언 방법은 [접근__] [활용___] [__타입] ___이름 ( [____] ) { ... } 과 같은 형식입니다. ");
		
		System.out.println("__타입은 ___를 선언할 때 지정되고, 없으면 ____ 가 됩니다."); // hint3. 마지막 밑줄은 영문(alphabet)입니다.
		
		// hint4. 아래 두 줄은 같은 주어(subject)를 서술하고 있습니다.
		System.out.println("___를 호출하기 위해서는 ____가 선언되어 있는 클래스에 접근해야 합니다.");
		System.out.println("___를 호출하는 방법은 클래스/객체이름.___이름( [__] ) 과 같은 형식으로 호출합니다.");
		
		// hint5. 아래 두 줄은 같은 주어(subject)를 서술하고 있습니다.
		System.out.println("___는 객체를 생성할때 실행되는 ___ 입니다. ___ 키워드와 함께 호출되며 클래스 이름과 동일합니다."); // hint6. 마지막 밑줄은 영문(alphabet)입니다.
		System.out.println("___는 __타입을 갖지 않으며, 객체가 생성될 때 반드시 호출됩니다. 만약 하나도 정의되어 있지 않다면 default ___가 호출됩니다.");
		
		System.out.println("____는 참조 변수로써 객체 자신을 가리킵니다.");
	}
	
}

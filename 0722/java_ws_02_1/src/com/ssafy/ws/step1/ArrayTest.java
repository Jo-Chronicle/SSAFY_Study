package com.ssafy.ws.step1;

import java.util.Arrays;

public class ArrayTest {
	public static void main(String[] args) {
		// 크기가 4인 정수형 배열을 선언해보자.
		int[] birthday = {1,2,3,4};
		// 각각의 인덱스에 접근하여 값을 생일로 바꾸어보자.11
		// ex) 생일 3월 6일 -> 0306 로 생각하기
		birthday[0] = 0; //생략 가능
		birthday[1] = 3;
		birthday[2] = 0; //생략 가능
		birthday[3] = 6;
		
		System.out.println(Arrays.toString(birthday));
		
		// 우리반 동기 3명의 이름을 원소로 같은 String 배열을 선언하고 초기화 해보자.
		String[] names = new String[]{"헤일리","선생님","짱"};
		
		System.out.println(Arrays.toString(names));
	}
}

package com.ict.day11;

public class Ex01 {

	// 인자를 기본자료형으로 전달받음
	// 값 호츌(Call By Value)
	// 원본 값이 변경하지 않는다.
	public int add(int k) {
		++k;
		return k;
	}

	// 인자를 배열, 객체로 전달받음
	// 참조(주소) 호출(Call By Reference)
	// 원본 값이 변한다.
	public void add2(int[] k) {
		System.out.println("k 의 주소값: "+k);
		/*
		 * for-each 루프 (즉, for (int i : k))는 배열 k의 각 요소에 대한 복사본을 만듭니다. 따라서 루프 내에서 i를
		 * 변경해도 원래 배열 k에는 영향을 미치지 않습니다.
		 * 
		 * 반면, 기존의 for 루프는 배열 k의 각 요소에 직접 접근하므로, 루프 내에서 요소를 변경하면 원래 배열 k에 영향을 미칩니다. 따라서
		 * 배열의 요소를 변경하려면 기존의 for 루프를 사용해야 합니다. 다음은 그 예시입니다:
		 */
//		for (int i : k) {
//			i += 10;
//		}
		System.out.println();
		for (int i = 0; i < k.length; i++) {
			k[i] += 10;
		}
	}
}

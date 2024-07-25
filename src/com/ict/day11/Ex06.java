package com.ict.day11;

import java.util.Arrays;
import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			Ex05 e1 = new Ex05("콜라", 1500);
			Ex05 e2 = new Ex05("이프로", 2000);
			Ex05 e3 = new Ex05("포카리", 1700);
			Ex05[] ex05 = { e1, e2, e3 };
			boolean found = false; // 품목 존재여부
			boolean loop = true; // 잔액 출력 성공 시 false됨
			System.out.println(Arrays.toString(ex05));

			System.out.println();

			System.out.println("------------------스캐너로 데이터를 입력받자-------------------\n");

			while (loop) {
				System.out.print("(금액 먼저 >> 1 , 품목 먼저 >> 2) ");
				int op = scan.nextInt();
				scan.nextLine(); // 개행문자 제거
				// 금액 먼정 입력
				if (op == 1) {
					System.out.print("금액 입력 >> ");
					int input = scan.nextInt();
					scan.nextLine(); // 개행문자 제거

					System.out.println();

					// 품목과 가격 전체 출력
					for (Ex05 e : ex05) {
						System.out.println(e.toString());
					}

					System.out.print("\n구매를 원하는 품목을 입력하세요 >> ");
					String name = scan.nextLine();

					for (int i = 0; i < ex05.length; i++) {
						// 해당 품목이 존재하는지 로직
						if (ex05[i].getName().equals(name)) {
							found = true;

							// 넣은 금액 >= 품목 금액
							if (input >= ex05[i].getPrice()) {
								System.out.println("\n넣은 금액: " + input + "원");
								System.out.println("잔액: " + (input - ex05[i].getPrice()) + "원\n");
								loop = false;
							}
							// 넣은 금액 < 품목 금액
							else {
								System.out.println("\n * 금액이 부족합니다.\n");
							}

							/* break는 가까운 루프 탈출하고 다음 코드 실행 */
							break;

						}
						// 해당 품목이 존재하지 않는다면

					}

					if (!found) {

						System.out.println("\n해당 품목은 없습니다.");
						System.out.println("다른 품목을 입력해주세요.\n");
					}

				}

				// 품목 먼저 입력
				else if (op == 2) {

					System.out.print("구매를 원하는 품목을 입력하세요 >> ");
					String name = scan.nextLine();

					for (int i = 0; i < ex05.length; i++) {
						// 해당 품목이 존재하는지 로직
						if (ex05[i].getName().equals(name)) {
							found = true;
							System.out.print("금액을 투입하세요 >> ");
							int input = scan.nextInt();
							scan.nextLine(); // 개행문자 제거

							// 넣은 금액 >= 품목 금액
							if (input >= ex05[i].getPrice()) {
								System.out.println("\n넣은 금액: " + input + "원");
								System.out.println("잔액: " + (input - ex05[i].getPrice()) + "원\n");
								loop = false;
							}
							// 넣은 금액 < 품목 금액
							else {
								System.out.println("\n * 금액이 부족합니다.\n");
							}

							/* break는 */
							break;

						}

					}

					if (!found) {
						System.out.println("\n * 해당 품목은 없습니다.");
						System.out.println(" * 다른 품목을 입력해주세요.\n");
					}

				} else {
					System.out.println("\n * 올바르게 입력 해주세요.");
				}
			}
		}

	}

}

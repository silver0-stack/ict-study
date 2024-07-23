package com.ict.day08;

import java.util.Arrays;
import java.util.Scanner;

public class Ex07 {
	public static void main(String[] args) {
		// 회원 정보 입력 받기

		try (Scanner scan = new Scanner(System.in)) {
			// 배열 크기는 정적이라 변하지 않는다.
			// 그래서 배열 복사해주어야 함
			int cnt = 0;

			// 크기가 0인 members 배열 초기화
			String[][] members = new String[cnt][5];

			boolean id_valid = true;
			boolean pw_valid = true;
			// 회원가입 시작
			while (true) {
				System.out.println("\n=======회원가입을 시작합니다.========");
				System.out.print("이름: ");
				String name = scan.nextLine();

				String id = "";
				String pw = "";

				// 아이디 중복 확인
				do {
					System.out.print("아이디: ");
					id = scan.nextLine();
					for (String[] member : members) {
						if (member[2].equals(id)) {
							System.out.println("중복 아이디입니다.");
							id_valid=false;
						} else {
							id_valid = true;
							break;
						}
					}
				} while (!id_valid);

				// 비밀번호 유효성 검사
				do {
					System.out.print("비밀번호: ");
					pw = scan.nextLine();

					if (isValidPassword(pw)) {
						pw_valid = true;
						break;
					} else {
						System.out.println(
								"비밀번호는 영문/숫자/특수문자 중 2가지 이상 포함, 8자 이상 32자 이하,연속 3자 이상 동일한 문자/숫자 제외 조건을 만족해야 합니다.");
						pw_valid=false;
					}
				} while (!pw_valid);

				System.out.print("사는 지역: ");
				String addr = scan.nextLine();

				String[] member = { String.valueOf(cnt + 1), name, id, pw, addr };

				// cnt++해도 배열의 크기는 여전히 초기화된 1이다.
				// 새로운 회원 정보 추가할 때마다 배열 크기 증가시켜줘야 한다.
				// Arrays.copyOf() - 원본배열과 새로운 크기를 인자로 받아 새로운 크기의 배열을 반환한다
				// 원본 배열의 요소는 새 배열에 복사된다
				members = Arrays.copyOf(members, members.length + 1); // 배열 크기 증가
				members[cnt] = member; // 새 회원 정보 추가

				System.out.print("\n회원가입을 계속하시겠습니까? (1. 네 2. 아니요) >> ");
				String op = scan.nextLine();
				// nextInt()로 받으니 개행문자가 생긴다. 다음 코드에 끼칠 영향을 사전에 방지하기 위해 scan.nextLine()로 한 줄의 모든
				// 문자를 읽게함
				// scan.nextLine();

				int op_ = Integer.parseInt(op);

				if (op_ == 1)
					cnt++;
				else if (op_ == 2) {
					System.out.println("\n\n< 가입한 유저 정보 >");
					for (String[] member_ : members) {
						System.out.println(Arrays.toString(member_));
					}
					break;
				} else {
					System.out.println("올바르게 입력해주세요.");
					System.out.print("\n회원가입을 계속하시겠습니까? (1. 네 2. 아니요) >> ");
					op_ = scan.nextInt();
					scan.nextLine(); // 개행 문자 제거
					if (op_ == 1) {
						cnt++;
					} else if (op_ == 2) {
						System.out.println("\n\n<가입한 유저 정보 >");
						for (String[] member_ : members) {
							System.out.println(Arrays.toString(member_));
						}
						break;

					}
				}
			}

			// 로그인 시작
			System.out.print("\n===========로그인을 시작합니다===========\n");
			boolean loggin = false;
			int errCnt = 0;
			while (!loggin) {
				System.out.print(" - 아이디: ");
				String login_id = scan.nextLine();

				System.out.print(" - 패스워드: ");
				String login_pw = scan.nextLine();

				for (String[] member_ : members) {
					if (member_[2].equals(login_id) && member_[3].equals(login_pw)) {
						loggin = true;
						System.out.println("\n" + member_[1] + " 님, 로그인에 성공하셨습니다.\n" + Arrays.toString(member_));
						break;
					}
				}
				if (!loggin) {
					errCnt++;
					if (errCnt == 5) {
						System.out.println("\n(로그인이 잠겼습니다.)");
						break;
					}
					System.out.println("\n아이디 비밀번호 불일치 오류. 로그인에 " + errCnt + "회 실패하였습니다.");
					System.out.println("로그인 5회 실패 시, 로그인 기능이 잠깁니다.\n");
				}

			}
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	// 영문/숫자/특수문자 중, 2가지 이상 포함
	// 8자 이상 32자 이하 입력(공백 제외)
	// 연속 3자 이상 동일한 문자/숫자 제외
	private static boolean isValidPassword(String pw) {
		if (pw.length() < 8 || pw.length() > 32) {
			return false;
		}

		// 영문 포함 여부
		boolean hasLetter = false;
		// 숫자 포함 여부
		boolean hasDigit = false;
		// 특수문자 포함 여부
		boolean hasSpecialChar = false;

		for (int i = 0; i < pw.length(); i++) {
			char c = pw.charAt(i);
			if (Character.isLetter(c))
				hasLetter = true;
			else if (Character.isDigit(c))
				hasDigit = true;
			else if (!Character.isLetterOrDigit(c))
				hasSpecialChar = true;

			if (i >= 2 && c == pw.charAt(i - 1) && c == pw.charAt(i - 2)) {
				return false;
			}
		}

		return (hasLetter && hasDigit) || (hasLetter && hasSpecialChar) || (hasDigit && hasSpecialChar);

	}
}

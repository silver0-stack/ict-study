package com.ict.day11;

public class Ex07 {
	private String name = "";
	private int kor = 0;
	private int eng = 0;
	private int math = 0;
	private int sum = 0;
	private double avg = 0.0;
	private String hak = "";
	private int rank = 1;

	public Ex07(String str, int k1, int k2, int k3) {
		name = str;
		kor = k1;
		eng = k2;
		math = k3;
		// 1. 여기서 sum, avg, hak 구하는 방법
		// 2. sum, avg, hak 구하는 메서드를 호출 하는 방법
		sum = kor + eng + math;
		avg = (int) (sum / 3.0 * 10) / 10.0;
		if (avg >= 90) {
			hak = "A학점";
		} else if (avg >= 80) {
			hak = "B학점";
		} else if (avg >= 70) {
			hak = "C학점";
		} else {
			hak = "F학점";
		}
	}

	public Ex07() {
		super();
	}

	// 이름, 총점, 평균, 학점, 순위를 호출한 곳으로 되돌려 보내는 메서드 만들기
	public String getName() {
		return name;
	}

	public int getSum() {
		return sum;
	}

	public double getAvg() {
		return avg;
	}

	public String getHak() {
		return hak;
	}

	public int getRank() {
		return rank;
	}

	// 순위를 변경하는 setter
	public void setRank(int k) {
		rank = k;
	}

	@Override
	public String toString() {
		return "Ex07 [name=" + name + ", kor=" + kor + ", eng=" + eng + ", math=" + math + ", sum=" + sum + ", avg="
				+ avg + ", hak=" + hak + ", rank=" + rank + "]";
	}

}

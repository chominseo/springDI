package ex1.스프링소개;

import java.util.Scanner;

public class NewlecExam extends DefaultExam {
	int com;

	public NewlecExam() {
		this(0, 0, 0, 0);
	}

	public NewlecExam(int kor, int eng, int math, int com) {
		super(kor, eng, math);
		this.com = com;
	}

	public int total() {

		return super.total() + com;
	}

	public float avg() {

		return total() / 4.0f;
	}

	public void input() {

		Scanner scan = new Scanner(System.in);

		System.out.println("┌───────────────────────────┐");
		System.out.println("│           성적  입력                   │");
		System.out.println("└───────────────────────────┘");
		System.out.println();

		int kor, eng, math;

		do {
			System.out.printf("국어 : ");
			kor = scan.nextInt();

			if (kor < 0 || 100 < kor)
				System.out.println("국어성적은 0~100까지의 범위만 입력이 가능합니다.");

		} while (kor < 0 || 100 < kor);

		do {
			System.out.printf("영어 : ");
			eng = scan.nextInt();

			if (eng < 0 || 100 < eng)
				System.out.println("영어성적은 0~100까지의 범위만 입력이 가능합니다.");

		} while (eng < 0 || 100 < eng);

		do {
			System.out.printf("수학 : ");
			math = scan.nextInt();

			if (math < 0 || 100 < math)
				System.out.println("국어성적은 0~100까지의 범위만 입력이 가능합니다.");

		} while (math < 0 || 100 < math);

		do {
			System.out.printf("컴퓨터 : ");
			com = scan.nextInt();

			if (com < 0 || 100 < com)
				System.out.println("컴퓨터 성적은 0~100까지의 범위만 입력이 가능합니다.");

		} while (com < 0 || 100 < com);

		System.out.println("─────────────────────────────");

		setKor(kor);
		setEng(eng);
		setMath(math);

	}

	public void print() {

		System.out.println("┌───────────────────────────┐");
		System.out.println("│           성적  출력                   │");
		System.out.println("└───────────────────────────┘");
		System.out.println();

		int kor = getKor();
		int eng = getEng();
		int math = getMath();

		int total = total();
		float avg = avg();

		System.out.printf("kor:%d, eng:%d, math:%d, com:%d, total :%d, avg:%f\n", kor, eng, math, com, total, avg);

		System.out.println("─────────────────────────────");

	}

}
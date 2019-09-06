package ex1.�������Ұ�;

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

		System.out.println("����������������������������������������������������������");
		System.out.println("��           ����  �Է�                   ��");
		System.out.println("����������������������������������������������������������");
		System.out.println();

		int kor, eng, math;

		do {
			System.out.printf("���� : ");
			kor = scan.nextInt();

			if (kor < 0 || 100 < kor)
				System.out.println("������� 0~100������ ������ �Է��� �����մϴ�.");

		} while (kor < 0 || 100 < kor);

		do {
			System.out.printf("���� : ");
			eng = scan.nextInt();

			if (eng < 0 || 100 < eng)
				System.out.println("������� 0~100������ ������ �Է��� �����մϴ�.");

		} while (eng < 0 || 100 < eng);

		do {
			System.out.printf("���� : ");
			math = scan.nextInt();

			if (math < 0 || 100 < math)
				System.out.println("������� 0~100������ ������ �Է��� �����մϴ�.");

		} while (math < 0 || 100 < math);

		do {
			System.out.printf("��ǻ�� : ");
			com = scan.nextInt();

			if (com < 0 || 100 < com)
				System.out.println("��ǻ�� ������ 0~100������ ������ �Է��� �����մϴ�.");

		} while (com < 0 || 100 < com);

		System.out.println("����������������������������������������������������������");

		setKor(kor);
		setEng(eng);
		setMath(math);

	}

	public void print() {

		System.out.println("����������������������������������������������������������");
		System.out.println("��           ����  ���                   ��");
		System.out.println("����������������������������������������������������������");
		System.out.println();

		int kor = getKor();
		int eng = getEng();
		int math = getMath();

		int total = total();
		float avg = avg();

		System.out.printf("kor:%d, eng:%d, math:%d, com:%d, total :%d, avg:%f\n", kor, eng, math, com, total, avg);

		System.out.println("����������������������������������������������������������");

	}

}
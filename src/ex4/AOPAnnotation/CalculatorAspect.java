package ex4.AOPAnnotation;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect // ������ ��ü
//@Component
public class CalculatorAspect {
	
	@Before("execution(* *.*(..))") //��������(������ ��, �����̽�)
	public void aaaaa() { // �����̽� ����
		
		System.out.println("�����Դϴ�.");
		
	}
}

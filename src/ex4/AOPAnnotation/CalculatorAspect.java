package ex4.AOPAnnotation;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect // 프락시 객체
//@Component
public class CalculatorAspect {
	
	@Before("execution(* *.*(..))") //어드바이저(포인터 컷, 어드바이스)
	public void aaaaa() { // 어드바이스 구현
		
		System.out.println("앞절입니다.");
		
	}
}

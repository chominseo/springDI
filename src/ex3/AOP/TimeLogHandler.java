package ex3.AOP;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

// before : MethodBeforeAdvice
// after : AfterReturningAdvice
// after throwing : ThrowsAdvice
// around : MethodInterceptor

public class TimeLogHandler implements MethodInterceptor {

	@Override
	public Object invoke(MethodInvocation method) throws Throwable {
		//���� ��ٸ��ڵ�
		System.out.println("����");
		long start = System.currentTimeMillis();
	    SimpleDateFormat dayTime = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");
	    String str = dayTime.format(new Date(start));
	    System.out.println(str);
		
		Object result = method.proceed();
		
		//���� ��ٸ� �ڵ�
		System.out.println("����");
		long end = System.currentTimeMillis();
        String message = (end-start)+"ms�� �ɸ�";
        System.out.println(message);
		
		return result;
	}

}

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
		//사전 곁다리코드
		System.out.println("사전");
		long start = System.currentTimeMillis();
	    SimpleDateFormat dayTime = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");
	    String str = dayTime.format(new Date(start));
	    System.out.println(str);
		
		Object result = method.proceed();
		
		//사후 곁다리 코드
		System.out.println("사후");
		long end = System.currentTimeMillis();
        String message = (end-start)+"ms가 걸림";
        System.out.println(message);
		
		return result;
	}

}

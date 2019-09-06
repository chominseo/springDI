package ex3.AOP;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Program {

	public static void main(String[] args) {
		/*
		Calculator calc = new DefaultCalculator();
		
		Calculator proxy = (Calculator)Proxy.newProxyInstance(
								DefaultCalculator.class.getClassLoader(),
								new Class[] {Calculator.class},
								new InvocationHandler() {
								
									@Override
									public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

										//사전 곁다리코드
										System.out.println("사전");
										long start = System.currentTimeMillis();
									    SimpleDateFormat dayTime = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");
									    String str = dayTime.format(new Date(start));
									    System.out.println(str);
										
										Object result = method.invoke(calc, args);
										
										//사후 곁다리 코드
										System.out.println("사후");
										long end = System.currentTimeMillis();
						                String message = (end-start)+"ms가 걸림";
						                System.out.println(message);
										
										return result;
									};
								}
								); */
		ApplicationContext context = new ClassPathXmlApplicationContext("ex3/AOP/config.xml");
		Calculator calc = (Calculator)context.getBean("calc");
		System.out.println(calc.sub(3, 4));

	}

}

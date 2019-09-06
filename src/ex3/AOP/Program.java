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

										//���� ��ٸ��ڵ�
										System.out.println("����");
										long start = System.currentTimeMillis();
									    SimpleDateFormat dayTime = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");
									    String str = dayTime.format(new Date(start));
									    System.out.println(str);
										
										Object result = method.invoke(calc, args);
										
										//���� ��ٸ� �ڵ�
										System.out.println("����");
										long end = System.currentTimeMillis();
						                String message = (end-start)+"ms�� �ɸ�";
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

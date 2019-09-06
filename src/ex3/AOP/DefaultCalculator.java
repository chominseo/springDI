package ex3.AOP;

import org.springframework.stereotype.Component;

@Component("target")
public class DefaultCalculator implements Calculator {

	@Override
	public int add(int x, int y) {
		int result = 0;
		result = x + y;
		return result;
	}

	@Override
	public int sub(int x, int y) {
		int result = 0;
		result = x - y;
		return result;
	}

}

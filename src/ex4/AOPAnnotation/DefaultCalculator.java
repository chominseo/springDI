package ex4.AOPAnnotation;

import org.springframework.stereotype.Component;

@Component("calc")
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

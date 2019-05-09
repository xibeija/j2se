package default1;

import java.util.HashSet;
import java.util.Set;

public class TestCollection8 {
	public static void main(String[] args) {

		Set<Integer> numbers = new HashSet<>();
		while (numbers.size()<50) {
			int i = (int)(Math.random()*10000);
			numbers.add(i);
		}
		System.out.println("得到50个不同的随机数：");
		System.out.println(numbers);
		
	}
}

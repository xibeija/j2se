package default1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestCollection6 {

	public static void main(String[] args) {
		List<Integer> numbers = new ArrayList<>();
		for(int i=0; i<10; i++){
			numbers.add(i);
		}
		System.out.println("集合中的数据：");
		System.out.println(numbers);
		Collections.rotate(numbers, 2);
		System.out.println("集合向右滚动2个单位后：");
		System.out.println(numbers);
	}
	
}

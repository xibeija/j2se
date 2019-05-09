package default1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestCollection7 {
	public static void main(String[] args) {
		List<Integer> ls = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			ls.add(i);
		}
		int count = 0;
		for (int i = 0; i < 1000*1000; i++) {
			Collections.shuffle(ls);
			if (ls.get(0)==3 && ls.get(1)==1 && ls.get(2)==4) {
				count++;
			}
		}
		double rate = count/(1000d*1000);
		System.out.println("出现的概率是："+rate*100+"%");
	}
}

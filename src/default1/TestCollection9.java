package default1;

import java.util.LinkedHashSet;
import java.util.Set;

public class TestCollection9 {
	
	public static void main(String[] args) {
        Set<Integer> result = new LinkedHashSet<>();
        String str = String.valueOf(Math.PI);
        // 去掉点
        str = str.replace(".", "");
        char[] cs = str.toCharArray();
        for (char c : cs) {
            int num = Integer.parseInt(String.valueOf(c));
            result.add(num);
        }
        System.out.printf("%s中的无重复数字是：%n",String.valueOf(Math.PI));
        System.out.println(result);
 
    }
	
	/*public static void main(String[] args) {
		List<Integer> l;
		l = new ArrayList<>();
		insertFirst(l, "ArrayList");

		l = new LinkedList<>();
		insertFirst(l, "LinkedList");

	}

	private static void insertFirst(List<Integer> l, String type) {
		int total = 1000 * 100;
		final int number = 5;
		long start = System.currentTimeMillis();
		for (int i = 0; i < total; i++) {
			l.add(0, number);
		}
		long end = System.currentTimeMillis();
		System.out.printf("在%s 最前面插入%d条数据，总共耗时 %d 毫秒 %n", type, total, end - start);
	}*/
}

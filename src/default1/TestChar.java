package default1;

import java.util.Scanner;

public class TestChar {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		s.close();
		char[] cs = str.toCharArray();
		for(int i=0; i<cs.length; i++) {
			if(Character.isUpperCase(cs[i])||Character.isDigit(cs[i])) {
				System.out.print(cs[i]);
			}
		}
		
	}
	
	/*
	 * public static void main(String[] args) { System.out.println("使用空格无法达到对齐的效果");
	 * System.out.println("abc def"); System.out.println("ab def");
	 * System.out.println("a def");
	 * 
	 * System.out.println("使用\\t制表符可以达到对齐的效果"); System.out.println("abc\tdef");
	 * System.out.println("ab\tdef"); System.out.println("a\tdef");
	 * 
	 * System.out.println("一个\\t制表符长度是8"); System.out.println("12345678def");
	 * 
	 * System.out.println("换行符 \\n"); System.out.println("abc\ndef");
	 * 
	 * System.out.println("单引号 \\'"); System.out.println("abc\'def");
	 * System.out.println("双引号 \\\""); System.out.println("abc\"def");
	 * System.out.println("反斜杠本身 \\"); System.out.println("abc\\def"); }
	 */
	
	/*
	 * public static void main(String[] args) {
	 * 
	 * System.out.println(Character.isLetter('a'));//判断是否为字母
	 * System.out.println(Character.isDigit('a')); //判断是否为数字
	 * System.out.println(Character.isWhitespace(' ')); //是否是空白
	 * System.out.println(Character.isUpperCase('a')); //是否是大写
	 * System.out.println(Character.isLowerCase('a')); //是否是小写
	 * 
	 * System.out.println(Character.toUpperCase('A')); //转换为大写
	 * System.out.println(Character.toLowerCase('a')); //转换为小写
	 * 
	 * //String a = 'a'; //不能够直接把一个字符转换成字符串 String a2 = Character.toString('a');
	 * //转换为字符串
	 * 
	 * }
	 */
	
	/*
	 * public static void main(String[] args) { 
	 * char c1='a'; 
	 * Character c = c1; 
	 * c1 = c;
	 * 
	 * }
	 */
	
	
}

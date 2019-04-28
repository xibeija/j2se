package default1;

public class TestString {

	// 递归法破解密码
	public static boolean found = false;

	public static void main(String[] args) {
		String password = randomString(3);
		System.out.println("密码是:" + password);

		char[] guessPassword = new char[password.length()];
		generatePassword(guessPassword, password);
	}

	public static void generatePassword(char[] guessPassword, String password) {
		generatePassword(guessPassword, 0, password);
	}

	public static void generatePassword(char[] guessPassword, int index, String password) {
		if (found)
			return;
		for (short i = '0'; i <= 'z'; i++) {
			char c = (char) i;
			if (!Character.isLetterOrDigit(c))
				continue;
			guessPassword[index] = c;
			if (index != guessPassword.length - 1) {
				generatePassword(guessPassword, index + 1, password);
			} else {
				String guess = new String(guessPassword);
				System.out.println("穷举出来的密码是：" + guess);
				if (guess.equals(password)) {
					System.out.println("找到了，密码是" + guess);
					found = true;
					return;
				}
			}
		}
	}

	private static String randomString(int length) {
		String pool = "";
		for (short i = '0'; i <= '9'; i++) {
			pool += (char) i;
		}
		for (short i = 'a'; i <= 'z'; i++) {
			pool += (char) i;
		}
		for (short i = 'A'; i <= 'Z'; i++) {
			pool += (char) i;
		}
		char cs[] = new char[length];
		for (int i = 0; i < cs.length; i++) {
			int index = (int) (Math.random() * pool.length());
			cs[i] = pool.charAt(index);
		}
		String result = new String(cs);
		return result;
	}

	/*
	 * //多层循环破解密码 public static void main(String[] args) {
	 * 
	 * String password = randomString(3); System.out.println("密码是:" + password);
	 * 
	 * char[] guessPassword = new char[3]; outloop: for (short i = '0'; i <=
	 * 'z'; i++) { for (short j = '0'; j <= 'z'; j++) { for (short k = '0'; k <=
	 * 'z'; k++) { if (!isLetterOrDigit(i, j, k)) continue; guessPassword[0] =
	 * (char) i; guessPassword[1] = (char) j; guessPassword[2] = (char) k;
	 * String guess = new String(guessPassword); //
	 * System.out.println("穷举出来的密码是：" + guess);
	 * 
	 * if (guess.equals(password)) { System.out.println("找到了，密码是" + guess);
	 * break outloop; }
	 * 
	 * } } } }
	 * 
	 * private static boolean isLetterOrDigit(short i, short j, short k) {
	 * return Character.isLetterOrDigit(i) && Character.isLetterOrDigit(j) &&
	 * Character.isLetterOrDigit(k); }
	 * 
	 * private static String randomString(int length) { String pool = ""; for
	 * (short i = '0'; i <= '9'; i++) { pool += (char) i; } for (short i = 'a';
	 * i <= 'z'; i++) { pool += (char) i; } for (short i = 'A'; i <= 'Z'; i++) {
	 * pool += (char) i; } char cs[] = new char[length]; for (int i = 0; i <
	 * cs.length; i++) { int index = (int) (Math.random() * pool.length());
	 * cs[i] = pool.charAt(index); } String result = new String(cs); return
	 * result; }
	 */

	/*
	 * public static void main(String[] args) {
	 * 
	 * String[] ss = new String[8]; for (int i = 0; i < ss.length; i++) { String
	 * randomString = randomString(5); ss[i] = randomString; }
	 * System.out.println("未排序前的字符串数组:");
	 * System.out.println(Arrays.toString(ss));
	 * 
	 * for (int j = 0; j < ss.length; j++) { for (int i = 0; i < ss.length - j -
	 * 1; i++) { char firstChar1 = ss[i].charAt(0); char firstChar2 = ss[i +
	 * 1].charAt(0); firstChar1 = Character.toLowerCase(firstChar1); firstChar2
	 * = Character.toLowerCase(firstChar2);
	 * 
	 * if (firstChar1 > firstChar2) { String temp = ss[i]; ss[i] = ss[i + 1];
	 * ss[i + 1] = temp; } } }
	 * 
	 * System.out.println("排序后的字符串数组:");
	 * System.out.println(Arrays.toString(ss));
	 * 
	 * }
	 * 
	 * private static String randomString(int length) { String pool = ""; for
	 * (short i = '0'; i <= '9'; i++) { pool += (char) i; } for (short i = 'a';
	 * i <= 'z'; i++) { pool += (char) i; } for (short i = 'A'; i <= 'Z'; i++) {
	 * pool += (char) i; } char cs[] = new char[length]; for (int i = 0; i <
	 * cs.length; i++) { int index = (int) (Math.random() * pool.length());
	 * cs[i] = pool.charAt(index); } String result = new String(cs); return
	 * result; }
	 */

	/*
	 * // 方法1 char cs[] = new char[5]; short start = '0'; short end = 'z' + 1;
	 * for (int i = 0; i < cs.length; i++) { while (true) { char c = (char)
	 * ((Math.random() * (end - start)) + start); if (Character.isLetter(c) ||
	 * Character.isDigit(c)) { cs[i] = c; break; } } } String result = new
	 * String(cs); System.out.println(result);
	 * 
	 * // 方法2 String pool = ""; for (short i = '0'; i <= '9'; i++) { pool +=
	 * (char) i; } for (short i = 'a'; i <= 'z'; i++) { pool += (char) i; } for
	 * (short i = 'A'; i <= 'Z'; i++) { pool += (char) i; } char cs2[] = new
	 * char[5]; for (int i = 0; i < cs2.length; i++) { int index = (int)
	 * (Math.random() * pool.length()); cs2[i] = pool.charAt(index); } String
	 * result2 = new String(cs2); System.out.println(result2);
	 * 
	 * }
	 */

	/*
	 * public static void main(String[] args) {
	 * 
	 * String name ="盖伦";
	 * 
	 * System.out.println(name.length());
	 * 
	 * String unknowHero = "";
	 * 
	 * //可以有长度为0的字符串,即空字符串 System.out.println(unknowHero.length());
	 * 
	 * }
	 */

	/*
	 * public static void main(String[] args) { String garen ="盖伦";
	 * //字面值,虚拟机碰到字面值就会创建一个字符串对象 System.out.println(garen);
	 * 
	 * String teemo = new String("提莫"); //创建了两个字符串对象 System.out.println(teemo);
	 * 
	 * char[] cs = new char[]{'崔','斯','特'}; String hero = new String(cs);//
	 * 通过字符数组创建一个字符串对象 System.out.println(hero);
	 * 
	 * String hero3 = garen + teemo;// 通过+加号进行字符串拼接 System.out.println(hero3); }
	 */

}

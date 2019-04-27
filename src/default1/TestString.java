package default1;

public class TestString {

	public static void main(String[] args) {
        
        //方法1
        char cs[] = new char[5];
        short start = '0';
        short end = 'z'+1;
        for (int i = 0; i < cs.length; i++) {
            while (true) {
                char c = (char) ((Math.random() * (end - start)) + start);
                if (Character.isLetter(c) || Character.isDigit(c)) {
                    cs[i] = c;
                    break;
                }
            }
        }
        String result = new String(cs);
        System.out.println(result);
          
        //方法2
        String pool = "";
        for (short i = '0'; i <= '9'; i++) {
            pool+=(char)i;
        }
        for (short i = 'a'; i <= 'z'; i++) {
            pool+=(char)i;
        }
        for (short i = 'A'; i <= 'Z'; i++) {
            pool+=(char)i;
        }
        char cs2[] = new char[5];
        for (int i = 0; i < cs2.length; i++) {
            int index = (int) (Math.random()*pool.length());
            cs2[i] =  pool.charAt( index );
        }
        String result2 = new String(cs2);
        System.out.println(result2);
  
    }
	
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

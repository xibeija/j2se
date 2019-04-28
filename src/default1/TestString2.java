package default1;

public class TestString2 {

	public static void main(String[] args) {
		 
        String[] ss = new String[100];
        // 初始化
        for (int i = 0; i < ss.length; i++) {
            ss[i] = randomString(2);
        }
        // 打印
        for (int i = 0; i < ss.length; i++) {
            System.out.print(ss[i] + " ");
            if (19 == i % 20)
                System.out.println();
        }
 
        for (String s1 : ss) {
            int repeat = 0;
            for (String s2 : ss) {
                if (s1.equalsIgnoreCase(s2)) {
                    repeat++;
                    if (2 == repeat) {
                        // 当repeat==2的时候，就找打了一个非己的重复字符串
 
                        putIntoDuplicatedArray(s1);
                        break;
                    }
                }
            }
        }
 
        System.out.printf("总共有 %d种重复的字符串%n", pos);
        if (pos != 0) {
            System.out.println("分别是：");
            for (int i = 0; i < pos; i++) {
                System.out.print(foundDuplicated[i] + " ");
            }
        }
    }
 
    static String[] foundDuplicated = new String[100];
    static int pos;
 
    private static void putIntoDuplicatedArray(String s) {
        for (int i = 0; i < pos; i++){
            if (foundDuplicated[i].equalsIgnoreCase(s))
                return;
        }
 
        foundDuplicated[pos++] = s;
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
	
	/*public static void main(String[] args) {
        String str1 = "the light";
         
        String start = "the";
        String end = "Ight";
         
        System.out.println(str1.startsWith(start));//以...开始
        System.out.println(str1.endsWith(end));//以...结束
          
    }*/
	
	/*public static void main(String[] args) {
		  
        String str1 = "the light";
          
        String str2 = new String(str1);
         
        String str3 = str1.toUpperCase();
 
        //==用于判断是否是同一个字符串对象
        System.out.println( str1  ==  str2);
         
        System.out.println(str1.equals(str2));//完全一样返回true
         
        System.out.println(str1.equals(str3));//大小写不一样，返回false
        System.out.println(str1.equalsIgnoreCase(str3));//忽略大小写的比较，返回true
         
    }*/
		 
		/*public static void main(String[] args) {
	        String str1 = "the light";
	        String str3 = "the light";
	        System.out.println( str1  ==  str3);
	    }*/
		
        /*String str1 = "the light";
         
        String str2 = new String(str1);
        String str3 = "the light";
         
        //==用于判断是否是同一个字符串对象
        System.out.println( str1  ==  str2);
        System.out.println(str1==str3);
        System.out.println(str1.equals(str2));*/
         
   
	
}

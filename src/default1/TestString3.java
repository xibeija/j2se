package default1;

public class TestString3 {

	public static void main(String[] args) {
        int total = 10000;
        String s = randomString(10);
        StringBuffer sb = new StringBuffer();
         
        String str1 = "";
        long start = System.currentTimeMillis();
         
        for (int i = 0; i <total; i++) {
            str1+=s;
        }
        long end = System.currentTimeMillis();
        System.out.printf("使用字符串连接+的方式，连接%d次，耗时%d毫秒%n",total,end-start);
        total *=100;
        start = System.currentTimeMillis();
        for (int i = 0; i <total; i++) {
            sb.append(s);
        }
        end = System.currentTimeMillis();
        System.out.printf("使用StringBuffer的方式，连接%d次，耗时%d毫秒%n",total,end-start);
         
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
	        String str1 = "the";
	 
	        StringBuffer sb = new StringBuffer(str1);
	         
	        System.out.println(sb.length()); //内容长度
	         
	        System.out.println(sb.capacity());//总空间
	  
	    }*/
	
	/*public static void main(String[] args) {
        String str1 = "let there ";
 
        StringBuffer sb = new StringBuffer(str1); //根据str1创建一个StringBuffer对象
        sb.append("be light"); //在最后追加
         
        System.out.println(sb);
         
        sb.delete(4, 10);//删除4-10之间的字符
         
        System.out.println(sb);
         
        sb.insert(4, "there ");//在4这个位置插入 there
         
        System.out.println(sb);
         
        sb.reverse(); //反转
         
        System.out.println(sb);
 
    }*/
	
}

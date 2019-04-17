package default1;

public class HelloWorld {
	
	public static void main(String[] args) {
		System.out.println("hello world !!!!");
		System.out.println("java forever !!!");
		System.out.println("自己本地的项目，修改一下上传到git");
		System.out.println("再来一次");
		int oxVal = 032;
		System.out.println(oxVal);
		char c = 'A';
		short s = 80;
		c = (char)s;
		System.out.println(c);
		byte b = 5;
		int i1 = 10;
		int i2 = 300;
		b = (byte)i1;
		System.out.println(b);
		b = (byte)i2;
		System.out.println(b);
		System.out.println(Integer.toBinaryString(i2));
	}

}

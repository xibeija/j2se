package default1;

import java.util.Scanner;

public class HelloWorld {
	
	/*public static void method1(final int j){
		System.out.println(j);
	}
	public void method2(final int k){
		System.out.println(k);
	}*/
	
	/*static{
		System.out.println("2号块");
	}
	{
		System.out.println("3号块");
	}*/
	
	public static void main(String[] args) {
/*//先是静态方法的2号块，接着是静态主方法的1号块，接着是静态方法快，接着是普通快，剩下的按顺序执行
//正常执行顺序是从上到下执行，静态块有点特殊！！！
		System.out.println("1号块");
		
		method1(3);
		method1(4);
		method1(5);
		
		System.out.println("----------------------------");
		HelloWorld kk = new HelloWorld();
		kk.method2(33333);*/
		System.out.println("哈哈，Mac配置成功啦！！！！！");
		System.out.println("++++++++++++++++++++++++++++++++++");
		Scanner s = new Scanner(System.in);
		System.out.println(s.nextLine());
		/*Scanner s = new Scanner(System.in);
		System.out.println("今天是周几？");
		int day = s.nextInt();
		String statu = day >= 6 ? "周末" : "工作日" ;
		System.out.println("今天是"+statu);*/
		
		/*int i = 5;
		int j = 6;
		int k = i>j?44:99;
		System.out.println(k);
		System.out.println(i>j?44:99);*/
		/*int i = -10;
		System.out.println(Integer.toBinaryString(i>>1));
		System.out.println(i>>1);
		System.out.println(Integer.toBinaryString(i>>>1));
		System.out.println(i>>>1);*/
		/*int i = 5;
		int j = 6;
		System.out.println(Integer.toBinaryString(i));
		System.out.println(Integer.toBinaryString(j));
		System.out.println(i|j);
		System.out.println(Integer.toBinaryString(i|j));
		System.out.println(i&j);
		System.out.println(Integer.toBinaryString(i&j));
		System.out.println(i^j);
		System.out.println(Integer.toBinaryString(i^j));
		System.out.println(i^0);
		System.out.println(i^i);
		System.out.println(~i);
		System.out.println(Integer.toBinaryString(~i));
		System.out.println(~i);
		System.out.println(Integer.toBinaryString(j));
		System.out.println(j<<1);
		System.out.println(Integer.toBinaryString(j<<1));
		System.out.println(j>>1);
		System.out.println(Integer.toBinaryString(j>>1));*/
		/*Scanner S = new Scanner(System.in);
		System.out.println("请输入你的体重");
		float A = S.nextFloat();
		System.out.println("体重:"+A);
		
		System.out.println("请输入你的身高");
		float B = S.nextFloat();
		System.out.println("身高:"+B);
		System.out.println("比较"+A+">"+B+":"+(A>B));*/
		/*float C = A / (B*B) ;
		System.out.println("BMI:"+C);*/
		
		/*System.out.println("hello world !!!!");
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
		System.out.println(Integer.toBinaryString(i2));*/
	}

}

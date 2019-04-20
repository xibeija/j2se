package default1;

import java.util.Scanner;

public class HelloWorld {

	/*
	 * public static void method1(final int j){ System.out.println(j); } public
	 * void method2(final int k){ System.out.println(k); }
	 */

	/*
	 * static{ System.out.println("2号块"); } { System.out.println("3号块"); }
	 */

	public static void main(String[] args) {
		/*
		 * //先是静态方法的2号块，接着是静态主方法的1号块，接着是静态方法快，接着是普通快，剩下的按顺序执行
		 * //正常执行顺序是从上到下执行，静态块有点特殊！！！ System.out.println("1号块");
		 * 
		 * method1(3); method1(4); method1(5);
		 * 
		 * System.out.println("----------------------------"); HelloWorld kk =
		 * new HelloWorld(); kk.method2(33333);
		 */
		Scanner s = new Scanner(System.in);
		System.out.println("输入月份，判断什么季节？");
		int month = s.nextInt();
		String season = "";
		switch(month){
		case 3:
		case 4:
		case 5:
			season = "春天";
			break;
		case 6:
		case 7:
		case 8:
			season = "夏天";
			break;
		case 9:
		case 10:
		case 11:
			season = "秋天";
			break;
		case 12:
		case 1:
		case 2:
			season = "冬天";
			break;
		default:
			season = "瞎搞";
		}
		System.out.println(month+"月份是"+season);
		/*Scanner s = new Scanner(System.in);
		System.out.println("今天周几？");
		int day = s.nextInt();
		if (day == 1) {
			System.out.println("今天周1");
		} else if (day == 2) {
			System.out.println("今天周2");
		} else if (day == 3) {
			System.out.println("今天周3");
		} else if (day == 4) {
			System.out.println("今天周4");
		} else if (day == 5) {
			System.out.println("今天周5");
		} else if (day == 6) {
			System.out.println("今天周6");
		} else if (day == 7) {
			System.out.println("今天周7");
		} else {
			System.out.println("瞎搞");
		}
		System.out.println("------------------------------");
		switch (day) {
		case 1:
			System.out.println("今天周1");
			break;
		case 2:
			System.out.println("今天周2");
			break;
		case 3:
			System.out.println("今天周3");
			break;
		case 4:
			System.out.println("今天周4");
			break;
		case 5:
			System.out.println("今天周5");
			break;
		case 6:
			System.out.println("今天周6");
			break;
		case 7:
			System.out.println("今天周7");
			break;
		default:
			System.out.println("瞎搞");
		}*/
		/*
		 * Scanner s = new Scanner(System.in); System.out.println("请输入一个年份：");
		 * int year = s.nextInt(); if(0==year%4&&0!=year%100||0==year%400){
		 * System.out.println(year+"是闰年"); }else{
		 * System.out.println(year+"不是闰年"); }
		 */
		/*
		 * boolean b = false; if(b) System.out.println("yse"); else
		 * System.out.println("no");
		 */
		/*
		 * if(!b){ System.out.println("yes1"); System.out.println("yes2"); }
		 * if(!b); System.out.println("yes1"); System.out.println("yes2");
		 */

		/*
		 * System.out.println("哈哈，Mac配置成功啦！！！！！");
		 * System.out.println("怎么不显示时间？？");
		 * System.out.println("好烦啊，，，，git有点乱，不是很懂。。。");
		 */
		System.out.println("++++++++++++++++++++++++++++++++++");
		/*
		 * Scanner s = new Scanner(System.in); System.out.println(s.nextLine());
		 */
		/*
		 * Scanner s = new Scanner(System.in); System.out.println("今天是周几？"); int
		 * day = s.nextInt(); String statu = day >= 6 ? "周末" : "工作日" ;
		 * System.out.println("今天是"+statu);
		 */

		/*
		 * int i = 5; int j = 6; int k = i>j?44:99; System.out.println(k);
		 * System.out.println(i>j?44:99);
		 */
		/*
		 * int i = -10; System.out.println(Integer.toBinaryString(i>>1));
		 * System.out.println(i>>1);
		 * System.out.println(Integer.toBinaryString(i>>>1));
		 * System.out.println(i>>>1);
		 */
		/*
		 * int i = 5; int j = 6; System.out.println(Integer.toBinaryString(i));
		 * System.out.println(Integer.toBinaryString(j));
		 * System.out.println(i|j);
		 * System.out.println(Integer.toBinaryString(i|j));
		 * System.out.println(i&j);
		 * System.out.println(Integer.toBinaryString(i&j));
		 * System.out.println(i^j);
		 * System.out.println(Integer.toBinaryString(i^j));
		 * System.out.println(i^0); System.out.println(i^i);
		 * System.out.println(~i);
		 * System.out.println(Integer.toBinaryString(~i));
		 * System.out.println(~i);
		 * System.out.println(Integer.toBinaryString(j));
		 * System.out.println(j<<1);
		 * System.out.println(Integer.toBinaryString(j<<1));
		 * System.out.println(j>>1);
		 * System.out.println(Integer.toBinaryString(j>>1));
		 */
		/*
		 * Scanner S = new Scanner(System.in); System.out.println("请输入你的体重");
		 * float A = S.nextFloat(); System.out.println("体重:"+A);
		 * 
		 * System.out.println("请输入你的身高"); float B = S.nextFloat();
		 * System.out.println("身高:"+B);
		 * System.out.println("比较"+A+">"+B+":"+(A>B));
		 */
		/*
		 * float C = A / (B*B) ; System.out.println("BMI:"+C);
		 */

		/*
		 * System.out.println("hello world !!!!"); System.out.println(
		 * "java forever !!!"); System.out.println("自己本地的项目，修改一下上传到git");
		 * System.out.println("再来一次"); int oxVal = 032;
		 * System.out.println(oxVal); char c = 'A'; short s = 80; c = (char)s;
		 * System.out.println(c); byte b = 5; int i1 = 10; int i2 = 300; b =
		 * (byte)i1; System.out.println(b); b = (byte)i2; System.out.println(b);
		 * System.out.println(Integer.toBinaryString(i2));
		 */
	}

}

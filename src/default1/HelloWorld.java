package default1;

import java.util.Arrays;

public class HelloWorld {
	public static void main(String[] args) {

		// 枚举遍历
		for (Season s : Season.values()) {
			System.out.println(s);
		}

		// 对二维数组进行重新排序，转变为字符串再进行的排序。
		int[][] a = new int[5][8];
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				a[i][j] = (int) (Math.random() * 100);
				// System.out.print(a[i][j]+" ");
			}
			// System.out.println();
		}
		// System.out.println("=====================");
		for (int[] i : a) {
			System.out.println(Arrays.toString(i));
		}
		System.out.println("***********************************************");
		int[] b = new int[a.length * a[0].length];
		for (int i = 0; i < a.length; i++) {
			System.arraycopy(a[i], 0, b, i * a[i].length, a[i].length);
		}
		Arrays.sort(b);
		for (int i = 0; i < a.length; i++) {
			System.arraycopy(b, i * a[i].length, a[i], 0, a[i].length);
		}
		for (int[] i : a) {
			System.out.println(Arrays.toString(i));
		}

		/*
		 * int[] d = new int[10]; Arrays.fill(d, 1);
		 * System.out.println(Arrays.toString(d));
		 * 
		 * int[] a = new int[]{18, 62, 68, 82, 65, 9}; int[] c = new int[]{18, 62, 68,
		 * 82, 65, 8}; System.out.println(Arrays.equals(a, c));
		 * System.out.print(Arrays.toString(a)); System.out.println();
		 * System.out.println("未排序，输出68所在的位置:"+Arrays.binarySearch(a, 68));
		 * Arrays.sort(a); System.out.print(Arrays.toString(a)); System.out.println();
		 * System.out.println("排序后，输出68所在的位置:"+Arrays.binarySearch(a, 68));
		 * 
		 * System.out.println(); int[] b = Arrays.copyOfRange(a, 1, 3); for(int i=0;
		 * i<b.length; i++){ System.out.print(b[i]+" "); } System.out.println();
		 */

		/*
		 * //二位数组的阵列 int[][] a = new int[5][5]; for(int i=0; i<a.length; i++){ for(int
		 * j=0; j<a[i].length; j++){ a[i][j]=(int)(Math.random()*100); } } for(int[]
		 * row:a){ for(int each:row){ System.out.print(each+" "); }
		 * System.out.println(); } int max=-1; int heng=0; int lie=0; for(int i=0;
		 * i<a.length; i++){ for(int j=0; j<a[i].length; j++){ if(a[i][j]>max){
		 * max=a[i][j]; heng=i; lie=j; } } } System.out.println("数列的最大值是："+max);
		 * System.out.println("坐标是:"+"["+heng+","+lie+"]");
		 */

		/*
		 * //数组之间求和 int[] a = new int[(int)(Math.random()*5+5)]; for(int i=0;
		 * i<a.length; i++){ a[i]=(int)(Math.random()*100); }
		 * System.out.println("数组a的5~10个值是："); for(int i:a){ System.out.print(i+" "); }
		 * System.out.println(); int[] b = new int[(int)(Math.random()*5+5)]; for(int
		 * i=0; i<b.length; i++){ b[i]=(int)(Math.random()*100); }
		 * System.out.println("数组b的5~10个值是："); for(int i:b){ System.out.print(i+" "); }
		 * System.out.println(); int[] c = new int[a.length+b.length];
		 * System.arraycopy(a, 0, c, 0, a.length); System.arraycopy(b, 0, c, a.length,
		 * b.length); System.out.println("数组c的值是a和b的值之和："); for(int i:c){
		 * System.out.print(i+" "); }
		 */

		/*
		 * int a [] = new int[]{18,62,68,82,65,9}; int b[] = new
		 * int[3];//分配了长度是3的空间，但是没有赋值 //通过数组赋值把，a数组的前3位赋值到b数组 //方法一： for循环 for (int i =
		 * 0; i < b.length; i++) { b[i] = a[i]; } //方法二: System.arraycopy(src, srcPos,
		 * dest, destPos, length) //src: 源数组 //srcPos: 从源数组复制数据的启始位置 //dest: 目标数组
		 * //destPos: 复制到目标数组的启始位置 //length: 复制的长度 System.arraycopy(a, 0, b, 0, 3);
		 * //把内容打印出来 for (int i = 0; i < b.length; i++) { System.out.print(b[i] + " ");
		 * }
		 */

		/*
		 * int values [] = new int[]{18,62,68,82,65,9}; //数组中的内容是 for (int each :
		 * values) { System.out.print(each+" "); } System.out.println(); int max = -1;
		 * for (int each : values) { if(each>max) max = each; }
		 * System.out.println("最大的一个值是:"+max);
		 */

		/*
		 * int[] a = new int[5]; System.out.println(a[0]); a[0] = (int)
		 * (Math.random()*100); a[1] = (int) (Math.random()*100); a[2] = (int)
		 * (Math.random()*100); a[3] = (int) (Math.random()*100); a[4] = (int)
		 * (Math.random()*100); System.out.println("数组中的各个随机数是："); for(int i=0;
		 * i<a.length; i++){ System.out.println(a[i]); } for(int i=0; i<a.length/2;
		 * i++){ int temp=a[i];
		 * a[i]=a[a.length-1-i];//a.lengh为总长度5，作为角标最大是4，所以应该先减1，然后再减去i，这样就把位置替换了！！！
		 * a[a.length-1-i]=temp; }
		 * 
		 * //选择排序法，需要i,j,比较的是a[i]与a[j]的大小，i与j之间有关系，i=j+1.j从0开始。
		 * System.out.println("选择排序--从小到大排序"); for (int j = 0; j < a.length-1; j++) {
		 * for (int i = j+1; i < a.length; i++) { if(a[i]<a[j]){ int temp = a[j]; a[j] =
		 * a[i];//主要就是这一步！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！ a[i] = temp; } }
		 * } for (int i = 0; i < a.length; i++) { System.out.print(a[i] + " "); }
		 * System.out.println(); System.out.println("========================");
		 * 
		 * //冒泡排序法，虽然都需要i,j,但是比较的是a[i]与a[i+1]的大小，i与j之间没有关系，i,j都是从0开始。
		 * System.out.println("冒泡排序--从大到小排序"); for (int j = 0; j < a.length; j++) { for
		 * (int i = 0; i < a.length-1-j; i++) { if(a[i]<a[i+1]){ int temp = a[i]; a[i] =
		 * a[i+1];//主要就是这一步！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！ a[i+1] = temp; }
		 * } }
		 * 
		 * //把内容打印出来 for (int i = 0; i < a.length; i++) { System.out.print(a[i] + " ");
		 * } System.out.println();
		 * 
		 * System.out.println("翻转后的值如下："); for(int i=0; i<a.length; i++){
		 * System.out.println(a[i]); } System.out.println("----------------"); int min =
		 * 100; for(int i=0; i<a.length; i++){ if(a[i]<min){ min=a[i]; } }
		 * System.out.println("随机数中的最小值是："+min);
		 */
	}
}
/*
 * int moneyEachDay = 0; int day = 10; int sum=0; for (int i = 1; i <= day; i++)
 * { if(0==moneyEachDay) moneyEachDay = 1; else moneyEachDay *= 2;
 * 
 * sum+=moneyEachDay;
 * 
 * System.out.println(i + " 天之后，洪帮主手中的钱总数是: " + sum ); }
 */

/*
 * package default1;
 * 
 * public class HelloWorld {
 * 
 * 
 * public static void method1(final int j){ System.out.println(j); } public void
 * method2(final int k){ System.out.println(k); }
 * 
 * 
 * 
 * static{ System.out.println("2号块"); } { System.out.println("3号块"); }
 * 
 * 
 * public static void main(String[] args) {
 * 
 * //先是静态方法的2号块，接着是静态主方法的1号块，接着是静态方法快，接着是普通快，剩下的按顺序执行 //正常执行顺序是从上到下执行，静态块有点特殊！！！
 * System.out.println("1号块");
 * 
 * method1(3); method1(4); method1(5);
 * 
 * System.out.println("----------------------------"); HelloWorld kk = new
 * HelloWorld(); kk.method2(33333);
 * 
 * int a = 0; int b = 0; int c = 0; int d = 0;
 * 
 * for (a = -100; a <= 100; a++) { for (b = -100; b <= 100; b++) { for (c =
 * -100; c <= 100; c++) { for (d = -100; d <= 100; d++) {
 * if(8==a+b&&6==c-d&&14==a+c&&10==b+d){
 * System.out.println("a="+a+"--"+"b="+b+"--"+"c="+c+"--"+"d="+d); } } } } } } }
 * 
 * for(int i=100; i<1000; i++){
 * if(i==(i/100)*(i/100)*(i/100)+(i%100/10)*(i%100/10)*(i%100/10)+(i%10)*(i%10)*
 * (i%10)){ System.out.println(i); } } for (int i = 100; i < 1000; i++) {
 * 
 * int baiwei = i / 100; int shiwei = i / 10 % 10; int gewei = i % 10; int cube
 * = baiwei * baiwei * baiwei + shiwei * shiwei * shiwei + gewei * gewei *
 * gewei; if (cube == i) { System.out.println("找到水仙花数:" + i); }
 * 
 * } for(float i=1; i<=20; i++){ for(float j=1; j<=20; j++){ if(0==i%2&0==j%2){
 * break ; } float a = i/j; System.out.println(i+"/"+j+"="+a); } } outloop:
 * //outloop这个标示是可以自定义的比如outloop1,ol2,out5 for (int i = 0; i < 10; i++) {
 * 
 * for (int j = 0; j < 10; j++) { System.out.println(i+":"+j); if(0==j%2) break
 * outloop; //如果是双数，结束外部循环 }
 * 
 * } boolean breakout = false; //是否终止外部循环的标记 for (int i = 0; i < 10; i++) {
 * 
 * for (int j = 0; j < 10; j++) { System.out.println(i + ":" + j); if (0 == j %
 * 2) { //breakout = true; //终止外部循环的标记设置为true break; } } if (breakout)
 * //判断是否终止外部循环 break; } for (int i = 0; i < 10; i++) {
 * 
 * for (int j = 0; j < 10; j++) { System.out.println(i+":"+j); if(0==j%2) break;
 * //如果是双数，结束当前循环 }
 * 
 * } double s = 12000f;// 收入 int n = 0; for (n = 1; s <= 1000000; n++) { s = s +
 * 12000 * (Math.pow(1.2, n)); if (s >= 1000000) break; } System.out.println(n);
 * 
 * for(int i=1; i<=100; i++){ if(i%3==0||i%5==0){ continue; }
 * if(i%3!=0&&i%5!=0){ System.out.println(i); } System.out.println("第一种"+i); }
 * 
 * 
 * for (int j = 0; j < 10; j++) { if(0==j%2){ continue;
 * //如果是双数，后面的代码不执行，直接进行下一次循环 } System.out.println(j); }
 * 
 * 
 * int total=0; for(int d=1;d<11;d++){ double s=Math.pow(2,(d-1)); total+=s;
 * System.out.println("弟"+d+"天要了"+s); } System.out.println("洪乞丐10天要了"+total);
 * Scanner s = new Scanner(System.in); System.out.println("请输入一个整数："); int day =
 * s.nextInt(); int i = 1; int money = 0; int sum = 0;
 * 
 * while(i<=day){ if(money==0){ money = 1; }else{ money = money * 2; } i++; sum
 * = sum + money ; System.out.println(sum); } System.out.println(sum);
 * 
 * 
 * int i = 1; while(1<num){//1<num&1<=num结果都一样！ i = num * i ; num--; }
 * System.out.println(i);
 * 
 * 
 * int n = s.nextInt(); int fac = 1; while(n>=1){ fac *=n; n--; }
 * System.out.println("阶乘是:" + fac);
 * 
 * 
 * Scanner s = new Scanner(System.in); System.out.println("输入月份，判断什么季节？"); int
 * month = s.nextInt(); String season = ""; switch(month){ case 3: case 4: case
 * 5: season = "春天"; break; case 6: case 7: case 8: season = "夏天"; break; case
 * 9: case 10: case 11: season = "秋天"; break; case 12: case 1: case 2: season =
 * "冬天"; break; default: season = "瞎搞"; }
 * System.out.println(month+"月份是"+season);
 * 
 * 
 * Scanner s = new Scanner(System.in); System.out.println("今天周几？"); int day =
 * s.nextInt(); if (day == 1) { System.out.println("今天周1"); } else if (day == 2)
 * { System.out.println("今天周2"); } else if (day == 3) {
 * System.out.println("今天周3"); } else if (day == 4) {
 * System.out.println("今天周4"); } else if (day == 5) {
 * System.out.println("今天周5"); } else if (day == 6) {
 * System.out.println("今天周6"); } else if (day == 7) {
 * System.out.println("今天周7"); } else { System.out.println("瞎搞"); }
 * System.out.println("------------------------------"); switch (day) { case 1:
 * System.out.println("今天周1"); break; case 2: System.out.println("今天周2"); break;
 * case 3: System.out.println("今天周3"); break; case 4:
 * System.out.println("今天周4"); break; case 5: System.out.println("今天周5"); break;
 * case 6: System.out.println("今天周6"); break; case 7:
 * System.out.println("今天周7"); break; default: System.out.println("瞎搞"); }
 * 
 * 
 * Scanner s = new Scanner(System.in); System.out.println("请输入一个年份："); int year
 * = s.nextInt(); if(0==year%4&&0!=year%100||0==year%400){
 * System.out.println(year+"是闰年"); }else{ System.out.println(year+"不是闰年"); }
 * 
 * 
 * boolean b = false; if(b) System.out.println("yse"); else
 * System.out.println("no");
 * 
 * 
 * if(!b){ System.out.println("yes1"); System.out.println("yes2"); } if(!b);
 * System.out.println("yes1"); System.out.println("yes2");
 * 
 * 
 * 
 * System.out.println("哈哈，Mac配置成功啦！！！！！"); System.out.println("怎么不显示时间？？");
 * System.out.println("好烦啊，，，，git有点乱，不是很懂。。。");
 * 
 * 
 * 
 * Scanner s = new Scanner(System.in); System.out.println(s.nextLine());
 * 
 * 
 * Scanner s = new Scanner(System.in); System.out.println("今天是周几？"); int day =
 * s.nextInt(); String statu = day >= 6 ? "周末" : "工作日" ;
 * System.out.println("今天是"+statu);
 * 
 * 
 * 
 * int i = 5; int j = 6; int k = i>j?44:99; System.out.println(k);
 * System.out.println(i>j?44:99);
 * 
 * 
 * int i = -10; System.out.println(Integer.toBinaryString(i>>1));
 * System.out.println(i>>1); System.out.println(Integer.toBinaryString(i>>>1));
 * System.out.println(i>>>1);
 * 
 * 
 * int i = 5; int j = 6; System.out.println(Integer.toBinaryString(i));
 * System.out.println(Integer.toBinaryString(j)); System.out.println(i|j);
 * System.out.println(Integer.toBinaryString(i|j)); System.out.println(i&j);
 * System.out.println(Integer.toBinaryString(i&j)); System.out.println(i^j);
 * System.out.println(Integer.toBinaryString(i^j)); System.out.println(i^0);
 * System.out.println(i^i); System.out.println(~i);
 * System.out.println(Integer.toBinaryString(~i)); System.out.println(~i);
 * System.out.println(Integer.toBinaryString(j)); System.out.println(j<<1);
 * System.out.println(Integer.toBinaryString(j<<1)); System.out.println(j>>1);
 * System.out.println(Integer.toBinaryString(j>>1));
 * 
 * 
 * Scanner S = new Scanner(System.in); System.out.println("请输入你的体重"); float A =
 * S.nextFloat(); System.out.println("体重:"+A);
 * 
 * System.out.println("请输入你的身高"); float B = S.nextFloat();
 * System.out.println("身高:"+B); System.out.println("比较"+A+">"+B+":"+(A>B));
 * 
 * 
 * float C = A / (B*B) ; System.out.println("BMI:"+C);
 * 
 * 
 * 
 * System.out.println("hello world !!!!"); System.out.println(
 * "java forever !!!"); System.out.println("自己本地的项目，修改一下上传到git");
 * System.out.println("再来一次"); int oxVal = 032; System.out.println(oxVal); char
 * c = 'A'; short s = 80; c = (char)s; System.out.println(c); byte b = 5; int i1
 * = 10; int i2 = 300; b = (byte)i1; System.out.println(b); b = (byte)i2;
 * System.out.println(b); System.out.println(Integer.toBinaryString(i2));
 * 
 */
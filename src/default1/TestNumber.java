package default1;

public class TestNumber {
	private static boolean isPrime(int i){
		for(int j=2; j<=Math.sqrt(i); j++){
			if(0==i%j){
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		int max = 1000*10000;
		int count = 0;
		long start = System.currentTimeMillis();
		for(int i=1; i<=max; i++){
			if(isPrime(i)){
				count++;
			}
		}
		long end = System.currentTimeMillis();
		System.out.println("时间："+(end-start));
		System.out.println("一千万以内的质数有几个："+count);
		
		
		float f1 = 4.4f;
		float f2 = 4.5f;
		System.out.println(Math.round(f1));
		System.out.println(Math.round(f2));
		System.out.println(Math.random());
		System.out.println((int)(Math.random()*10));
		System.out.println(Math.sqrt(9));
		System.out.println(Math.pow(2, 4));
		System.out.println(Math.PI);
		System.out.println(Math.E);
		int n = Integer.MAX_VALUE;
		System.out.println(Math.pow(1+1d/n, n));
		
		
		String str3 = "999";
		int j = Integer.parseInt(str3);
		System.out.println(j);
		
		int i = 5;
		String str = String.valueOf(i);
		System.out.println(str);
		Integer it = i;
		String str2 = it.toString();
		System.out.println(str2);
		//Integer it = new Integer(i);
		int i2 = it.intValue();
		System.out.println(it instanceof Number);
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Byte.MAX_VALUE);
	}
	
}

package default1;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
 
public class TestDate {
 
	private static SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	   
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
          
        System.out.println("今天是:" + format( c.getTime()));
        //先翻到下下个月
        c.add(Calendar.MONTH,2);
        //设置到月初
        c.set(Calendar.DATE,1);
        //再往回翻3天
        c.add(Calendar.DATE,-3);
         Exception e;
        System.out.println("下个月倒数第三天是:" + format(c.getTime()));
          
    }
   
    private static String format(Date time) {
        return sdf.format(time);
    }
	
	/*private static SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	 
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        Date now = c.getTime();
        // 当前日期
        System.out.println("当前日期：\t" + format(c.getTime()));
 
        // 下个月的今天
        c.setTime(now);
        c.add(Calendar.MONTH, 1);
        System.out.println("下个月的今天:\t" +format(c.getTime()));
 
        // 去年的今天
        c.setTime(now);
        c.add(Calendar.YEAR, -1);
        System.out.println("去年的今天:\t" +format(c.getTime()));
 
        // 上个月的第三天
        c.setTime(now);
        c.add(Calendar.MONTH, -1);
        c.set(Calendar.DATE, 3);
        System.out.println("上个月的第三天:\t" +format(c.getTime()));
 
    }
 
    private static String format(Date time) {
        return sdf.format(time);
    }*/
	
    /*public static void main(String[] args) {
        int yearStart = 1970;
        int yearEnd = 2000;
 
        Date[] ds = new Date[9];
        for (int i = 0; i < ds.length; i++) {
            ds[i] = getRandomDate(yearStart, yearEnd);
        }
         
        System.out.println("得到的随机日期数组:");
        for (int i = 0; i < ds.length; i++) {
            System.out.print(toString(ds[i])+"\t");
            if(2==i%3)
                System.out.println();
        }
         
        //选择法排序
        for (int j = 0; j < ds.length-1; j++) {
            for (int i = j+1; i < ds.length; i++) {
                String strTimeI = toString(ds[i],"HHmmss");
                String strTimeJ = toString(ds[j],"HHmmss");
 
                int lTimeI = Integer.parseInt(strTimeI);
                int lTimeJ = Integer.parseInt(strTimeJ);
 
                if( lTimeI<lTimeJ  ){  
                    Date temp = ds[j];
                    ds[j] = ds[i];
                    ds[i] = temp;
                }
            }
        }      
         
        System.out.println("排序后的随机日期数组:");
        for (int i = 0; i < ds.length; i++) {
            System.out.print(toString(ds[i])+"\t");
            if(2==i%3)
                System.out.println();
        }
         
    }
 
    public static String toString(Date d) {
        return toString(d, "yyyy-MM-dd HH:mm:ss");
    }
 
    public static String toString(Date d, String format) {
        SimpleDateFormat sdf = new SimpleDateFormat(format);
        return sdf.format(d);
    }
 
    private static Date getRandomDate(int yearStart, int yearEnd) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy");
        try {
            Date dStart = sdf.parse(String.valueOf(yearStart)); // 1970
            Date dEnd = sdf.parse(String.valueOf(yearEnd + 1)); // 2001 不是 2000，要在2001的基础上减少以毫秒，才表示2000最后一刻
            long timeStart = dStart.getTime();
            long timeEnd = dEnd.getTime() - 1;
            long timeRandom = (long) (timeStart + Math.random() * (timeEnd - timeStart));
            return new Date(timeRandom);
 
        } catch (ParseException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
 
        return null;
    }*/
	
	/*public static void main(String[] args) {
        SimpleDateFormat sdf =new SimpleDateFormat("yyyy/MM/dd HH:mm:ss" );
  
        String str = "2016/1/5 12:12:12";
          
        try {
            Date d = sdf.parse(str);
            System.out.printf("字符串 %s 通过格式  yyyy/MM/dd HH:mm:ss %n转换为日期对象: %s",str,d.toString());
        } catch (ParseException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
          
    }*/
	
	/*public static void main(String[] args) {
        
        //y 代表年
        //M 代表月
        //d 代表日
        //H 代表24进制的小时
        //h 代表12进制的小时
        //m 代表分钟
        //s 代表秒
        //S 代表毫秒
        SimpleDateFormat sdf =new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS" );
        Date d= new Date();
        String str = sdf.format(d);
        System.out.println("当前时间通过 yyyy-MM-dd HH:mm:ss SSS 格式化后的输出: "+str);
         
        SimpleDateFormat sdf1 =new SimpleDateFormat("yyyy-MM-dd" );
        Date d1= new Date();
        String str1 = sdf1.format(d1);
        System.out.println("当前时间通过 yyyy-MM-dd 格式化后的输出: "+str1);
         
    }*/
	
	/*public static void main(String[] args) {
        long second = 1000;
        long minute = 60*second;
        long hour = minute * 60;
        long day = hour*24;
        long year = day * 365;
        long year1995Start  = (1995-1970) * year;
        long leapDay = (1995-1970)/4*day; //每隔4年有一个润日
        year1995Start+=leapDay;
        long eightHour = hour*8; //8个小时的毫秒数，因为从0毫秒对应的是1970.1.1 08:00:00
        year1995Start-=eightHour;
         
        Date dStart = new Date(year1995Start);
        System.out.println("1995年第一天："+dStart);
        long year1995End = year1995Start + year - 1;
        Date dEnd = new Date(year1995End);
        System.out.println("1995年最后一天："+dEnd);
         
        long randomTime = (long) (Math.random()*(year-1) + year1995Start);
        Date dRandom = new Date(randomTime);
        System.out.println("1995年这一年中的一个随机时间:" + dRandom);
          
    }*/
	
	/*public static void main(String[] args) {
        Date now= new Date();
  
        //当前日期的毫秒数
        System.out.println("Date.getTime() \t\t\t返回值: "+now.getTime());
        //通过System.currentTimeMillis()获取当前日期的毫秒数
        System.out.println("System.currentTimeMillis() \t返回值: "+System.currentTimeMillis());
           
    }*/
	
	/*public static void main(String[] args) {
        //注意：是java.util.Date;
        //而非 java.sql.Date，此类是给数据库访问的时候使用的
        Date now= new Date();
        //打印当前时间
        System.out.println("当前时间:"+now.toString());
        //getTime() 得到一个long型的整数
        //这个整数代表 1970.1.1 08:00:00:000，每经历一毫秒，增加1
        System.out.println("当前时间getTime()返回的值是："+now.getTime());
          
        Date zero = new Date(0);
        System.out.println("用0作为构造方法，得到的日期是:"+zero);
          
    }*/
	
	/*public static void main(String[] args) {
		 
        // 当前时间
        Date d1 = new Date();
        System.out.println("当前时间:");
        System.out.println(d1);
        System.out.println();
        // 从1970年1月1日 早上8点0分0秒 开始经历的毫秒数
        Date d2 = new Date(5000);
        System.out.println("从1970年1月1日 早上8点0分0秒 开始经历了5秒的时间");
        System.out.println(d2);
 
    }*/
	
}

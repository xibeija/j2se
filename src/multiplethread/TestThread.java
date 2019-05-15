package multiplethread;

import java.io.File;

public class TestThread {
	static ThreadPool pool= new ThreadPool();
    public static void search(File file, String search) {
         
        if (file.isFile()) {
            if(file.getName().toLowerCase().endsWith(".java")){
                SearchFileTask task = new SearchFileTask(file, search);
                pool.add(task);
            }
        }
        if (file.isDirectory()) {
            File[] fs = file.listFiles();
            for (File f : fs) {
                search(f, search);
            }
        }
    }
       
    public static void main(String[] args) {
        File folder =new File("e:\\project");
        search(folder,"Magic");
    }
}
    /*public static void main(String[] args) {
            
        final Hero gareen = new Hero();
        gareen.name = "盖伦";
        gareen.hp = 10000;
           
        System.out.printf("盖伦的初始血量是 %.0f%n", gareen.hp);
           
        //多线程同步问题指的是多个线程同时修改一个数据的时候，导致的问题
           
        //假设盖伦有10000滴血，并且在基地里，同时又被对方多个英雄攻击
           
        //用JAVA代码来表示，就是有多个线程在减少盖伦的hp
        //同时又有多个线程在恢复盖伦的hp
           
        //n个线程增加盖伦的hp
           
        int n = 10000;
   
        Thread[] addThreads = new Thread[n];
        Thread[] reduceThreads = new Thread[n];
           
        for (int i = 0; i < n; i++) {
            Thread t = new Thread(){
                public void run(){
                    gareen.recover();
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }
                }
            };
            t.start();
            addThreads[i] = t;
               
        }
           
        //n个线程减少盖伦的hp
        for (int i = 0; i < n; i++) {
            Thread t = new Thread(){
                public void run(){
                    gareen.hurt();
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }
                }
            };
            t.start();
            reduceThreads[i] = t;
        }
           
        //等待所有增加线程结束
        for (Thread t : addThreads) {
            try {
                t.join();
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        //等待所有减少线程结束
        for (Thread t : reduceThreads) {
            try {
                t.join();
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
           
        //代码执行到这里，所有增加和减少线程都结束了
           
        //增加和减少线程的数量是一样的，每次都增加，减少1.
        //那么所有线程都结束后，盖伦的hp应该还是初始值
           
        //但是事实上观察到的是：
                   
        System.out.printf("%d个增加线程和%d个减少线程结束后%n盖伦的血量变成了 %.0f%n", n,n,gareen.hp);
           
    }
        
}*/

//public class TestThread {
//	 
//    public static boolean found = false;
//     
//    public static void main(String[] args) {
//        String password = randomString(3);
//        System.out.println("密码是:" + password);
//        List<String> passwords = new ArrayList<>();
//         
//        new PasswordThread(password,passwords).start();
//        new LogThread(passwords).start();
//         
//    }
// 
//    private static String randomString(int length) {
//        String pool = "";
//        for (short i = '0'; i <= '9'; i++) {
//            pool += (char) i;
//        }
//        for (short i = 'a'; i <= 'z'; i++) {
//            pool += (char) i;
//        }
//        for (short i = 'A'; i <= 'Z'; i++) {
//            pool += (char) i;
//        }
//        char cs[] = new char[length];
//        for (int i = 0; i < cs.length; i++) {
//            int index = (int) (Math.random() * pool.length());
//            cs[i] = pool.charAt(index);
//        }
//        String result = new String(cs);
//        return result;
//    }
// 
//}

/*public class TestThread {
  
    public static void search(File file, String search) {
        if (file.isFile()) {
            if(file.getName().toLowerCase().endsWith(".java")){
                //当找到.java文件的时候，就启动一个线程，进行专门的查找
                new SearchFileThread(file,search).start();
            }
        }
        if (file.isDirectory()) {
            File[] fs = file.listFiles();
            for (File f : fs) {
                search(f, search);
            }
        }
    }
      
    public static void main(String[] args) {
        File folder =new File("e:\\project");
        search(folder,"Magic");
    }
}*/


/*package multiplethread;

import charactor.Hero;

public class TestThread {

	public static void main(String[] args) {
		Hero gareen = new Hero();
		gareen.name = "盖伦";
		gareen.hp = 616;
		gareen.damage = 50;

		Hero teemo = new Hero();
		teemo.name = "提莫";
		teemo.hp = 300;
		teemo.damage = 30;

		Hero bh = new Hero();
		bh.name = "赏金猎人";
		bh.hp = 500;
		bh.damage = 65;

		Hero leesin = new Hero();
		leesin.name = "盲僧";
		leesin.hp = 454;
		leesin.damage = 80;
		
		//匿名类
        Thread t1= new Thread(){
            public void run(){
                //匿名类中用到外部的局部变量teemo，必须把teemo声明为final
                //但是在JDK7以后，就不是必须加final的了
                while(!teemo.isDead()){
                    gareen.attackHero(teemo);
                }              
            }
        };
         
        t1.start();
          
        Thread t2= new Thread(){
            public void run(){
                while(!leesin.isDead()){
                    bh.attackHero(leesin);
                }              
            }
        };
        t2.start();
		
		Battle battle1 = new Battle(gareen,teemo);
        
        new Thread(battle1).start();
 
        Battle battle2 = new Battle(bh,leesin);
        new Thread(battle2).start();

		KillThread killThread2 = new KillThread(bh,leesin);
        killThread2.start();
		
		KillThread killThread1 = new KillThread(gareen,teemo);
        killThread1.start();
        
//        KillThread killThread2 = new KillThread(bh,leesin);
//        killThread2.start();
		
//		// 盖伦攻击提莫
//		while (!teemo.isDead()) {
//			gareen.attackHero(teemo);
//		}
//
//		// 赏金猎人攻击盲僧
//		while (!leesin.isDead()) {
//			bh.attackHero(leesin);
//		}
	}

}
*/
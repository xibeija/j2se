package charactor;

public class Hero {
    //增加id属性
    public int id;
    public String name;
    public float hp;
    public int damage;
 
}


//public class Hero{
//    public String name;
//    public AtomicInteger hp = new AtomicInteger();
//      
//    public int damage;
//      
//    public  void recover(){
//        hp.incrementAndGet();
//    }
//      
//    public void hurt(){
//        hp.decrementAndGet();   
//    }
//      
//    public void attackHero(Hero h) {
//        h.hp.addAndGet(0-damage);
//        System.out.format("%s 正在攻击 %s, %s的血变成了 %.0f%n",name,h.name,h.name,h.hp);
//        if(h.isDead())
//            System.out.println(h.name +"死了！");
//    }
//   
//    public boolean isDead() {
//        return 0>=hp.intValue()?true:false;
//    }
//   
//}

//public class Hero {
//	public String name;
//	public float hp;
//
//	public int damage;
//
//	// 回血
////    public void recover(){
//	//直接在方法前加上修饰符synchronized
//    //其所对应的同步对象，就是this
//    //和hurt方法达到的效果一样
//	public synchronized void recover() {
//		hp = hp + 1;
//	}
//
//	// 掉血
//	public void hurt() {
////        hp=hp-1;
//		// 使用this作为同步对象
//		synchronized (this) {
//			hp = hp - 1;
//		}
//	}
//
//	public void attackHero(Hero h) {
//		h.hp -= damage;
//		System.out.format("%s 正在攻击 %s, %s的血变成了 %.0f%n", name, h.name, h.name, h.hp);
//		if (h.isDead())
//			System.out.println(h.name + "死了！");
//	}
//
//	public boolean isDead() {
//		return 0 >= hp ? true : false;
//	}
//
//}

//public class Hero {
//
//	public String name;
//	public float hp;
//	public int damage;
//	public void attackHero(Hero h) {
//		try {
//			Thread.sleep(1000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		h.hp -= damage;
//		System.out.format("%s正在攻击%s, %s的血变成了%.0f%n",name,h.name,h.name,h.hp);
//		if (h.isDead()) {
//			System.out.println(h.name + "死了！！！");
//		}
//	}
//	public boolean isDead() {
//		return 0>=hp?true:false;
//	}
//	
//}

package multiplethread;

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

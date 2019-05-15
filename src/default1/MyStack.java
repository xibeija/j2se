package default1;

import java.util.LinkedList;
import charactor.Hero;

public class MyStack {
    
    LinkedList<Hero> heros = new LinkedList<Hero>();
        
    //插入的时候，加上synchronized，同步对象是当前实例
    public synchronized void push(Hero h) {
        heros.addLast(h);
    }
    
    //取出的时候，加上synchronized，同步对象是当前实例
    public synchronized Hero pull() {
        return heros.removeLast();
    }
    
    //查看没必要加上synchronized，因为不修改数据
    public Hero peek() {
        return heros.getLast();
    }
   
}

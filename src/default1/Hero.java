package default1;

public class Hero {
    
    String name; //姓名
        
    float hp; //血量
        
    float armor; //护甲
        
    int moveSpeed; //移动速度
     
    public Hero(){
         
    }
     
    public Hero(String name,float hp){
        this.name = name;
        this.hp = hp;
    }
 
    //复活
    public void revive(Hero h){
        h = new Hero("提莫",383);
    }
 
    public static void main(String[] args) {
        Hero teemo =  new Hero("提莫",383);
         
        //受到400伤害，挂了
        teemo.hp = teemo.hp - 400;
        System.out.println(teemo.hp);
        
        teemo.revive(teemo);
        System.out.println(teemo.hp);
         
        //问题： System.out.println(teemo.hp); 输出多少？ 怎么理解？
         
    }
      
}

/*package default1;

public class Hero {

	String name;
	float hp;
	float armor;
	int moveSpeed;
	
	int killed;
	int kill;
	int support;
	int money;
	int lastHit;
	int attackSpeed;
	String wordAfterkill;
	String woedAfterkilled;
	
	void keng(){
		System.out.println("坑队友");
	}
	float getArmor(){
		return armor;
	}
	void addSpeed(int speed){
		moveSpeed = moveSpeed + speed ;
	}
	void legendary(){
		System.out.println("超神了");
	}
	float getHp(){
		return hp;
	}
	void recovery(float blood){
		hp = hp + blood ;
	}
	
	
	public static void main(String[] args) {
		Hero garen = new Hero();
		garen.name = "盖伦";
		garen.hp = 616.28f;
		garen.armor = 27.536f;
		garen.moveSpeed = 350;
		garen.addSpeed(100);
		System.out.println(garen.moveSpeed);
		garen.keng();
		System.out.println(garen.getArmor());
		garen.recovery(100);
		System.out.println(garen.hp);
		
		
		
		
		Hero teemo = new Hero();
		teemo.name = "提莫";
		teemo.hp = 383f;
		teemo.armor = 14f;
		teemo.moveSpeed = 330;
		
		System.out.println(garen.moveSpeed);
		System.out.println(teemo.moveSpeed);
		System.out.println(garen.moveSpeed==teemo.moveSpeed);
		System.out.println(garen.moveSpeed);
		
	}
	
}*/

/*package default1;

public class Hero {
 
    String name;
 
    float hp;
 
    float armor;
 
    int moveSpeed;
 
    // 方法名和类名一样（包括大小写）
    // 没有返回类型
    public Hero() {
        System.out.println("实例化一个对象的时候，必然调用构造方法");
    }
     
    public static void main(String[] args) {
        //实例化一个对象的时候，必然调用构造方法
        Hero h = new Hero();
    }
 
}*/


/*public class Hero {
	 
    public static void main(String[] args) {
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = new Random().nextInt(200);
        }
        xuanZeSort(array);
        maoPaoReverseSort(array);
    }
 
    private static void xuanZeSort(int[] array) {
        System.out.println("before xuanZeSort:" + Arrays.toString(array));
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    array[i] += array[j];
                    array[j] = array[i] - array[j];
                    array[i] -= array[j];
                }
            }
        }
        System.out.println("after xuanZeSort:" + Arrays.toString(array));
    }
 
    private static void maoPaoReverseSort(int[] array) {
        System.out.println("before maoPaoReverseSort:" + Arrays.toString(array));
        for (int i = array.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j] < array[j + 1]) {
                    array[j] += array[j + 1];
                    array[j + 1] = array[j] - array[j + 1];
                    array[j] -= array[j + 1];
                }
            }
        }
        System.out.println("after maoPaoReverseSort:" + Arrays.toString(array));
    }
}*/
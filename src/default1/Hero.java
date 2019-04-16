package default1;

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
		
		/*System.out.println(garen.moveSpeed);
		System.out.println(teemo.moveSpeed);
		System.out.println(garen.moveSpeed==teemo.moveSpeed);
		System.out.println(garen.moveSpeed);*/
		
	}
	
}

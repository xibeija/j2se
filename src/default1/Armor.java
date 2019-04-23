package default1;

public class Armor extends Item {

	int ac;
	public static void main(String[] args) {
		  Armor cloth = new Armor();
		  cloth.name = "布甲";
		  cloth.price = 300;
		  cloth.ac = 15;
		  
		  Armor chainMail = new Armor();
		  chainMail.name = "锁子甲";
		  chainMail.price = 500;
		  chainMail.ac = 40;
	}
	
}

package default1;

public class Spider extends Animal {

	@Override
	public void eat() {
		System.out.println("spider eating");
	}
	
	public Spider() {
		super(8);
	}
	
}

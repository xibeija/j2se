package default1;

public class Fish extends Animal implements Pet {

	private String name;

	protected Fish() {
		super(0);
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("Fish is eating");
	}

	public void walk() {
		// TODO Auto-generated method stub
		System.out.println("Swimming");
	}

	@Override
	public void setName(String name) {
		// TODO Auto-generated method stub
		this.name = name;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return this.name;
	}

	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("playing");
	}

}

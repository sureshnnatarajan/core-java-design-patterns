package core.java.design.patterns.singleton.versions;

public class SingletonVersionSix implements Cloneable {

	private static SingletonVersionSix singletonInstance = new SingletonVersionSix();
	
	private SingletonVersionSix() { }
	
	public static SingletonVersionSix getInstance() {
		return singletonInstance;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException();
	}
	
	public void singletonMemberMethod() {
		System.out.println("I am a member of the SingletonVersionSix instance !");
	}
}

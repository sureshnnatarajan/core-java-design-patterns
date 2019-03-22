package core.java.design.patterns.singleton.versions;

public class SingletonVersionSeven implements Cloneable {

	private static SingletonVersionSeven singletonInstance = new SingletonVersionSeven();
	
	private SingletonVersionSeven() { }
	
	public static SingletonVersionSeven getInstance() {
		return singletonInstance;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return singletonInstance;
	}
	
	public void singletonMemberMethod() {
		System.out.println("I am a member of the SingletonVersionSeven instance !");
	}
}

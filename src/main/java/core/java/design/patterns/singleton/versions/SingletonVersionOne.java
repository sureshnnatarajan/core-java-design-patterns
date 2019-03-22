package core.java.design.patterns.singleton.versions;

public class SingletonVersionOne {

	private static SingletonVersionOne singletonInstance;
	
	private SingletonVersionOne() { }
	
	public static SingletonVersionOne getInstance() {
		if (singletonInstance == null) {
			singletonInstance = new SingletonVersionOne();
		}
		return singletonInstance;
	}
	
	public void singletonMemberMethod() {
		System.out.println("I am a member of the SingletonVersionOne instance !");
	}
}

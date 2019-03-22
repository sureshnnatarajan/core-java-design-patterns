package core.java.design.patterns.singleton.versions;

public class SingletonVersionThree {

	private static SingletonVersionThree singletonInstance;
	
	private SingletonVersionThree() { }
	
	public static SingletonVersionThree getInstance() {
		if (singletonInstance == null) {
			synchronized(SingletonVersionThree.class) {
				singletonInstance = new SingletonVersionThree();
			}
		}
		return singletonInstance;
	}
	
	public void singletonMemberMethod() {
		System.out.println("I am a member of the SingletonVersionThree instance !");
	}
}

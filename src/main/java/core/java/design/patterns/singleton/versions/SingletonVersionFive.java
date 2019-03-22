package core.java.design.patterns.singleton.versions;

public class SingletonVersionFive {

	//This is eager (or) early instantiation --> Initialized during class load
	private static SingletonVersionFive singletonInstance = new SingletonVersionFive();
	
	private SingletonVersionFive() {}
	
	public static SingletonVersionFive getInstance() {
		return singletonInstance;
	}
	
	public void singletonMemberMethod() {
		System.out.println("I am a member of the SingletonVersionFive instance !");
	}
}

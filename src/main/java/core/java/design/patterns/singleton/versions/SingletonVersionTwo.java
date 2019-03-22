package core.java.design.patterns.singleton.versions;

public class SingletonVersionTwo {

	private static SingletonVersionTwo singletonInstance;
	
	private SingletonVersionTwo() { }
	
	public synchronized static SingletonVersionTwo getInstance() {
		
		if (singletonInstance == null) {
			singletonInstance = new SingletonVersionTwo();
		}
		return singletonInstance;
	}
	
	public void singletonMemberMethod() {
		System.out.println("I am a member of the SingletonVersionTwo instance !");
	}
}

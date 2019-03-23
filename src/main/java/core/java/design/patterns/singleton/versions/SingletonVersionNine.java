package core.java.design.patterns.singleton.versions;

/**
 * Singleton class marked as final 
 * 
 * @author suresh.natarajan
 *
 */
public final class SingletonVersionNine {
	
	public static SingletonVersionNine singletonInstance = new SingletonVersionNine();
	
	private SingletonVersionNine() { }
	
	public static SingletonVersionNine getInstance() {
		return singletonInstance;
	}
	
	public void singletonMemberMethod() {
		System.out.println("I am a member of the SingletonVersionNine instance !");
	}
}

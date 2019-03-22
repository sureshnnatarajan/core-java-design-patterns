package core.java.design.patterns.singleton.versions;

import java.io.Serializable;

public class SingletonVersionEight implements Serializable {

	private static final long serialVersionUID = -2365536593950440243L;
	
	//This is eager (or) early instantiation --> Initialized during class load
	private static SingletonVersionEight singletonInstance = new SingletonVersionEight();
	
	private SingletonVersionEight() {}
	
	public static SingletonVersionEight getInstance() {
		return singletonInstance;
	}
	
	public void singletonMemberMethod() {
		System.out.println("I am a member of the SingletonVersionEight instance !");
	}
	
	protected Object readResolve() {
		return singletonInstance;
	}
}

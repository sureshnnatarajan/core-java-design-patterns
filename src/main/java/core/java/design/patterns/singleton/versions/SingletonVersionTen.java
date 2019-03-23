package core.java.design.patterns.singleton.versions;

import java.io.Serializable;

/**
 * SingletonVersionTen class implements <code>Cloneable</code>, <code>Serializable</code>
 * 
 * SingletonVersionTen class is marked as <code>final</code> and cannot be subclassed 
 * 
 * @author suresh.natarajan
 *
 */
public final class SingletonVersionTen implements Cloneable, Serializable {

	private static final long serialVersionUID = -100875140030055439L;

	//This is eager (or) early instantiation --> Initialized during class load
	public static SingletonVersionTen singletonInstance = new SingletonVersionTen();
	
	private SingletonVersionTen() { }
	
	public SingletonVersionTen getInstance() {
		return singletonInstance;
	}
	
	//Clone method overridden and the initialized instance is returned
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return singletonInstance;
	}

	//Read resolve method overridden and the initialized instance is returned
	protected Object readResolve() {
		return singletonInstance;
	}

	public void singletonMemberMethod() {
		System.out.println("I am a member of the SingletonVersionTen instance !");
	}
}

package core.java.design.patterns.singleton.versions;

/**
 * Driver class is part of versions package since the 'clone' method will not be visible outside the package
 *  
 * @author suresh.natarajan
 *
 */
public class SingletonVersionSevenDriver {

	public static void main(String[] args) {
		
		SingletonVersionSeven instance = SingletonVersionSeven.getInstance();
		System.out.println("instance--hashcode -->" + instance.hashCode());
		
		try {
			SingletonVersionSeven clone = (SingletonVersionSeven) instance.clone();
			System.out.println("clone--hashcode -->" + clone.hashCode());
			
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		
	}

}

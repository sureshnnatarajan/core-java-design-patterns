package core.java.design.patterns.singleton.versions;

import core.java.design.patterns.singleton.versions.SingletonVersionSix;

/**
 * Driver class is part of versions package since the 'clone' method will not be visible outside the package
 *  
 * @author suresh.natarajan
 *
 */
public class SingletonVersionSixDriver {

	public static void main(String[] args) {
		
		SingletonVersionSix instance = SingletonVersionSix.getInstance();
		System.out.println("instance--hashcode -->" + instance.hashCode());
		
		try {
			SingletonVersionSix clone = (SingletonVersionSix) instance.clone();
			System.out.println("clone--hashcode -->" + clone.hashCode());
			
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		
	}

}

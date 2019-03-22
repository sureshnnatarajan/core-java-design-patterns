package core.java.design.patterns.singleton.drivers;

import core.java.design.patterns.singleton.versions.SingletonVersionFive;

public class SingletonVersionFiveDriver {

	public static void main(String[] args) {
		SingletonVersionFive instance = SingletonVersionFive.getInstance();
		
		instance.singletonMemberMethod();

	}

}

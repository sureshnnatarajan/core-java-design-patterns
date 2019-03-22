package core.java.design.patterns.singleton.drivers;

import core.java.design.patterns.singleton.versions.SingletonVersionTwo;

public class SingletonVersionTwoDriver {

	public static void main(String[] args) {

		SingletonVersionTwo instance = SingletonVersionTwo.getInstance();
		
		instance.singletonMemberMethod();
	}

}

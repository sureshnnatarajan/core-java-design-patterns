package core.java.design.patterns.singleton.drivers;

import core.java.design.patterns.singleton.versions.SingletonVersionThree;

public class SingletonVersionThreeDriver {

	public static void main(String[] args) {
		SingletonVersionThree instance = SingletonVersionThree.getInstance();

		instance.singletonMemberMethod();
	}

}

package core.java.design.patterns.singleton.drivers;

import core.java.design.patterns.singleton.versions.SingletonVersionFour;

public class SingletonVersionFourDriver {

	public static void main(String[] args) {
		SingletonVersionFour instance = SingletonVersionFour.getInstance();

		instance.singletonMemberMethod();
	}

}

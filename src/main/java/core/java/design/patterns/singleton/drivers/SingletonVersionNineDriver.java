package core.java.design.patterns.singleton.drivers;

import core.java.design.patterns.singleton.versions.SingletonVersionNine;

public class SingletonVersionNineDriver {

	public static void main(String[] args) {
		SingletonVersionNine instance = SingletonVersionNine.getInstance();

		instance.singletonMemberMethod();
	}
}

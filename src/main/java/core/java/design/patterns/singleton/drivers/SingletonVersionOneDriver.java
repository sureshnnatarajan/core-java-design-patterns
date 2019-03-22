package core.java.design.patterns.singleton.drivers;

import core.java.design.patterns.singleton.versions.SingletonVersionOne;

public class SingletonVersionOneDriver {

	public static void main(String[] args) {

		//Get the singleton instance.
		SingletonVersionOne singleInstance = SingletonVersionOne.getInstance();
		
		//Invoke the member variables
		singleInstance.singletonMemberMethod();
	}

}

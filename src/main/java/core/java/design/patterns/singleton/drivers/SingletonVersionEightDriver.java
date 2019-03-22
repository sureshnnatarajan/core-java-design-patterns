package core.java.design.patterns.singleton.drivers;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

import core.java.design.patterns.singleton.versions.SingletonVersionEight;

public class SingletonVersionEightDriver {

	public static void main(String[] args) {
		SingletonVersionEight instance = SingletonVersionEight.getInstance();
		SingletonVersionEight instance2 = null;
		
		ObjectOutput out = null;
		ObjectInput in = null;
		
		try {
			out = new ObjectOutputStream(new FileOutputStream("SingletonSerialize.txt"));
			out.writeObject(instance);
			out.close();
			
			//Deserialize from file to object
			in = new ObjectInputStream(new FileInputStream("SingletonSerialize.txt")); 
			instance2 = (SingletonVersionEight) in.readObject();
			
			System.out.println(instance.hashCode());
			if (instance2 != null) {
				System.out.println(instance2.hashCode());
			}
			
			in.close(); 
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}

package com.hackearth;
import Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.Serializable;




public class SerializationProxy extends Test implements Serializable  {

	public SerializationProxy(String a) {
		super(a);
		
	}
	
	
	private static class TestSerializationProxy implements Serializable
	{
		
		String ab;
		TestSerializationProxy(SerializationProxy p)
		{
			System.out.println("k"+p.a);
			ab=p.a;
		}
		private Object readResolve()
		{
			System.out.println("bye"+ab);
			return new SerializationProxy(ab);
		}
	}
	private Object writeReplace()
	{
		System.out.println(a+" sgsfdgd");
		return new TestSerializationProxy(this);
	}
	
	private void readObject(ObjectInputStream ois) throws InvalidObjectException
	{
		throw new InvalidObjectException("Proxy Required");
	}
	
	public static void main(String s[]) throws FileNotFoundException, IOException, ClassNotFoundException
	{
		SerializationProxy tsp = new SerializationProxy("hi");
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("D:/object.txt"));
		oos.writeObject(tsp);
		oos.close();
		oos.flush();
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("D:/object.txt"));
		System.out.println(((SerializationProxy)ois.readObject()).a);
	}
}

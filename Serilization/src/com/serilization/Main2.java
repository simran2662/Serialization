package com.serilization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Main2 {

	public static void main(String[] args) {
		String path="/home/lsn-hp-intern-intella-01/Documents/Serilization/object.txt";
		try {
		FileInputStream fis=new FileInputStream(path);
		ObjectInputStream ois=new ObjectInputStream(fis);
		Customer customer=(Customer) ois.readObject();
		System.out.println(customer.getName());
		System.out.println(customer.getCrn());
		System.out.println(customer.getBalance());
		
		}
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		catch(ClassNotFoundException e) {
			System.out.println("class does not exist");
			e.printStackTrace();
		}
		}

}

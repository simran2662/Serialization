package com.serilization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.NotSerializableException;
import java.io.ObjectOutputStream;

public class Main {

	public static void main(String[] args)  {
		Customer customer=new Customer("Alex",1234567890l, (float) 20000.0);
		String path="/home/lsn-hp-intern-intella-01/Documents/Serilization/object.txt";
				
		try {
		FileOutputStream fos=new FileOutputStream(path);
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(customer);
		oos.flush();
		}
		catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		
	}

}

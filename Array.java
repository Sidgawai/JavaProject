package Oops;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.*;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList CricktersList = new ArrayList();
		
		CricktersList.add("Virat");
		CricktersList.add("Rohit");
		CricktersList.add("Dhoni");
//		CricktersList.add(21);
	//	CricktersList.add(22);
		
	//	String oldVal = (String) CricktersList.set(0, "Hardik");
		CricktersList.add(1, "Raina");
		Collections.sort(CricktersList);;
		
		System.out.println(CricktersList.isEmpty());
		System.out.println(CricktersList);
		
		Iterator itr = CricktersList.iterator();
		for (;itr.hasNext();) 
		{
			System.out.println(itr.next());
		}
		
	}

	private static Object CricktersList(int i, String string) {
		// TODO Auto-generated method stub
		return null;
	}

}

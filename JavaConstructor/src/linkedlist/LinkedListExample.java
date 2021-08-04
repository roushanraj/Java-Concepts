package linkedlist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {
	public static void main(String[] args) {
		ArrayList<Integer> arraylist= new ArrayList<Integer>();
		LinkedList<Integer> linkedlist = new LinkedList<Integer>();
		
		doTiming("Array List", arraylist);
		doTiming("Linked List", linkedlist);
		/*
		 * this will reverse the list
		 * System.out.println("1st element before reverse is "+linkedlist.get(0));
		 * Collections.reverse(linkedlist);
		 * System.out.println("1st element after reverse is "+linkedlist.get(0));
		 */
		
	}
	
	private static void doTiming(String type, List<Integer> list) {
		
		long start= System.currentTimeMillis();
		
		for(int i=0; i<1E5;i++) {
			list.add(i);
		}
		
		long end= System.currentTimeMillis();
		
		System.out.println("Time Taken for inserting at end in "+type+" is "+(end-start));
		
		//////////////////////////////
		
		long start1= System.currentTimeMillis();
		
		for(int i=0; i<1E5;i++) {		//going to take longer time in array because we are inserting at beginning. 
			list.add(0,i);
		}
		
		long end1= System.currentTimeMillis();
		
		System.out.println("Time Taken for inserting at beginning in "+type+" is "+(end1-start1));
	} 
}

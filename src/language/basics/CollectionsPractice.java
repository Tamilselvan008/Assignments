package language.basics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class CollectionsPractice {

	public static void main(String[] args) {
		// collection allow non primitive data types and not allow primitive data types
		//in collection we need to use wrapper class for primitive dtypes
		//(Byte,Boolean,Character,Double,Float,Long,Integer)
		
		
		// List ==> Arraylist & Linked list
		// both Arraylist & Linked list input and output should be same no difference 
		//( memory location will be different)
		// List - >  Similar data type, Dynamic,allow Modification, allow Dulicate
		//Refer Bharath Code
		// best one is Array list 
		// insertion order
		
		List<String> studentArrayList=new ArrayList<String>();
		studentArrayList.add("Bharath");
		studentArrayList.add("Tamizh");
		studentArrayList.add("Raja");
		studentArrayList.add("Ram");
		studentArrayList.remove("Raja");
		studentArrayList.add(null);
		studentArrayList.add("Joo");

		System.out.println(studentArrayList.get(1));
		System.out.println(studentArrayList.size());
		System.out.println(studentArrayList);

	//==>	Set  ==> hashset,Linkedset,Treeset 
		//Set -> Similar data type, Dynamic,allow Modification, NOT allow Dulicate
		// hashset -> random order ,storing NULL value,duplicate not considered as Size ,get method not allowed
		
		Set<String> studentHashSet=new HashSet<String>();
		studentHashSet.add("Bharath");
		studentHashSet.add("Tamizh");
		studentHashSet.add("Raja");
		studentHashSet.add("Ram");	
		studentHashSet.add("vicky");
		studentHashSet.remove("Raja");
		studentHashSet.add(null);
		studentHashSet.add("Joo");

	//	System.out.println(studentHashSet.get(1));
		System.out.println(studentHashSet.size());
		System.out.println(studentHashSet);

		
		//LinkedHashSet => insertion order,storing NULL value,duplicate not considered as Size,get method not allowed
		
		Set<String> studentLinkedSet=new LinkedHashSet<String>();
		studentLinkedSet.add("Bharath");
		studentLinkedSet.add("Tamizh");
		studentLinkedSet.add("Raja");
		studentLinkedSet.add("Ram");	
		studentLinkedSet.add("vicky");
		studentLinkedSet.add("Raja");
		studentLinkedSet.add(null);
		studentLinkedSet.remove("Ram");

	//	System.out.println(studentLinkedSet.get(1));
		System.out.println(studentLinkedSet.size());
		System.out.println(studentLinkedSet);
		
		//TreeSet => not allow null, ascending format,duplicate not considered as Size,get method is allowed
		
		Set<String> studentTreeSet=new TreeSet<String>();
		studentTreeSet.add("Bharath");
		studentTreeSet.add("Tamizh");
		studentTreeSet.add("Raja");
		studentTreeSet.add("Ram");	
		studentTreeSet.add("vicky");
		studentTreeSet.add("Raja");
	//	studentTreeSet.add(null);
		studentTreeSet.remove("Ram");

	//	System.out.println(studentTreeSet.get(1));
		System.out.println(studentTreeSet.size());
		System.out.println(studentTreeSet);
		
  //==>	Map  ==> HashMap
	   //Map -> allow different data type by (key and Value)format ,Dynamic,allow Modification, Duplicate allow value but not allow Key
		
		//Hashmap -> single value
		// its allow NULL key and value, random order,get not work
		
		Map<String,Integer> studentHashmap=new HashMap<String,Integer>();
		studentHashmap.put("Bharath",123);
		studentHashmap.put("Tamizh",456);
		studentHashmap.put("Gokul",789);
		studentHashmap.put("Guna",120);
	//	studentHashmap.put("Guna",012);
		studentHashmap.put("Tamizh",345);
		studentHashmap.put("NUL",678);
		studentHashmap.put("Jack",null);
		studentHashmap.remove("Bharath");

	 //   System.out.println(studentTreeSet.get(1));
		System.out.println(studentHashmap.size());
		System.out.println(studentHashmap);
		
		//LinkedHashmap -> single value
		// its allow NULL key and value, insertion order,get not work 
		
		Map<String,Integer> studentLinkedHashmap=new LinkedHashMap<String,Integer>();
		studentLinkedHashmap.put("Bharath",123);
		studentLinkedHashmap.put("Tamizh",456);
		studentLinkedHashmap.put("Gokul",789);
		studentLinkedHashmap.put("Guna",120);
	//	studentLinkedHashmap.put("Guna",012);
		studentLinkedHashmap.put("Tamizh",345);
		studentLinkedHashmap.put("NUL",678);
		studentLinkedHashmap.put("Jack",null);
		studentLinkedHashmap.remove("Bharath");

	 //   System.out.println(studentLinkedHashmap.get(1));
		System.out.println(studentLinkedHashmap.size());
		System.out.println(studentLinkedHashmap);
	}

}

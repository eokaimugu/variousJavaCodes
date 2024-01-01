package miscellaneous;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {

		ArrayList<String> names = new ArrayList<String>();
		names.add("Abinav");
		names.add("Ella");
		names.add("Abibata");
		names.add("Akon");
		names.add("Sasta");
		names.add("Adam");
		
		System.out.println(names);
		//String name = " ";
	System.out.println("-------After iteration---------");	
		ArrayList<String> myList = new ArrayList<String>();	
		int count=0;
		
		for(int i=0; i<names.size(); i++) {
			
			String name = names.get(i);
			
			if(name.startsWith("A"))
			{
				count++;
			}
		}
				
		System.out.println(count);
		
		for(String name : names)
		{
			myList.add(name);
		}
		
		System.out.print(myList+"  ");
		
		
	}

}


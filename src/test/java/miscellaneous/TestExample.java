package miscellaneous;

import java.util.ArrayList;

public class TestExample {
	
	public int regular()
	{
		ArrayList<String> names = new ArrayList<String>();
		names.add("Adwoa");
		names.add("Achiaa");
		names.add("David");
		names.add("Shekainah");
		names.add("Gideon");
		names.add("Ella");
		names.add("Abrachardabra");
		
		int count = 0;
		
		for(int i=0; i<names.size(); i++) {
			
			String name = names.get(i);
			if(name.startsWith("A")) {
				
				count++;
			}
		}
		return count;
	}
	
	

	public static void main(String[] args) {
		
		TestExample te = new TestExample();
		te.regular();
		
	System.out.println(te.regular());
	
		
	}

}

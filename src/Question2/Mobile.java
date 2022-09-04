package Question2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Mobile {
	
	
	HashMap<String,ArrayList<String>> mobiles = new HashMap<>();
	
	public String addMobile(String company, String model) {
		
		
		
		if(mobiles.containsKey(company)) {
			List<String> lcompany=mobiles.get(company);
			lcompany.add(model);
			
		}
		
		else {
			
			ArrayList<String> modl=new ArrayList<>();
			modl.add(model);
			mobiles.put(company,  modl);
			
			
		}
		
		
		return "added sucussfully";
		
	}
	
	
	
	
	public static void main(String[] args) {
		
		Mobile mob=new Mobile();
		
		Scanner input=new Scanner(System.in);
		
		while(true) {
			System.out.println("Enter company name");
			String name=input.next();
			
			System.out.println("Enter model");
		   String model=input.next();
		   
		   String result=mob.addMobile(name, model);
		   System.out.println(result);
		   
		   System.out.println("want to add more (yes/no)");
		   String i=input.next();
		   
		   if(i.equalsIgnoreCase("no")) {
			   break;
		   }
		   
		}
		
		Set<Map.Entry<String,ArrayList<String>>> aer=mob.mobiles.entrySet();
		for(Map.Entry<String,ArrayList<String>> item:aer) {
			System.out.println(item.getKey()+"-----"+item.getValue());
		}
			
	}

}

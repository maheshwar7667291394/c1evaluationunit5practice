package Formalpractice;

import java.util.HashMap;

public class Practice {
	
	public static void main(String[] args) {
		HashMap<String,Integer> hm=new  HashMap<>();
		
		hm.put("mahesh",10);
		hm.put("lalu",20);
		hm.put("bhalu",30);
		hm.put("tiger",40);
		hm.put("lion",50);
		System.out.println(hm.get("mahesh"));
		System.out.println(hm.containsKey("lion"));
	}

}

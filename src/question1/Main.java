package question1;

import java.util.Set;
import java.util.TreeMap;

public class Main {
	
	public static void main(String[] args) {
		TreeMap<Employee,Integer> tm=new TreeMap<>();
		tm.put(new Employee(1, "maesh","patnaa"), 1000);
		tm.put(new Employee(3, "anishsan9char","up"), 2000);
		tm.put(new Employee(2, "charma","patnaa"), 3000);
		tm.put(new Employee(4, "aamlapa","jharkhandi"),1232);
		
		
		Set<Employee> setkye=tm.keySet();
		for(Employee item:setkye) {
			System.out.println(item);
		}
	
	}
}

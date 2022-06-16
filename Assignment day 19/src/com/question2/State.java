package com.question2;

import java.util.LinkedHashMap;
import java.util.Map;

public class State {

	public static void main(String[] args) {
		LinkedHashMap<String,String> is = new LinkedHashMap<>();
		is.put("Uttar Pradesh", "Lucknow");
		is.put("Gujrat", "Ahmdabad");
		is.put("Assam", "Dispur");
		is.put("Goa","Panaji");
		is.put("Haryana","Chandigarh");
		is.put("Karnataka","Bangalore");
		is.put("Kerala","Thiruvananthapuram");
		is.put("Manipur","Imphal");
		is.put("Mizoram","Aizawl");
		is.put("Odisha","Bhubaneswar");
		
		for(Map.Entry<String,String> hm:is.entrySet()) {
			System.out.println("State:"+hm.getKey());
			System.out.println("Capital:"+hm.getValue());
			System.out.println("=======================");
		}
	} 
}

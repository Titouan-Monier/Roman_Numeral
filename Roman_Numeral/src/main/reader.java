package main;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class reader {
	
	public static void main(String[] args) throws ClassNotFoundException, IOException {
	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    //Propose the CRUD's methods to the user 
    System.out.println("Enter the number you want to generate into Roman Numeral : ");
    String input = reader.readLine();
    
    HashMap<Integer, String> numeralList = new HashMap<Integer, String>();
    numeralList.put(1, "I");
    numeralList.put(4, "IV");
    numeralList.put(5, "V");
    numeralList.put(9, "IX");
    numeralList.put(10, "X");
    numeralList.put(40, "XL");
    numeralList.put(50, "L");
    numeralList.put(90, "XC");
    numeralList.put(100, "C");
    numeralList.put(400, "CD");
    numeralList.put(500, "D");
    numeralList.put(900, "CM");
    numeralList.put(1000, "M");
    
    
}
	

 
    
}

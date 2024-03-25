package Oregon_Trail_Package;

import java.awt.EventQueue;
import java.awt.ItemSelectable;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class ItemClass {
	static ArrayList<ItemClass> items = new ArrayList<ItemClass>();
		
	public ItemClass(String name, String type, int weight, boolean selected, boolean substantial) {
		String itemName = name;
		String itemType = type;
		int itemWeight = weight;
		boolean itemSelected = selected;
		boolean itemSubstantial = substantial;
	}
	
	public void setStats() {
		//Opening the CSV File and setting up the input scanner
		InputStreamReader in = new InputStreamReader(this.getClass().getResourceAsStream("/Oregon_Trail_Package/WagonItems.csv"));
		Scanner scr = new Scanner(in);
		//Loop through all of the items in the csv file
		//Get each value without the commas and put them into a object variable
		//set that full object into an arrayList
		//CSV Order: String Name, String Type, Int Weight, Bool Selected, Bool Substantial
		while(scr.hasNext()) {
			Scanner reader = new Scanner(scr.nextLine());
			reader.useDelimiter(",");
			String name = reader.next();
			String type = reader.next();
			String tempWeight = reader.next();
			int weight = Integer.parseInt(tempWeight);
			String tempSelected = reader.next();
			boolean selected = Boolean.parseBoolean(tempSelected);
			String tempSubstantial = reader.next();
			boolean substantial = Boolean.parseBoolean(tempSubstantial);
			ItemClass object = new ItemClass(name, type, weight, selected, substantial);
			setArrayList(object);
		}
	}
	
	public void setArrayList(ItemClass item) {
		items.add(item);
	}

	//public String getName(int index) {
		//Iterator<ItemClass> object = items.iterator();
		//while(object.hasNext()) {
			//ItemClass ic = object.next();
			//String name = ic.itemNameGet();
		//}
		//return name;
	//}
	
	public String getType(String type) {
		return type;
	}
	
	public int getWeight(int weight) {
		return weight;
	}
	
	public boolean getSelected(boolean selected) {
		return selected;
	}
	
	public boolean getSubstantial(boolean substantial) {
		return substantial;
	}
	
	public int calculateSubWeight(int weight) {
		int subWeight = 0;
		return subWeight;
	}
	
	public int calculateTotalWeight(int foodWeight, int dryWeight) {
		int totalWeight = 0;
		return totalWeight;
	}
	
	public boolean checkWeight(int totalWeight) {
		boolean weightCheck = false;
		return weightCheck;
	}
	
}

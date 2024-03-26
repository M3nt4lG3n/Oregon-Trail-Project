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

import javax.swing.JCheckBox;

public class ItemClass {
	static String itemName = "";
	static String itemType = "";
	static int itemWeight = 0;
	static boolean itemSelected = false;
	static boolean itemSubstantial = false;
	
	//Call the different variables from the objects from the array list as "items.get(index).get'MethodName'"
	public ItemClass(String name, String type, int weight, boolean selected, boolean substantial) {
		itemName = name;
		itemType = type;
		itemWeight = weight;
		itemSelected = selected;
		itemSubstantial = substantial;	
	}

	public void setName(String name) {
		itemName = name;
	}
	
	public static String getName() {
		return itemName;
	}
	
	public void setType(String type) {
		itemType = type;
	}
	
	public String getType() {
		return itemType;
	}
	
	public void setWeight(int weight) {
		itemWeight = weight;
	}
	
	public static int getWeight() {
		return itemWeight;
	}
	
	public void setSelected(boolean selected) {
		itemSelected = selected;
	}
	
	public boolean getSelected() {
		return itemSelected;
	}
	
	public void setSubstantial(boolean substantial) {
		itemSubstantial = substantial;
	}
	
	public static boolean getSubstantial() {
		return itemSubstantial;
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

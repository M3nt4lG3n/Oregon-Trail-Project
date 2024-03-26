/*
 * @author Brian Bizon
 * @date 3/26/2024
 * @version 1.0
 */
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

/**
 * The class Item class
 */ 
public class ItemClass {
	private String itemName = "";
	private String itemType = "";
	private int itemWeight = 0;
	private boolean itemSelected = false;
	private boolean itemSubstantial = false;
	
	//Call the different variables from the objects from the array list as "items.get(index).get'MethodName'"
	/** 
	 *
	 * It is a constructor. 
	 *
	 * @param name  the name. 
	 * @param type  the type. 
	 * @param weight  the weight. 
	 * @param selected  the selected. 
	 * @param substantial  the substantial. 
	 */
	public ItemClass(String name, String type, int weight, boolean selected, boolean substantial) {
		this.itemName = name;
		itemType = type;
		itemWeight = weight;
		itemSelected = selected;
		itemSubstantial = substantial;	
	}
	/** 
	 *
	 * Sets the name
	 *
	 * @param name  the name. 
	 */
	public void setName(String name) {
		itemName = name;
	}
	/** 
	 *
	 * Gets the name
	 *
	 * @return the name
	 */
	public String getName() {
		return itemName;
	}
	/** 
	 *
	 * Sets the type
	 *
	 * @param type  the type. 
	 */
	public void setType(String type) {
		itemType = type;
	}
	/** 
	 *
	 * Gets the type
	 *
	 * @return the type
	 */
	public String getType() {
		return itemType;
	}
	/** 
	 *
	 * Sets the weight
	 *
	 * @param weight  the weight. 
	 */
	public void setWeight(int weight) {
		itemWeight = weight;
	}
	/** 
	 *
	 * Gets the weight
	 *
	 * @return the weight
	 */
	public int getWeight() {
		return itemWeight;
	}
	/** 
	 *
	 * Sets the selected
	 *
	 * @param selected  the selected. 
	 */
	public void setSelected(boolean selected) {
		itemSelected = selected;
	}
	/** 
	 *
	 * Gets the selected
	 *
	 * @return the selected
	 */
	public boolean getSelected() {
		return itemSelected;
	}
	/** 
	 *
	 * Sets the substantial
	 *
	 * @param substantial  the substantial. 
	 */
	public void setSubstantial(boolean substantial) {
		itemSubstantial = substantial;
	}
	/** 
	 *
	 * Gets the substantial
	 *
	 * @return the substantial
	 */
	public boolean getSubstantial() {
		return itemSubstantial;
	}
	/*
	 * @author Mason Greenawalt
	 * @date 3/26/2024
	 * @version 1.0
	 */
	/** 
	 *
	 * Calculatefood sub weight
	 *
	 * @return int
	 */
	public static int calculatefoodSubWeight() {
        int foodSubWeight = 0;
        for (int i = 0; i < 14; i++) {
        	if(Oregon_Trail_Window.items.get(i).getSelected()) {
            	foodSubWeight += Oregon_Trail_Window.items.get(i).getWeight();
        	}
        }	
		return foodSubWeight;       
    }
	/** 
	 *
	 * Calculate dry sub weight
	 *
	 * @return int
	 */
    public static int calculateDrySubWeight() {
    	int drySubWeight = 0;
		for (int j = 13; j < 29; j++) {
			if(Oregon_Trail_Window.items.get(j).getSelected()) {
				drySubWeight += Oregon_Trail_Window.items.get(j).getWeight();
			}
		}
		return drySubWeight;  
    }
    /** 
    *
    * Calculate total weight
    *
    * @param items  the items. 
    * @return int
    */
    public static int calculateTotalWeight(ArrayList<ItemClass> items) {
        int totalWeight = 0;
        for (ItemClass item : items) {
        	if(item.getSelected()) {
        		System.out.println(item.getName());
            	totalWeight += item.getWeight();
        	}
        }
        return totalWeight;
    }
    /** 
    *
    * Check weight
    *
    * @return boolean
    */
    // Method to check if the total weight exceeds a certain limit
    public static boolean checkWeight() {
        final int LIMIT = 2400;
    	return calculateTotalWeight(Oregon_Trail_Window.items) <= LIMIT;
    }	
}

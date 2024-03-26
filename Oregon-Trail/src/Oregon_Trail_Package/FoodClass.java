/*
 * @author Anthony Bellino
 * @date 3/26/2024
 * @version 1.0
 */
package Oregon_Trail_Package;

import java.io.FileNotFoundException;

public class FoodClass extends Oregon_Trail_Window {
	/** 
	 *
	 * Food class
	 *
	 * @param {  the {.  It is throws 
	 * @return 	public
	 * @throws   FileNotFoundException 
	 */
	public FoodClass() throws FileNotFoundException {
			super();
			// TODO Auto-generated constructor stub
	}
	double foodWeight;

	/** 
	 *
	 * Have food
	 * checks for at least one substantial food item
	 * @return boolean
	 */
	public static boolean haveFood() {
		for(int i = 0; i < items.size(); i++) {
			if(items.get(i).getSubstantial() && items.get(i).getSelected()) {
				return true;
			}
		}
		return false;
	}
	/** 
	 *
	 * Gets the food weight
	 *
	 * @return the food weight
	 */
	public double getFoodWeight() {
		foodWeight = 0;
		for(int i = 0; i < items.size();i++) {
			foodWeight += items.get(i).getWeight();
		}
		return foodWeight;
	}
	/** 
	 *
	 * Have X food
	 *
	 * @param foodNeeded  the food needed. 
	 * @return boolean
	 */
	public boolean haveXFood(int foodNeeded) {
		if(getFoodWeight()>= foodNeeded)
			return true;
		else
			return false;
	}
	
	/** 
	 *
	 * Is food enough
	 *
	 * @return boolean
	 */
	public static boolean isFoodEnough(int travelRate, int consumptionRate){
		int distance = 2200;
		int consumableAmount = 0;
		int days = distance / travelRate;
		System.out.println(days);
		//Loops through all food items and calculates the sub weight for food
		for (int i=0; i<14; i++) {
       	if(items.get(i).getSelected() && items.get(i).getSubstantial()) {
           	System.out.println("Item added to consumable weight");
       		consumableAmount += items.get(i).getWeight();
       		System.out.println(consumableAmount);
       	}
       }	
		//checks if the amount of food will last the jouney
		if(consumableAmount > days * consumptionRate) {
			return true;
		}
		else {
			return false;
		}
	}
}
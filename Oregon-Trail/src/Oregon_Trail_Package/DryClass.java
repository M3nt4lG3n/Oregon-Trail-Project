/*
 * @author Anthony Bellino
 * @date 3/26/2024
 * @version 1.0
 */
package Oregon_Trail_Package;

import java.io.FileNotFoundException;

public class DryClass extends Oregon_Trail_Window {
	/** 
	*
	* Dry class
	*
	* @param {  the {.  It is throws 
	* @return 	public
	* @throws   FileNotFoundException 
	*/
	public DryClass() throws FileNotFoundException {
		super();
		// TODO Auto-generated constructor stub
	}
	/** 
	 *
	 * Return dry weight
	 *
	 * @return int
	 */
	public int returnDryWeight() {
		int dryWeight = 0;
		for(int i=0;i< items.size();i++) {
			if (items.get(i).getType() == "Dry") {
				dryWeight += items.get(i).getWeight();
			}
		}
		return dryWeight;
	}
}

/*
 * 
 */
package Oregon_Trail_Package;

import java.awt.EventQueue;
import java.awt.ItemSelectable;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JFrame;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import java.awt.Color;

/**
* The class Oregon_ trail_ window
*/ 
public class Oregon_Trail_Window {
	private JFrame frame;
	static ArrayList<ItemClass> items = new ArrayList<ItemClass>();
	int travelRate = 12;
	int consumptionRate = 0;
	boolean consumptionCheck = false;
	int drySubtotal = 0;
	int foodSubtotal = 0;
	int finalTotal = 0;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Oregon_Trail_Window window = new Oregon_Trail_Window();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 * @throws FileNotFoundException 
	 */
	public Oregon_Trail_Window() throws FileNotFoundException {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 * @throws FileNotFoundException 
	 */
	private void initialize(){
		setObjects();
		
		frame = new JFrame();
		frame.setBounds(200, 200, 500, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel FoodTitleLabel = new JLabel("Food Name, Weight, Selected");
		FoodTitleLabel.setForeground(new Color(255, 255, 255));
		FoodTitleLabel.setBounds(10, 10, 170, 20);
		frame.getContentPane().add(FoodTitleLabel);
		
		JLabel TotalLabel = new JLabel("Total: ");
		TotalLabel.setForeground(new Color(255, 255, 255));
		TotalLabel.setBounds(10, 379, 120, 13);
		frame.getContentPane().add(TotalLabel);
		
		JLabel DrySubtotalLabel = new JLabel("Subtotal: ");
		DrySubtotalLabel.setForeground(new Color(255, 255, 255));
		DrySubtotalLabel.setBounds(182, 405, 117, 28);
		frame.getContentPane().add(DrySubtotalLabel);
		
		JLabel FoodSubtotalLabel = new JLabel("Subtotal: ");
		FoodSubtotalLabel.setForeground(new Color(255, 255, 255));
		FoodSubtotalLabel.setBounds(10, 341, 117, 28);
		frame.getContentPane().add(FoodSubtotalLabel);
		
		JCheckBox AppleCheckBox = new JCheckBox("Apple Vinegar, 25");
		AppleCheckBox.setBounds(10, 36, 130, 21);
		AppleCheckBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				items.get(0).setSelected(AppleCheckBox.isSelected());
				foodSubtotal = ItemClass.calculatefoodSubWeight();
				FoodSubtotalLabel.setText("Subtotal: " + foodSubtotal);
				finalTotal = ItemClass.calculateTotalWeight(items);
				TotalLabel.setText("Total: " + finalTotal);
			}
		});
		frame.getContentPane().add(AppleCheckBox);
		
		JCheckBox BaconCheckBox = new JCheckBox("Bacon, 400");
		BaconCheckBox.setBounds(10, 59, 117, 21);
		BaconCheckBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				items.get(1).setSelected(BaconCheckBox.isSelected());
				foodSubtotal = ItemClass.calculatefoodSubWeight();
				FoodSubtotalLabel.setText("Subtotal: " + foodSubtotal);
				finalTotal = ItemClass.calculateTotalWeight(items);
				TotalLabel.setText("Total: " + finalTotal);
			}
		});
		frame.getContentPane().add(BaconCheckBox);
		
		JCheckBox BeansCheckBox = new JCheckBox("Beans, 200");
		BeansCheckBox.setBounds(10, 82, 117, 21);
		BeansCheckBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				items.get(2).setSelected(BeansCheckBox.isSelected());
				foodSubtotal = ItemClass.calculatefoodSubWeight();
				FoodSubtotalLabel.setText("Subtotal: " + foodSubtotal);
				finalTotal = ItemClass.calculateTotalWeight(items);
				TotalLabel.setText("Total: " + finalTotal);
			}
		});
		frame.getContentPane().add(BeansCheckBox);
		
		JCheckBox CoffeeCheckBox = new JCheckBox("Coffee, 80");
		CoffeeCheckBox.setBounds(10, 105, 117, 21);
		CoffeeCheckBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				items.get(3).setSelected(CoffeeCheckBox.isSelected());
				foodSubtotal = ItemClass.calculatefoodSubWeight();
				FoodSubtotalLabel.setText("Subtotal: " + foodSubtotal);
				finalTotal = ItemClass.calculateTotalWeight(items);
				TotalLabel.setText("Total: " + finalTotal);
			}
		});
		frame.getContentPane().add(CoffeeCheckBox);
		
		JCheckBox DriedCheckBox = new JCheckBox("Dried Apples, 80");
		DriedCheckBox.setBounds(10, 128, 117, 21);
		DriedCheckBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				items.get(4).setSelected(DriedCheckBox.isSelected());
				foodSubtotal = ItemClass.calculatefoodSubWeight();
				FoodSubtotalLabel.setText("Subtotal: " + foodSubtotal);
				finalTotal = ItemClass.calculateTotalWeight(items);
				TotalLabel.setText("Total: " + finalTotal);
			}
		});
		frame.getContentPane().add(DriedCheckBox);
		
		JCheckBox FlourCheckBox = new JCheckBox("Flour, 500");
		FlourCheckBox.setBounds(10, 151, 117, 21);
		FlourCheckBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				items.get(5).setSelected(FlourCheckBox.isSelected());
				foodSubtotal = ItemClass.calculatefoodSubWeight();
				FoodSubtotalLabel.setText("Subtotal: " + foodSubtotal);
				finalTotal = ItemClass.calculateTotalWeight(items);
				TotalLabel.setText("Total: " + finalTotal);
			}
		});
		frame.getContentPane().add(FlourCheckBox);
		
		JCheckBox HardtackCheckBox = new JCheckBox("Hardtack, 200");
		HardtackCheckBox.setBounds(10, 174, 117, 21);
		HardtackCheckBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				items.get(6).setSelected(HardtackCheckBox.isSelected());
				foodSubtotal = ItemClass.calculatefoodSubWeight();
				FoodSubtotalLabel.setText("Subtotal: " + foodSubtotal);
				finalTotal = ItemClass.calculateTotalWeight(items);
				TotalLabel.setText("Total: " + finalTotal);
			}
		});
		frame.getContentPane().add(HardtackCheckBox);
		
		JCheckBox LardCheckBox = new JCheckBox("Lard, 200");
		LardCheckBox.setBounds(10, 197, 117, 21);
		LardCheckBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				items.get(7).setSelected(LardCheckBox.isSelected());
				foodSubtotal = ItemClass.calculatefoodSubWeight();
				FoodSubtotalLabel.setText("Subtotal: " + foodSubtotal);
				finalTotal = ItemClass.calculateTotalWeight(items);
				TotalLabel.setText("Total: " + finalTotal);
			}
		});
		frame.getContentPane().add(LardCheckBox);
		
		JCheckBox SaltCheckBox = new JCheckBox("Salt, 50");
		SaltCheckBox.setBounds(10, 220, 117, 21);
		SaltCheckBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				items.get(8).setSelected(SaltCheckBox.isSelected());
				foodSubtotal = ItemClass.calculatefoodSubWeight();
				FoodSubtotalLabel.setText("Subtotal: " + foodSubtotal);
				finalTotal = ItemClass.calculateTotalWeight(items);
				TotalLabel.setText("Total: " + finalTotal);
			}
		});
		frame.getContentPane().add(SaltCheckBox);
		
		JCheckBox SugarCheckBox = new JCheckBox("Sugar, 40");
		SugarCheckBox.setBounds(10, 243, 117, 21);
		SugarCheckBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				items.get(9).setSelected(SugarCheckBox.isSelected());
				foodSubtotal = ItemClass.calculatefoodSubWeight();
				FoodSubtotalLabel.setText("Subtotal: " + foodSubtotal);
				finalTotal = ItemClass.calculateTotalWeight(items);
				TotalLabel.setText("Total: " + finalTotal);
			}
		});
		frame.getContentPane().add(SugarCheckBox);
		
		JCheckBox RiceCheckBox = new JCheckBox("Rice, 200");
		RiceCheckBox.setBounds(10, 268, 117, 21);
		RiceCheckBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				items.get(10).setSelected(RiceCheckBox.isSelected());
				foodSubtotal = ItemClass.calculatefoodSubWeight();
				FoodSubtotalLabel.setText("Subtotal: " + foodSubtotal);
				finalTotal = ItemClass.calculateTotalWeight(items);
				TotalLabel.setText("Total: " + finalTotal);
			}
		});
		frame.getContentPane().add(RiceCheckBox);
		
		JCheckBox WaterCheckBox = new JCheckBox("Water, 100");
		WaterCheckBox.setBounds(10, 291, 117, 21);
		WaterCheckBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				items.get(11).setSelected(WaterCheckBox.isSelected());
				foodSubtotal = ItemClass.calculatefoodSubWeight();
				FoodSubtotalLabel.setText("Subtotal: " + foodSubtotal);
				finalTotal = ItemClass.calculateTotalWeight(items);
				TotalLabel.setText("Total: " + finalTotal);
			}
		});
		frame.getContentPane().add(WaterCheckBox);
		
		JCheckBox WhiskeyCheckBox = new JCheckBox("Whiskey, 40");
		WhiskeyCheckBox.setBounds(10, 314, 117, 21);
		WhiskeyCheckBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				items.get(12).setSelected(WhiskeyCheckBox.isSelected());
				foodSubtotal = ItemClass.calculatefoodSubWeight();
				FoodSubtotalLabel.setText("Subtotal: " + foodSubtotal);
				finalTotal = ItemClass.calculateTotalWeight(items);
				TotalLabel.setText("Total: " + finalTotal);
			}
		});
		frame.getContentPane().add(WhiskeyCheckBox);
		
		JLabel DryTitleLabel = new JLabel("Dry Good Name, Weight, Selected");
		DryTitleLabel.setForeground(new Color(255, 255, 255));
		DryTitleLabel.setBounds(182, 10, 210, 20);
		frame.getContentPane().add(DryTitleLabel);
		
		JCheckBox BedrollCheckBox = new JCheckBox("Bedroll, 15");
		BedrollCheckBox.setBounds(182, 36, 93, 21);
		BedrollCheckBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				items.get(13).setSelected(BedrollCheckBox.isSelected());
				drySubtotal = ItemClass.calculateDrySubWeight();
				DrySubtotalLabel.setText("Subtotal: " + drySubtotal);
				finalTotal = ItemClass.calculateTotalWeight(items);
				TotalLabel.setText("Total: " + finalTotal);
			}
		});
		frame.getContentPane().add(BedrollCheckBox);
		
		JCheckBox BlacksmithingCheckBox = new JCheckBox("Blacksmithing Tools, 200");
		BlacksmithingCheckBox.setBounds(182, 59, 170, 21);
		BlacksmithingCheckBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				items.get(14).setSelected(BlacksmithingCheckBox.isSelected());
				drySubtotal = ItemClass.calculateDrySubWeight();
				DrySubtotalLabel.setText("Subtotal: " + drySubtotal);
				finalTotal = ItemClass.calculateTotalWeight(items);
				TotalLabel.setText("Total: " + finalTotal);
			}
		});
		frame.getContentPane().add(BlacksmithingCheckBox);
		
		JCheckBox BooksCheckBox = new JCheckBox("Books, 75");
		BooksCheckBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				items.get(15).setSelected(BooksCheckBox.isSelected());
				drySubtotal = ItemClass.calculateDrySubWeight();
				DrySubtotalLabel.setText("Subtotal: " + drySubtotal);
				finalTotal = ItemClass.calculateTotalWeight(items);
				TotalLabel.setText("Total: " + finalTotal);
			}
		});
		BooksCheckBox.setBounds(182, 82, 93, 21);
		frame.getContentPane().add(BooksCheckBox);
		
		JCheckBox MedicineCheckBox = new JCheckBox("Medicine, 10");
		MedicineCheckBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				items.get(16).setSelected(MedicineCheckBox.isSelected());
				drySubtotal = ItemClass.calculateDrySubWeight();
				DrySubtotalLabel.setText("Subtotal: " + drySubtotal);
				finalTotal = ItemClass.calculateTotalWeight(items);
				TotalLabel.setText("Total: " + finalTotal);
			}
		});
		MedicineCheckBox.setBounds(182, 105, 110, 21);
		frame.getContentPane().add(MedicineCheckBox);
		
		JCheckBox CastCheckBox = new JCheckBox("Cast Iron Stove, 300");
		CastCheckBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				items.get(17).setSelected(CastCheckBox.isSelected());
				drySubtotal = ItemClass.calculateDrySubWeight();
				DrySubtotalLabel.setText("Subtotal: " + drySubtotal);
				finalTotal = ItemClass.calculateTotalWeight(items);
				TotalLabel.setText("Total: " + finalTotal);
			}
		});
		CastCheckBox.setBounds(182, 128, 150, 21);
		frame.getContentPane().add(CastCheckBox);
		
		JCheckBox ChairCheckBox = new JCheckBox("Chair, 20");
		ChairCheckBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				items.get(18).setSelected(ChairCheckBox.isSelected());
				drySubtotal = ItemClass.calculateDrySubWeight();
				DrySubtotalLabel.setText("Subtotal: " + drySubtotal);
				finalTotal = ItemClass.calculateTotalWeight(items);
				TotalLabel.setText("Total: " + finalTotal);
			}
		});
		ChairCheckBox.setBounds(182, 151, 93, 21);
		frame.getContentPane().add(ChairCheckBox);
		
		JCheckBox CookwareCheckBox = new JCheckBox("Cooking & Eating Utensil, 75");
		CookwareCheckBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				items.get(19).setSelected(CookwareCheckBox.isSelected());
				drySubtotal = ItemClass.calculateDrySubWeight();
				DrySubtotalLabel.setText("Subtotal: " + drySubtotal);
				finalTotal = ItemClass.calculateTotalWeight(items);
				TotalLabel.setText("Total: " + finalTotal);
			}
		});
		CookwareCheckBox.setBackground(new Color(240, 240, 240));
		CookwareCheckBox.setBounds(182, 174, 200, 21);
		frame.getContentPane().add(CookwareCheckBox);
		
		JCheckBox GrannysCheckBox = new JCheckBox("Granny's Clock. 15");
		GrannysCheckBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				items.get(20).setSelected(GrannysCheckBox.isSelected());
				drySubtotal = ItemClass.calculateDrySubWeight();
				DrySubtotalLabel.setText("Subtotal: " + drySubtotal);
				finalTotal = ItemClass.calculateTotalWeight(items);
				TotalLabel.setText("Total: " + finalTotal);
			}
		});
		GrannysCheckBox.setBounds(182, 197, 140, 21);
		frame.getContentPane().add(GrannysCheckBox);
		
		JCheckBox GunCheckBox = new JCheckBox("Gun Making Tools, 200");
		GunCheckBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				items.get(21).setSelected(GunCheckBox.isSelected());
				drySubtotal = ItemClass.calculateDrySubWeight();
				DrySubtotalLabel.setText("Subtotal: " + drySubtotal);
				finalTotal = ItemClass.calculateTotalWeight(items);
				TotalLabel.setText("Total: " + finalTotal);
			}
		});
		GunCheckBox.setBounds(182, 220, 160, 21);
		frame.getContentPane().add(GunCheckBox);
		
		JCheckBox KeepsakesCheckBox = new JCheckBox("Keepsakes, 40");
		KeepsakesCheckBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				items.get(22).setSelected(KeepsakesCheckBox.isSelected());
				drySubtotal = ItemClass.calculateDrySubWeight();
				DrySubtotalLabel.setText("Subtotal: " + drySubtotal);
				finalTotal = ItemClass.calculateTotalWeight(items);
				TotalLabel.setText("Total: " + finalTotal);
			}
		});
		KeepsakesCheckBox.setBounds(182, 243, 120, 21);
		frame.getContentPane().add(KeepsakesCheckBox);
		
		JCheckBox LeadCheckBox = new JCheckBox("Lead Shot, 25");
		LeadCheckBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				items.get(23).setSelected(LeadCheckBox.isSelected());
				drySubtotal = ItemClass.calculateDrySubWeight();
				DrySubtotalLabel.setText("Subtotal: " + drySubtotal);
				finalTotal = ItemClass.calculateTotalWeight(items);
				TotalLabel.setText("Total: " + finalTotal);
			}
		});
		LeadCheckBox.setBounds(182, 268, 120, 21);
		frame.getContentPane().add(LeadCheckBox);
		
		JCheckBox MirrorCheckBox = new JCheckBox("Mirror, 15");
		MirrorCheckBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				items.get(24).setSelected(MirrorCheckBox.isSelected());
				drySubtotal = ItemClass.calculateDrySubWeight();
				DrySubtotalLabel.setText("Subtotal: " + drySubtotal);
				finalTotal = ItemClass.calculateTotalWeight(items);
				TotalLabel.setText("Total: " + finalTotal);
			}
		});
		MirrorCheckBox.setBounds(182, 291, 93, 21);
		frame.getContentPane().add(MirrorCheckBox);
		
		JCheckBox GunpowderCheckBox = new JCheckBox("Gunpowder, 15");
		GunpowderCheckBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				items.get(25).setSelected(GunpowderCheckBox.isSelected());
				drySubtotal = ItemClass.calculateDrySubWeight();
				DrySubtotalLabel.setText("Subtotal: " + drySubtotal);
				finalTotal = ItemClass.calculateTotalWeight(items);
				TotalLabel.setText("Total: " + finalTotal);
			}
		});
		GunpowderCheckBox.setBounds(182, 314, 130, 21);
		frame.getContentPane().add(GunpowderCheckBox);
		
		JCheckBox TentCheckBox = new JCheckBox("Tent & Gear, 150");
		TentCheckBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				items.get(26).setSelected(TentCheckBox.isSelected());
				drySubtotal = ItemClass.calculateDrySubWeight();
				DrySubtotalLabel.setText("Subtotal: " + drySubtotal);
				finalTotal = ItemClass.calculateTotalWeight(items);
				TotalLabel.setText("Total: " + finalTotal);
			}
		});
		TentCheckBox.setBounds(182, 337, 120, 21);
		frame.getContentPane().add(TentCheckBox);
		
		JCheckBox ToolsCheckBox = new JCheckBox("Tools, 50");
		ToolsCheckBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				items.get(27).setSelected(ToolsCheckBox.isSelected());
				drySubtotal = ItemClass.calculateDrySubWeight();
				DrySubtotalLabel.setText("Subtotal: " + drySubtotal);
				finalTotal = ItemClass.calculateTotalWeight(items);
				TotalLabel.setText("Total: " + finalTotal);
			}
		});
		ToolsCheckBox.setBounds(182, 360, 93, 21);
		frame.getContentPane().add(ToolsCheckBox);
		
		JCheckBox ToysCheckBox = new JCheckBox("Toys, 15");
		ToysCheckBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				items.get(28).setSelected(ToysCheckBox.isSelected());
				drySubtotal = ItemClass.calculateDrySubWeight();
				DrySubtotalLabel.setText("Subtotal: " + drySubtotal);
				finalTotal = ItemClass.calculateTotalWeight(items);
				TotalLabel.setText("Total: " + finalTotal);
			}
		});
		ToysCheckBox.setBounds(182, 382, 93, 21);
		frame.getContentPane().add(ToysCheckBox);
		
		JButton FillingButton = new JButton("Filling");
		FillingButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				consumptionRate = 15;
				consumptionCheck = true;
			}
		});
		FillingButton.setBounds(362, 59, 85, 21);
		frame.getContentPane().add(FillingButton);
		
		JButton MeagerButton = new JButton("Meager");
		MeagerButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				consumptionRate = 10;
				consumptionCheck = true;
			}
		});
		MeagerButton.setBounds(362, 82, 85, 21);
		frame.getContentPane().add(MeagerButton);
		
		JButton BareButton = new JButton("Bare Bones");
		BareButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				consumptionRate = 5;
				consumptionCheck = true;
			}
		});
		BareButton.setBounds(352, 105, 110, 21);
		frame.getContentPane().add(BareButton);
		
		JLabel ConsumptionTitleLabel = new JLabel("Set Food Consumption");
		ConsumptionTitleLabel.setForeground(new Color(255, 255, 255));
		ConsumptionTitleLabel.setBounds(340, 40, 140, 13);
		frame.getContentPane().add(ConsumptionTitleLabel);
		
		JLabel SpeedLabel = new JLabel("Set Travel Speed (12)");
		SpeedLabel.setForeground(new Color(255, 255, 255));
		SpeedLabel.setBounds(340, 132, 150, 13);
		frame.getContentPane().add(SpeedLabel);
		
		JLabel ErrorLabel = new JLabel("");
		ErrorLabel.setBounds(290, 340, 200, 50);
		ErrorLabel.setForeground(new Color(255, 255, 255));
		frame.getContentPane().add(ErrorLabel);
		
		JButton UpButton = new JButton("Up");
		UpButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setTravelRate(1);
				SpeedLabel.setText("Set Travel Speed (" + travelRate + ")");
			}
		});
		UpButton.setBounds(340, 151, 50, 21);
		frame.getContentPane().add(UpButton);
		
		JButton DownButton = new JButton("Down");
		DownButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setTravelRate(-1);
				SpeedLabel.setText("Set Travel Speed (" + travelRate + ")");
			}
		});
		DownButton.setBounds(400, 151, 70, 21);
		frame.getContentPane().add(DownButton);
		
		JButton TravelButton = new JButton("Travel");
		TravelButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				boolean error = false;
				if(!consumptionCheck) {
					ErrorLabel.setText("Consumption rate not selected");
					error = true;
				}
				if(!FoodClass.haveFood()) {
					ErrorLabel.setText("You have no substantial food");
					error = true;
				}
				if(!ItemClass.checkWeight()) {
					ErrorLabel.setText("Wagon is too heavy");
					error = true;
				}
				
				if (!error){
					ErrorLabel.setText("");
					int days = 2200 / travelRate;
					if(FoodClass.isFoodEnough(travelRate, consumptionRate)) {
						ErrorLabel.setText("You have enough food");
					}
					else {
						ErrorLabel.setText("You do NOT have enough food");
					}
				}
			}
		});
		TravelButton.setForeground(new Color(0, 0, 0));
		TravelButton.setBackground(new Color(255, 0, 0));
		TravelButton.setBounds(281, 400, 190, 50);
		frame.getContentPane().add(TravelButton);
		
		JLabel PhotoLabel = new JLabel("Photo Credit: John K. Estell");
		PhotoLabel.setForeground(new Color(255, 255, 255));
		PhotoLabel.setBounds(10, 413, 200, 13);
		frame.getContentPane().add(PhotoLabel);
		
		JLabel PictureLabel = new JLabel("");
		ImageIcon picture = new ImageIcon(this.getClass().getResource("/Oregon_Trail_Package/ScottsBluff.JPG"));
		PictureLabel.setIcon(picture);
		PictureLabel.setBounds(0, 0, 486, 453);
		frame.getContentPane().add(PictureLabel);
	}
	
	public void setObjects() {
		//Opening the CSV File and setting up the input scanner
		InputStreamReader in = new InputStreamReader(this.getClass().getResourceAsStream("/Oregon_Trail_Package/WagonItems.csv"));
		Scanner scr = new Scanner(in);
		//Loop through all of the items in the csv file
		//Get each value without the commas and put them into a object variable
		//set that full object into an arrayList
		//CSV Order: String Name, String Type, Int Weight, Bool Selected, Bool Substantial
		while(scr.hasNext()) {
			//System.out.println(scr.next());
			Scanner reader = new Scanner(scr.next());
			scr.nextLine();
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
			System.out.println(object.getName());
			items.add(object);
			reader.close();
		}
		scr.close();
	}
	
	/** 
	 *
	 * Sets the travel rate
	 *
	 * @param input  the input. 
	 * @return int
	 */
	public int setTravelRate(int input) {
		travelRate += input;
		if (travelRate > 20) {
			travelRate = 20;
		}
		if (travelRate < 12) {
			travelRate = 12;
		}
		return travelRate;
	}
}

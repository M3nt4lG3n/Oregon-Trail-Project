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
import javax.swing.JButton;
import javax.swing.JCheckBox;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import java.awt.Color;

public class Oregon_Trail_Window {
	private JFrame frame;
	static ArrayList<ItemClass> items = new ArrayList<ItemClass>();
	private JTextField SpeedField;
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
		
		JLabel lblNewLabel = new JLabel("Food Name, Weight, Selected");
		lblNewLabel.setBounds(10, 10, 162, 20);
		frame.getContentPane().add(lblNewLabel);
		
		JCheckBox AppleCheckBox = new JCheckBox("Apple Vinegar, 25");
		AppleCheckBox.setBounds(10, 36, 117, 21);
		AppleCheckBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AppleCheckBox.isSelected();
			}
		});
		frame.getContentPane().add(AppleCheckBox);
		
		JCheckBox BaconCheckBox = new JCheckBox("Bacon, 400");
		BaconCheckBox.setBounds(10, 59, 117, 21);
		BaconCheckBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				BaconCheckBox.isSelected();
			}
		});
		frame.getContentPane().add(BaconCheckBox);
		
		JCheckBox BeansCheckBox = new JCheckBox("Beans, 200");
		BeansCheckBox.setBounds(10, 82, 117, 21);
		BeansCheckBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				BeansCheckBox.isSelected();
			}
		});
		frame.getContentPane().add(BeansCheckBox);
		
		JCheckBox CoffeeCheckBox = new JCheckBox("Coffee, 80");
		CoffeeCheckBox.setBounds(10, 105, 117, 21);
		BeansCheckBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CoffeeCheckBox.isSelected();
			}
		});
		frame.getContentPane().add(CoffeeCheckBox);
		
		JCheckBox DriedCheckBox = new JCheckBox("Dried Apples, 80");
		DriedCheckBox.setBounds(10, 128, 117, 21);
		BeansCheckBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DriedCheckBox.isSelected();
			}
		});
		frame.getContentPane().add(DriedCheckBox);
		
		JCheckBox FlourCheckBox = new JCheckBox("Flour, 500");
		FlourCheckBox.setBounds(10, 151, 117, 21);
		BeansCheckBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FlourCheckBox.isSelected();
			}
		});
		frame.getContentPane().add(FlourCheckBox);
		
		JCheckBox HardtackCheckBox = new JCheckBox("Hardtack, 200");
		HardtackCheckBox.setBounds(10, 174, 117, 21);
		BeansCheckBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				HardtackCheckBox.isSelected();
			}
		});
		frame.getContentPane().add(HardtackCheckBox);
		
		JCheckBox LardCheckBox = new JCheckBox("Lard, 200");
		LardCheckBox.setBounds(10, 197, 117, 21);
		BeansCheckBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LardCheckBox.isSelected();
			}
		});
		frame.getContentPane().add(LardCheckBox);
		
		JCheckBox SaltCheckBox = new JCheckBox("Salt, 50");
		SaltCheckBox.setBounds(10, 220, 117, 21);
		BeansCheckBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SaltCheckBox.isSelected();
			}
		});
		frame.getContentPane().add(SaltCheckBox);
		
		JCheckBox SugarCheckBox = new JCheckBox("Sugar, 40");
		SugarCheckBox.setBounds(10, 243, 117, 21);
		BeansCheckBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SugarCheckBox.isSelected();
			}
		});
		frame.getContentPane().add(SugarCheckBox);
		
		JCheckBox RiceCheckBox = new JCheckBox("Rice, 200");
		RiceCheckBox.setBounds(10, 268, 117, 21);
		BeansCheckBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				RiceCheckBox.isSelected();
			}
		});
		frame.getContentPane().add(RiceCheckBox);
		
		JCheckBox WaterCheckBox = new JCheckBox("Water, 100");
		WaterCheckBox.setBounds(10, 291, 117, 21);
		BeansCheckBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				WaterCheckBox.isSelected();
			}
		});
		frame.getContentPane().add(WaterCheckBox);
		
		JCheckBox WhiskeyCheckBox = new JCheckBox("Whiskey, 40");
		WhiskeyCheckBox.setBounds(10, 314, 117, 21);
		BeansCheckBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				WhiskeyCheckBox.isSelected();
			}
		});
		frame.getContentPane().add(WhiskeyCheckBox);
		
		JLabel FoodSubtotalLabel = new JLabel("Subtotal: ");
		FoodSubtotalLabel.setBounds(10, 341, 117, 28);
		frame.getContentPane().add(FoodSubtotalLabel);
		
		JLabel lblDryGoodName = new JLabel("Dry Good Name, Weight, Selected");
		lblDryGoodName.setBounds(182, 10, 162, 20);
		frame.getContentPane().add(lblDryGoodName);
		
		JCheckBox BedrollCheckBox = new JCheckBox("Bedroll, 15");
		BedrollCheckBox.setBounds(182, 36, 93, 21);
		BedrollCheckBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				BedrollCheckBox.isSelected();
			}
		});
		frame.getContentPane().add(BedrollCheckBox);
		
		JCheckBox BlacksmithingCheckBox = new JCheckBox("Blacksmithing Tools, 200");
		BlacksmithingCheckBox.setBounds(182, 59, 150, 21);
		BlacksmithingCheckBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				BlacksmithingCheckBox.isSelected();
			}
		});
		frame.getContentPane().add(BlacksmithingCheckBox);
		
		//I'm not going to add in the isSelected function for each of these, please add them in in my stead
		JCheckBox BooksCheckBox = new JCheckBox("Books, 75");
		BooksCheckBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		BooksCheckBox.setBounds(182, 82, 93, 21);
		frame.getContentPane().add(BooksCheckBox);
		
		JCheckBox MedicineCheckBox = new JCheckBox("Medicine, 10");
		MedicineCheckBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		MedicineCheckBox.setBounds(182, 105, 93, 21);
		frame.getContentPane().add(MedicineCheckBox);
		
		JCheckBox CastCheckBox = new JCheckBox("Cast Iron Stove, 300");
		CastCheckBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		CastCheckBox.setBounds(182, 128, 130, 21);
		frame.getContentPane().add(CastCheckBox);
		
		JCheckBox ChairCheckBox = new JCheckBox("Chair, 20");
		ChairCheckBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		ChairCheckBox.setBounds(182, 151, 93, 21);
		frame.getContentPane().add(ChairCheckBox);
		
		JCheckBox CookwareCheckBox = new JCheckBox("Cooking & Eating Utensil, 75");
		CookwareCheckBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		CookwareCheckBox.setBackground(new Color(240, 240, 240));
		CookwareCheckBox.setBounds(182, 174, 200, 21);
		frame.getContentPane().add(CookwareCheckBox);
		
		JCheckBox GrannysCheckBox = new JCheckBox("Granny's Clock. 15");
		GrannysCheckBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		GrannysCheckBox.setBounds(182, 197, 120, 21);
		frame.getContentPane().add(GrannysCheckBox);
		
		JCheckBox GunCheckBox = new JCheckBox("Gun Making Tools, 200");
		GunCheckBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		GunCheckBox.setBounds(182, 220, 150, 21);
		frame.getContentPane().add(GunCheckBox);
		
		JCheckBox KeepsakesCheckBox = new JCheckBox("Keepsakes, 40");
		KeepsakesCheckBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		KeepsakesCheckBox.setBounds(182, 243, 93, 21);
		frame.getContentPane().add(KeepsakesCheckBox);
		
		JCheckBox LeadCheckBox = new JCheckBox("Lead Shot, 25");
		LeadCheckBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		LeadCheckBox.setBounds(182, 268, 93, 21);
		frame.getContentPane().add(LeadCheckBox);
		
		JCheckBox MirrorCheckBox = new JCheckBox("Mirror, 15");
		MirrorCheckBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		MirrorCheckBox.setBounds(182, 291, 93, 21);
		frame.getContentPane().add(MirrorCheckBox);
		
		JCheckBox GunpowderCheckBox = new JCheckBox("Gunpowder, 15");
		GunpowderCheckBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		GunpowderCheckBox.setBounds(182, 314, 110, 21);
		frame.getContentPane().add(GunpowderCheckBox);
		
		JCheckBox TentCheckBox = new JCheckBox("Tent & Gear, 150");
		TentCheckBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		TentCheckBox.setBounds(182, 337, 120, 21);
		frame.getContentPane().add(TentCheckBox);
		
		JCheckBox ToolsCheckBox = new JCheckBox("Tools, 50");
		ToolsCheckBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		ToolsCheckBox.setBounds(182, 360, 93, 21);
		frame.getContentPane().add(ToolsCheckBox);
		
		JCheckBox ToysCheckBox = new JCheckBox("Toys, 15");
		ToysCheckBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		ToysCheckBox.setBounds(182, 382, 93, 21);
		frame.getContentPane().add(ToysCheckBox);
		
		JButton FillingButton = new JButton("Filling");
		FillingButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		FillingButton.setBounds(362, 59, 85, 21);
		frame.getContentPane().add(FillingButton);
		
		JButton MeagerButton = new JButton("Meager");
		MeagerButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		MeagerButton.setBounds(362, 82, 85, 21);
		frame.getContentPane().add(MeagerButton);
		
		JButton BareButton = new JButton("Bare Bones");
		BareButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		BareButton.setBounds(362, 105, 85, 21);
		frame.getContentPane().add(BareButton);
		
		JLabel lblNewLabel_1 = new JLabel("Set Food Consumption");
		lblNewLabel_1.setBounds(360, 40, 120, 13);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Set Travel Speed (12 - 20)");
		lblNewLabel_2.setBounds(340, 132, 150, 13);
		frame.getContentPane().add(lblNewLabel_2);
		
		SpeedField = new JTextField();
		SpeedField.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		SpeedField.setBounds(355, 152, 96, 19);
		frame.getContentPane().add(SpeedField);
		SpeedField.setColumns(10);
		
		JLabel DrySubtotalLabel = new JLabel("Subtotal: ");
		DrySubtotalLabel.setBounds(182, 405, 117, 28);
		frame.getContentPane().add(DrySubtotalLabel);
		
		JButton TravelButton = new JButton("Travel");
		TravelButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		TravelButton.setForeground(new Color(255, 0, 0));
		TravelButton.setBackground(new Color(255, 0, 0));
		TravelButton.setBounds(281, 400, 190, 50);
		frame.getContentPane().add(TravelButton);
		
		JLabel ErrorLabel = new JLabel("");
		ErrorLabel.setBounds(340, 364, 45, 13);
		frame.getContentPane().add(ErrorLabel);
		
		
	}
	
	public void setObjects() {
		//Opening the CSV File and setting up the input scanner
		InputStreamReader in = new InputStreamReader(this.getClass().getResourceAsStream("/Oregon_Trail_Package/WagonItems.csv"));
		Scanner scr = new Scanner(in);
		//Loop through all of the items in the csv file
		//Get each value without the commas and put them into a object variable
		//set that full object into an arrayList
		//CSV Order: String Name, String Type, Int Weight, Bool Selected, Bool Substantial
		//The array is backwards, the food goods start at index 16
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
			items.add(object);
		}
		System.out.println(items);
	}
}

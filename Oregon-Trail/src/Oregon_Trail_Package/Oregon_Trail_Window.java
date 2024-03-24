package Oregon_Trail_Package;

import java.awt.EventQueue;
import java.awt.ItemSelectable;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JFrame;
import java.awt.BorderLayout;
import javax.swing.JPanel;

public class Oregon_Trail_Window {

	private JFrame frame;

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
	private void initialize() throws FileNotFoundException {
		ArrayList<ItemClass> items = new ArrayList<ItemClass>();
		
		frame = new JFrame();
		frame.setBounds(200, 200, 900, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new BorderLayout(0, 0));
		
		//Opening the CSV File and setting up the input scanner
		File inputFile = new File("WagonItems.csv");
		Scanner in = new Scanner(inputFile);
		in.useDelimiter(",");
		//Loop through all of the items in the csv file
		//Get each value without the commas and put them into a object variable
		//set that full object into an arrayList
		//CSV Order: String Name, String Type, Int Weight, Bool Selected, Bool Substantial
		while(in.hasNext()) {
			String name = in.next();
			String type = in.next();
			String tempWeight = in.next();
			int weight = Integer.parseInt(tempWeight);
			String tempSelected = in.next();
			boolean selected = Boolean.parseBoolean(tempSelected);
			String tempSubstantial = in.next();
			boolean substantial = Boolean.parseBoolean(tempSubstantial);
			
			
			ItemClass item = new ItemClass(name, type, weight, selected, substantial);
			items.add(item);
		}
	}

}

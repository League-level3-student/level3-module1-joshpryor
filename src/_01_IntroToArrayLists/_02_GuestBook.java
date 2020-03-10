package _01_IntroToArrayLists;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class _02_GuestBook implements ActionListener {
	// Create a GUI with two buttons. One button reads "Add Name" and the other button reads "View Names". 
	ArrayList <String> franktonstienithon = new ArrayList<String>();
	public static void main(String[] args) {
		_02_GuestBook bobithanington = new _02_GuestBook();
		bobithanington.code();
	
	}
	JButton addd = new JButton();
	JButton vew = new JButton();
	// When the add name button is clicked, display an input dialog that asks the user to enter a name. Add
	// that name to an ArrayList. When the "View Names" button is clicked, display a message dialog that displays
	// all the names added to the list. Format the list as follows:
	// Guest #1: Bob Banders
	// Guest #2: Sandy Summers
	// Guest #3: Greg Ganders
	// Guest #4: Donny Doners
	void code() {
		JFrame window = new JFrame("Guest_Book");
		JPanel panal = new JPanel();

		addd.setText("Add Name");
		
		vew.setText("View Name");
		window.add(panal);
		panal.add(vew);
		panal.add(addd);
		window.setVisible(true);
		window.setDefaultCloseOperation(window.EXIT_ON_CLOSE);
		window.pack();
		addd.addActionListener(this);
		vew.addActionListener(this);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if ( addd == e.getSource() ) {
			String add = JOptionPane.showInputDialog(" Enter a name. ");
			franktonstienithon.add(add);
		}
		if ( vew == e.getSource() ) {
			for (int i = 0; i < franktonstienithon.size(); i++) {
				JOptionPane.showMessageDialog(null, "Guest #" + franktonstienithon.get(i) + ":  " + vew);		
			}
		}
	}
	
	
}

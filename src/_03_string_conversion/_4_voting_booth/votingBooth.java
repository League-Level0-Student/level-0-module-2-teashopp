package _03_string_conversion._4_voting_booth;

import javax.swing.JOptionPane;

public class votingBooth {
	
	public static void main(String[] args) {
		
		String age = JOptionPane.showInputDialog("How old are you?");
		
		int ageInt = Integer.parseInt(age);
		
		if(ageInt >= 18) {
			
			String president = JOptionPane.showInputDialog("Who do you think should be president?");
			JOptionPane.showMessageDialog(null, president + ", good choice.");
			
		}
		
		else {
			
			JOptionPane.showMessageDialog(null, "You're too young to have an opinion.");
			
		}
		
	}

}

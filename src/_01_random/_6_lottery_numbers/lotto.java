package _01_random._6_lottery_numbers;

import java.util.Random;

import javax.swing.JOptionPane;

public class lotto {
	
	public static void main(String[] args) {

	Random lotto = new Random();
	
	int lotto0 = lotto.nextInt(7)-0;
	int lotto1 = lotto.nextInt(7)-0;
	int lotto2 = lotto.nextInt(7)-0;
	int lotto3 = lotto.nextInt(7)-0;
	int lotto4 = lotto.nextInt(7)-0;
	int lotto5 = lotto.nextInt(7)-0;
	
	JOptionPane.showMessageDialog(null, lotto0 + ", " + lotto1 + ", " + lotto2 + ", "+ lotto3 + ", " + lotto4 + ", " + lotto5, "Your lottery numbers are: ", JOptionPane.PLAIN_MESSAGE);

	}
}

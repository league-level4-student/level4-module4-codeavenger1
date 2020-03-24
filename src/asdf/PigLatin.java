package asdf;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PigLatin {
	public static void main(String[] args) {
		PigLatin pig = new PigLatin();
		pig.main2();
		pig.isLetter('a');
	}

	public static void main2() {
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		frame.add(panel);
		frame.show();
		JTextField text1 = new JTextField(10);
		JButton button = new JButton();
		JTextField text2 = new JTextField(10);
		panel.add(text1);
		panel.add(button);
		panel.add(text2);
		button.setLabel("Translate");
		frame.pack();
	}

	private static boolean isLetter(char c) {
		
		return ((c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z'));
	}
	
	public String translate(String s) {
	String latin = "";
	int i = 0;
	while (i < s.length()) {
	while (i < s.length() && !isLetter(s.charAt(i))) {
	latin = latin + s.charAt(i);
	i++;
	}
	
	if (i>=s.length()) break;
	int begin = i;
	while (i < s.length() && isLetter(s.charAt(i))) {
	i++;
	}
	int end = i;
	latin = latin + pigWord(s.substring(begin, end));
	}
	return latin;
	}
	
		  private static int firstVowel(String word) {
	word = word.toLowerCase();
	for (int i=0; i < word.length(); i++)
	if (word.charAt(i)=='a' || word.charAt(i)=='e' ||
	word.charAt(i)=='i' || word.charAt(i)=='o' ||
	word.charAt(i)=='u')
	return i;
	return 0;
	}
	}


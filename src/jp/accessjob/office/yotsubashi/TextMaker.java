package jp.accessjob.office.yotsubashi;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;

public class TextMaker {
	//maketext
	static JLabel makeText(String str, int size, Color color) {
		JLabel label = new JLabel(str);
		label.setForeground(color);
		label.setFont(new Font("Meiryo",Font.BOLD,size));
		label.setHorizontalAlignment(JLabel.CENTER);
		label.setVerticalAlignment(JLabel.CENTER);
		return label;
	}
}

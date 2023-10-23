package jp.accessjob.office.yotsubashi;

import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class ContentsMaker {
	//maketext
	static JLabel makeText(String str, int size, Color color) {
		JLabel label = new JLabel(str);
		label.setForeground(color);
		label.setFont(new Font("Meiryo",Font.BOLD,size));
		label.setHorizontalAlignment(JLabel.CENTER);
		label.setVerticalAlignment(JLabel.CENTER);
		return label;
	}
	
	static JLabel makeContents(String str, ImageIcon icon, int size, Color color) {
		JLabel label = new JLabel(str, icon, JLabel.CENTER);
		label.setForeground(color);
		label.setFont(new Font("Meiryo",Font.BOLD,size));
		label.setHorizontalTextPosition(JLabel.CENTER);
		label.setVerticalTextPosition(JLabel.TOP);
		return label;
	}
}

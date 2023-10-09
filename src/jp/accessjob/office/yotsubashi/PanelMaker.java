package jp.accessjob.office.yotsubashi;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JPanel;

public class PanelMaker {
	static JPanel makePanel(Color color, int width, int height) {
		//ヘッダ・フッタ用メソッド
		JPanel panel = new JPanel();
		panel.setBackground(color);
		panel.setPreferredSize(new Dimension(width,height));
		return panel;
	}
	
	//コンテンツパネル用メソッド
	static JPanel makePanel(Color color) {
		JPanel panel = new JPanel();
		panel.setBackground(color);
		return panel;
	}
}

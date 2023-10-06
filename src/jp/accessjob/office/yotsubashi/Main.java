package jp.accessjob.office.yotsubashi;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		//Main Window
		JFrame frame = new JFrame("じゃんけんゲーム");
		frame.setSize(900, 600);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setAutoRequestFocus(false);
		
		//HaderPanel
		JPanel headerpanel = new JPanel();
		headerpanel.setBackground(Color.BLACK);
		headerpanel.setPreferredSize(new Dimension(900,50));
		frame.add(headerpanel, BorderLayout.NORTH);
		
		//ContentsPanel
		JPanel contentspanel = new JPanel();
		contentspanel.setBackground(Color.BLUE);
		frame.add(contentspanel, BorderLayout.CENTER);
		
		//FooterPanel
		JPanel footerpanel = new JPanel();
		footerpanel.setBackground(Color.GREEN);
		footerpanel.setPreferredSize(new Dimension(900,50));
		frame.add(footerpanel, BorderLayout.SOUTH);
		
		frame.setVisible(true);
		
	}

}

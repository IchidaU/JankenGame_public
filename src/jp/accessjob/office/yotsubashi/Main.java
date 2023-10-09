package jp.accessjob.office.yotsubashi;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Main {
	
	//プレイヤー側手配列
	private static String[] hands = {"グー","チョキ","パー"};
	
	static JLabel contentsLabel;

	public static void main(String[] args) {
		//Main Window
		JFrame frame = new JFrame("じゃんけんゲーム");
		frame.setSize(900, 600);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		
		//HaderPanel
		JPanel headerPanel = PanelMaker.makePanel(Color.BLACK, 900,50);
		headerPanel.setLayout(new BorderLayout());
		JLabel headerLabel = TextMaker.makeText("じゃんけんしようぜ！", 24, Color.WHITE);
		headerPanel.add(headerLabel);
		frame.add(headerPanel, BorderLayout.NORTH);
		
		//ContentsPanel
		JPanel contentsPanel = PanelMaker.makePanel(Color.WHITE);
		contentsPanel.setLayout(new BorderLayout());
		contentsLabel = TextMaker.makeText("じゃんけん…",54,Color.BLACK);
		contentsPanel.add(contentsLabel);
		frame.add(contentsPanel, BorderLayout.CENTER);
		
		//FooterPanel
		JPanel footerPanel = PanelMaker.makePanel(Color.BLACK,900,50);
		footerPanel.setLayout(new GridLayout());
		
		//ボタン生成
		for(String hand : hands) {
			JButton button = new JButton(hand);
			button.setFont(new Font("Meiryo", Font.PLAIN, 24));
			button.addActionListener(new ButtonActionListener());
			footerPanel.add(button);
		}
		
		frame.add(footerPanel, BorderLayout.SOUTH);
		
		frame.setVisible(true);
		
	}
	
	static class ButtonActionListener implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			int computerNum = ComputerHand.getComputerHand();
			String computerHand = hands[computerNum];
			contentsLabel.setText(computerHand);
			System.out.println(e.getActionCommand());
		}
	}
}

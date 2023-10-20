package jp.accessjob.office.yotsubashi;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Main {
	
	//プレイヤー側手配列
	private static String[] hands = {"グー","チョキ","パー"};
	private static ImageIcon[] buttonHands = 	{
	new ImageIcon("img/image1.png"),
	new ImageIcon("img/image2.png"),
	new ImageIcon("img/image3.png")
	};

	static JLabel contentsLabel;
	static JLabel headerLabel;

	public static void main(String[] args) {
		//Main Window
		JFrame frame = new JFrame("じゃんけんゲーム");
		frame.setSize(900, 650);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		
		//HaderPanel
		JPanel headerPanel = PanelMaker.makePanel(Color.BLACK, 900,100);
		headerPanel.setLayout(new BorderLayout());
		headerLabel = TextMaker.makeText("じゃんけんしようぜ！", 24, Color.WHITE);
		headerPanel.add(headerLabel);
		frame.add(headerPanel, BorderLayout.NORTH);
		
		//ContentsPanel
		JPanel contentsPanel = PanelMaker.makePanel(Color.WHITE);
		contentsPanel.setLayout(new BorderLayout());
		contentsLabel = TextMaker.makeText("じゃんけん…",54,Color.BLACK);
		contentsPanel.add(contentsLabel);
		frame.add(contentsPanel, BorderLayout.CENTER);
		
		//FooterPanel
		JPanel footerPanel = PanelMaker.makePanel(Color.BLACK,900,200);
		footerPanel.setLayout(new GridLayout());
		
		//ボタン生成
		for(int i=0; i<hands.length; i++) {
			JButton button = new JButton(hands[i],buttonHands[i]);
			button.setFont(new Font("Meiryo", Font.PLAIN, 24));
			button.setHorizontalTextPosition(JButton.CENTER);
			button.setVerticalTextPosition(JButton.BOTTOM);
			button.addActionListener(new ButtonActionListener());
			footerPanel.add(button);
		}		
		
		frame.add(footerPanel, BorderLayout.SOUTH);
		
		frame.setVisible(true);
		
	}
	
	//ボタンアクション
	static class ButtonActionListener implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			//コンピュータ側手生成、テキスト挿入
			int computerNum = ComputerHand.getComputerHand();
			String computerHand = hands[computerNum];
			contentsLabel.setText(computerHand);
			
			//プレイヤー側手取得
			int playerNum = 0;
			for(int i=0; i<hands.length; i++) {
				if(hands[i]==e.getActionCommand()) {
					playerNum = i;
					break;
				}
			}
			
			//勝敗判定、結果表示
			String result = Judge.judgeResult(playerNum, computerNum);
			headerLabel.setText(result);
		}
	}
}

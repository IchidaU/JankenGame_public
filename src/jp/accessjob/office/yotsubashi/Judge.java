package jp.accessjob.office.yotsubashi;

public class Judge {
	static String judgeResult(int playerHand, int computerHand) {
		String[][] janken = {
				{"あいこ","勝ち","負け"},
				{"負け","あいこ","勝ち"},
				{"勝ち","負け","あいこ"}};
		
		return janken[playerHand][computerHand];
	}
}

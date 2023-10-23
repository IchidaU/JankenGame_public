package jp.accessjob.office.yotsubashi;

public class Judge {
	static String judgeResult(int playerHand, int computerHand) {
		String[][] janken = {
				{"あいこだね！もう一回！","やったね！君の勝ちだよ！","残念！君の負けだよ！"},
				{"残念！君の負けだよ！","あいこだね！もう一回！","やったね！君の勝ちだよ！"},
				{"やったね！君の勝ちだよ！","残念！君の負けだよ！","あいこだね！もう一回！"}};
		
		return janken[playerHand][computerHand];
	}
}

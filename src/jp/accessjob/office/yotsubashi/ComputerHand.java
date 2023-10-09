package jp.accessjob.office.yotsubashi;

import java.util.Random;

public class ComputerHand {
	static int getComputerHand(){
		Random rand = new Random();
		int comp = rand.nextInt(3);
		return comp;
	}
}

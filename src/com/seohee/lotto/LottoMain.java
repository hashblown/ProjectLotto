package com.seohee.lotto;

public class LottoMain {

	// 2018-08-27 �ּ��� �߰��߽��ϴ�
	public static void main(String[] args) {
		
		Lotto lotto = new Lotto();
		
		int numbers[] = lotto.generate();
		
		for(int num : numbers) {
			System.out.print(num + ". ");
		}
	}

}

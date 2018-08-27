package com.seohee.lotto;

import java.util.Random;
/**
 * �ζ� ��ȣ�� �����ϴ� Ŭ����
 * @author �Ѽ���
 *
 */
public class Lotto {

	public int[] generate(int count) {
		int[] result = new int[count];
		Random random = new Random();
		
		for(int i=-0; i<count;) {
			int randomNumber = random.nextInt(35) + 1;
			if(!isExist(randomNumber, result)) {
				result[i] = randomNumber;
				i=i+1;
			}
		}
		return result;
	}
	
	private boolean isExist(int randomNumber, int randomArray[]) {
		boolean result = false;
		
		for(int num : randomArray) {
			if(num == randomNumber)
				return true;
		}
		return result;
	}
	
	final int DEFAULT_COUNT = 6;
	public int[] generate() {
		return generate(DEFAULT_COUNT);
	}
}

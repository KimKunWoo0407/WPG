/*
 * 2016112180 ��ǿ�
 * Multiply�� ���� WordTemplate�� ������ ����� ���� �����.
 */


package WPG;

import java.util.ArrayList;

public class Multiply extends Operator{
	

	public Multiply(String s) {
		super(s);
		fwt=new FMultiplyWordTemplate();
		mwt=new MMultiplyWordTemplate();
		lwt=new LMultiplyWordTemplate();
	}
	
	@Override
	public String makeQuestion(float[] range, ArrayList<People> f, ArrayList<Interest> is) {
		
		selectRandom((int)range[1], (int)range[0], f, is);
		
		fwt.getInfo(f1, f2, i, operandNum[0], operandNum[1]);
		mwt.getInfo(f1, f2, i, operandNum[0], operandNum[1]);
		lwt.getInfo(f1, f2, i, operandNum[0], operandNum[1]);
		
		question=fwt.firstWord()+mwt.middleWord()+lwt.lastWord(); 

		answer=operandNum[0]*operandNum[1];
		
		return question;
	}

}

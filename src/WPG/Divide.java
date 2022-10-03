/*
 * 2016112180 김건우
 * Divide에 관한 WordTemplate로 문제를 만들고 답을 만든다.
 */


package WPG;

import java.util.ArrayList;

public class Divide extends Operator{

	public Divide(String s) {
		super(s);
		fwt=new FDivideWordTemplate(); 
		mwt=new MDivideWordTemplate();
		lwt=new LDivideWordTemplate();
	}
	
	@Override
	public String makeQuestion(float[] range, ArrayList<People> f, ArrayList<Interest> is) {

		selectRandom((int)range[1], (int)range[0], f, is);
		
		//답이 1보다 작지 않도록 하였다.
		int bigger = operandNum[0]>=operandNum[1]?operandNum[0]:operandNum[1];
		int smaller = operandNum[0]==bigger?operandNum[1]:operandNum[0];
		
		fwt.getInfo(f1, f2, i, bigger, smaller);
		mwt.getInfo(f1, f2, i, bigger, smaller);
		lwt.getInfo(f1, f2, i, bigger, smaller);
		
		question=fwt.firstWord()+ mwt.middleWord()+lwt.lastWord();
		
		answer=(float)bigger/(smaller+1);
		
		return question;
	}

}

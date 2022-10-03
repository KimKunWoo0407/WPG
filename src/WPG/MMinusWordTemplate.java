/*
 * 2016112180 김건우
 * Multiply의 가운데 문장
 */

package WPG;

public class MMinusWordTemplate extends MiddleWordTemplate{

	private String howmanygive(){
		return f1+"은(는) " +f2+"에게 "+i.getName()+"을(를) "+p1+i.getUnit()+" 주었습니다. ";
	}
	
	@Override
	public String middleWord() {
		return howmanygive();
	}

}

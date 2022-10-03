/*
 * 2016112180 김건우
 * Divide의 마지막 문장
 */

package WPG;

public class LDivideWordTemplate extends LastWordTemplate{

	private String howmanyQ() {
		return "\n각각 "+i.getName()+"을(를) 몇 "+i.getUnit()+"씩 가지게 되나요?\n"; 
	}
	
	@Override
	public String lastWord() {
		
		return howmanyQ();
	}

}

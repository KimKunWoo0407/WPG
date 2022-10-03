/*
 * 2016112180 김건우
 * Plus의 마지막 문장
 */

package WPG;

public class LPlusWordTemplate extends LastWordTemplate{
	
	private String howmanyQ() {
		return "\n 그들이 가지고 있는 "+i.getName()+"은(는) 모두 몇 "+i.getUnit()+"입니까?\n"; 
	}

	@Override
	public String lastWord() {
		
		return howmanyQ();
	}
}

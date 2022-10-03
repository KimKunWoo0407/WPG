/*
 * 2016112180 김건우
 * Minus의 마지막 문장
 */

package WPG;

public class LMinusWordTemplate extends LastWordTemplate{

	private String howmanyQ() {
		return "\n"+f1+"에게 몇 "+i.getUnit()+"의 "+i.getName()+"이(가) 남았습니까?\n"; 
	}
	
	@Override
	public String lastWord() {
		
		return howmanyQ();
	}

}

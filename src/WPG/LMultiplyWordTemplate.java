/*
 * 2016112180 김건우
 * Multiply의 마지막 문장
 */

package WPG;

public class LMultiplyWordTemplate extends LastWordTemplate{

	
	private String howmanyQ() {
		return "\n"+f1+"은(는) 전부 " +i.getName()+"이(가) 모두 몇 "+i.getUnit()+" 있습니까?\n";
	}
	
	@Override
	public String lastWord() {
		return howmanyQ();
	}

}

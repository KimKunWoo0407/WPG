/*
 * 2016112180 김건우
 * Plus의 첫 문장
 */

package WPG;

public class FPlusWordTemplate extends FirstWordTemplate{

	private String WhoHowmanyWhat() {
		return f1+"은(는) "+i.getName()+"을(를) "+p0+i.getUnit()+"가지고 있습니다. ";
	}
	
	@Override
	public String firstWord() {
		return WhoHowmanyWhat();
	}

}

/*
 * 2016112180 김건우
 * Multiply의 첫 문장
 */

package WPG;

public class FMultiplyWordTemplate extends FirstWordTemplate{

	private String WhoHowmanyWhat() {
		return f1+"은(는) "+p0+i.getUnit()+"의 "+ i.getName()+"을(를) "+p1+"묶음 가지고 있습니다. ";
	}

	@Override
	public String firstWord() {
		return WhoHowmanyWhat();
	}

}

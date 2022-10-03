/*
 * 2016112180 김건우
 * Plus의 가운데 문장
 */

package WPG;

public class MPlusWordTemplate extends MiddleWordTemplate{
	
	private String WhoHowmanyWhat() {
		return f2+"은(는) "+i.getName()+"을(를) "+p1+i.getUnit()+" 가지고 있습니다. ";
	}

	@Override
	public String middleWord() {
		
		return WhoHowmanyWhat();
	}

}

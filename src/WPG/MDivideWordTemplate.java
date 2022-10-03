/*
 * 2016112180 김건우
 * Divide의 가운데 문장
 */

package WPG;

public class MDivideWordTemplate extends MiddleWordTemplate{

	private String howmanyDistribute() {
		return " 그(그녀)는 " +p1+"명의 친구들에게 똑같이 나누어 주고 싶습니다.";
	}
	
	@Override
	public String middleWord() {
		
		return howmanyDistribute();
	}

}

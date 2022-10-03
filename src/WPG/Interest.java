/*
 * 2016112810 김건우
 */

package WPG;

public class Interest extends ObjtoQuestion{

	private String unit= "개"; //일단 ~개로 단위가 정해져있다. 차후 getinfo를 통해서 변경할 수 있다.
	private String type;
	
	public String getUnit() { //단위를 얻는다.
		return unit;
	}
	
	public Interest(String name) {
		super(name);
	}
	
	@Override
	public void getinfo() {
		/*
		 * 사진 등을 입력하고 DB를 참고하여 단어에 쓰이는 적절한 단위와 
		 * 정수까지만 쓰일 수 있는지, 소수까지도 쓸수 있는지 등 타입의 범위를 설정한다.
		 */
		
	}
}

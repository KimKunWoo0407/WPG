/*
 * 2016112180 김건우
 * 인물, 관심사의 사진 등의 정보를 얻기 위해 만든 클래스 
 */

package WPG;

abstract public class ObjtoQuestion {
	private String name;
	private Object picture;
	
	public ObjtoQuestion(String name) {
		this.name=name;
	}
	
	public String getName() {
		return name;
	}
	
	public abstract void getinfo(); // 기본적으로 사진을 업로드 한다.
	
}

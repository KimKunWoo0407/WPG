/*
 * 2016112180 ��ǿ�
 * �ι�, ���ɻ��� ���� ���� ������ ��� ���� ���� Ŭ���� 
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
	
	public abstract void getinfo(); // �⺻������ ������ ���ε� �Ѵ�.
	
}

/*
 * 2016112810 ��ǿ�
 */

package WPG;

public class Interest extends ObjtoQuestion{

	private String unit= "��"; //�ϴ� ~���� ������ �������ִ�. ���� getinfo�� ���ؼ� ������ �� �ִ�.
	private String type;
	
	public String getUnit() { //������ ��´�.
		return unit;
	}
	
	public Interest(String name) {
		super(name);
	}
	
	@Override
	public void getinfo() {
		/*
		 * ���� ���� �Է��ϰ� DB�� �����Ͽ� �ܾ ���̴� ������ ������ 
		 * ���������� ���� �� �ִ���, �Ҽ������� ���� �ִ��� �� Ÿ���� ������ �����Ѵ�.
		 */
		
	}
}

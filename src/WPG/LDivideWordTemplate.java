/*
 * 2016112180 ��ǿ�
 * Divide�� ������ ����
 */

package WPG;

public class LDivideWordTemplate extends LastWordTemplate{

	private String howmanyQ() {
		return "\n���� "+i.getName()+"��(��) �� "+i.getUnit()+"�� ������ �ǳ���?\n"; 
	}
	
	@Override
	public String lastWord() {
		
		return howmanyQ();
	}

}

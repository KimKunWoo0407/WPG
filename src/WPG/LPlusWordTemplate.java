/*
 * 2016112180 ��ǿ�
 * Plus�� ������ ����
 */

package WPG;

public class LPlusWordTemplate extends LastWordTemplate{
	
	private String howmanyQ() {
		return "\n �׵��� ������ �ִ� "+i.getName()+"��(��) ��� �� "+i.getUnit()+"�Դϱ�?\n"; 
	}

	@Override
	public String lastWord() {
		
		return howmanyQ();
	}
}

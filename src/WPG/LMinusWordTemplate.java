/*
 * 2016112180 ��ǿ�
 * Minus�� ������ ����
 */

package WPG;

public class LMinusWordTemplate extends LastWordTemplate{

	private String howmanyQ() {
		return "\n"+f1+"���� �� "+i.getUnit()+"�� "+i.getName()+"��(��) ���ҽ��ϱ�?\n"; 
	}
	
	@Override
	public String lastWord() {
		
		return howmanyQ();
	}

}

/*
 * 2016112180 ��ǿ�
 * Multiply�� ������ ����
 */

package WPG;

public class LMultiplyWordTemplate extends LastWordTemplate{

	
	private String howmanyQ() {
		return "\n"+f1+"��(��) ���� " +i.getName()+"��(��) ��� �� "+i.getUnit()+" �ֽ��ϱ�?\n";
	}
	
	@Override
	public String lastWord() {
		return howmanyQ();
	}

}

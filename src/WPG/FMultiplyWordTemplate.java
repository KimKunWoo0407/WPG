/*
 * 2016112180 ��ǿ�
 * Multiply�� ù ����
 */

package WPG;

public class FMultiplyWordTemplate extends FirstWordTemplate{

	private String WhoHowmanyWhat() {
		return f1+"��(��) "+p0+i.getUnit()+"�� "+ i.getName()+"��(��) "+p1+"���� ������ �ֽ��ϴ�. ";
	}

	@Override
	public String firstWord() {
		return WhoHowmanyWhat();
	}

}

/*
 * 2016112180 ��ǿ�
 * Plus�� ù ����
 */

package WPG;

public class FPlusWordTemplate extends FirstWordTemplate{

	private String WhoHowmanyWhat() {
		return f1+"��(��) "+i.getName()+"��(��) "+p0+i.getUnit()+"������ �ֽ��ϴ�. ";
	}
	
	@Override
	public String firstWord() {
		return WhoHowmanyWhat();
	}

}

/*
 * 2016112180 ��ǿ�
 * Minus�� ù ����
 */


package WPG;

public class FMinusWordTemplate extends FirstWordTemplate{
	
	
	public String WhoHowmanyWhat() {
		return f1+"��(��) "+i.getName()+"��(��) "+p0+ i.getUnit()+"������ �ֽ��ϴ�. ";
	}

	@Override
	public String firstWord() {
		return WhoHowmanyWhat();
	}

}

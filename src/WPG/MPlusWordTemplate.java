/*
 * 2016112180 ��ǿ�
 * Plus�� ��� ����
 */

package WPG;

public class MPlusWordTemplate extends MiddleWordTemplate{
	
	private String WhoHowmanyWhat() {
		return f2+"��(��) "+i.getName()+"��(��) "+p1+i.getUnit()+" ������ �ֽ��ϴ�. ";
	}

	@Override
	public String middleWord() {
		
		return WhoHowmanyWhat();
	}

}

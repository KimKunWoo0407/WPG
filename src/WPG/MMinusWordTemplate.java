/*
 * 2016112180 ��ǿ�
 * Multiply�� ��� ����
 */

package WPG;

public class MMinusWordTemplate extends MiddleWordTemplate{

	private String howmanygive(){
		return f1+"��(��) " +f2+"���� "+i.getName()+"��(��) "+p1+i.getUnit()+" �־����ϴ�. ";
	}
	
	@Override
	public String middleWord() {
		return howmanygive();
	}

}

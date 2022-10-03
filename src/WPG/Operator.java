/*
 * 2016112180 ��ǿ�
 * �������ڵ��� ������ �޾� ������ �����.
 */

package WPG;

import java.util.ArrayList;
import java.util.Random;

public abstract class Operator {
	protected String description;
	protected Random random;
	protected float answer;
	protected String question;
	protected int[] operandNum=new int[2];
	protected String f1;
	protected String f2;
	protected Interest i;
	protected FirstWordTemplate fwt; 
	protected MiddleWordTemplate mwt;
	protected LastWordTemplate lwt;
	
	public Operator(String s){
		description=s;
		random=new Random();
	}
	
	public String getDescription() {
		return description;
	}
	
	public abstract String makeQuestion(float[] range, ArrayList<People> f, ArrayList<Interest> is);
	
	//ArrayList�� ���� �߿��� ���� ��ü�� ���� �����ϰ� �̴´�.
	protected void selectRandom(int high, int low, ArrayList<People> f, ArrayList<Interest> is) {
		operandNum[0]=random.nextInt(high)+low;
		operandNum[1]=random.nextInt(high)+low;
		f1=f.get(random.nextInt(f.size())).getName();
		f2 = f.get(random.nextInt(f.size())).getName();
		while(f2.equals(f1))
			f2=f.get(random.nextInt(f.size())).getName();
		i = is.get(random.nextInt(is.size()));
	}
	
	public float makeAnswer() //����Ŭ�������� ���� ���� ��ȯ�Ѵ�
	{
		return answer;
	}

}

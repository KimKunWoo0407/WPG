/*
 * 2016112180 ��ǿ�
 */

package WPG;

import java.util.ArrayList;
import java.util.Scanner;

public class Score {
	private ArrayList<Float> studentAnswer=new ArrayList<Float>();
	private ArrayList<Float> answer;
	private int score;
	private Scanner scanner=new Scanner(System.in);
	
	public Score(ArrayList<Float> answer) {
		this.answer=answer; //������ �޾ƿ´�.
	}
	
	public void getMyAnswer() { //�������� �ʾ����� ���Ŀ� ���� �� �ִٰ� �����Ͽ� �����Ͽ���. 
		for(int i=0;i<studentAnswer.size();i++)
			System.out.print(studentAnswer.get(i)+" ");
		System.out.println("");
	}
	
	public void solve() { //������ Ǭ��
		
		for(int i=0;i<answer.size();i++)
			studentAnswer.add(scanner.nextFloat());
	}
	
	public void grade() { //ä���Ѵ�. ���信 �Ҽ����� �ִٸ� �Ҽ����� ��°�ڸ����� ���Ͽ� ���ڸ����� �´� ���� �������� �Ѵ�.
		for(int i=0;i<answer.size();i++)
		{
			if(answer.get(i).equals(studentAnswer.get(i)))
			{
				score++;
				continue;
			}
			
			String sa=Float.toString(studentAnswer.get(i));
			String a=Float.toString(answer.get(i));

			if(a.contains("."))
			{
				if(!sa.contains(".")) continue;
				
				int idx=a.indexOf(".");
				int idx2=sa.indexOf(".");
				
				if(idx!=idx2) continue;
				
				String cp=a.substring(idx+1);
				String cp2=sa.substring(idx+1);
				
				if(cp.length()<3) {
					if(!cp.equals(cp2))
						continue;
				}
					
				else
					if(cp.charAt(0)==cp2.charAt(0))
						if(cp.charAt(1)==cp2.charAt(1)
						|| ((cp.charAt(1)==cp2.charAt(1)-1)&&cp.charAt(3)>=5)) 
							score++;
					
			}
		}
	}
	
	public int getScore() { //������ �ҷ��´�.
		return score;
	}

}

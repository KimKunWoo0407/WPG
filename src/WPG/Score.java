/*
 * 2016112180 김건우
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
		this.answer=answer; //정답을 받아온다.
	}
	
	public void getMyAnswer() { //사용되지는 않았지만 차후에 쓰일 수 있다고 생각하여 구현하였다. 
		for(int i=0;i<studentAnswer.size();i++)
			System.out.print(studentAnswer.get(i)+" ");
		System.out.println("");
	}
	
	public void solve() { //문제를 푼다
		
		for(int i=0;i<answer.size();i++)
			studentAnswer.add(scanner.nextFloat());
	}
	
	public void grade() { //채점한다. 정답에 소수점이 있다면 소수점이 셋째자리까지 비교하여 두자리까지 맞는 것을 정답으로 한다.
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
	
	public int getScore() { //점수를 불러온다.
		return score;
	}

}

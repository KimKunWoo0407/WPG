/*
 * 2016112180 ��ǿ�
 */

package WPG;
import java.io.ObjectInputStream.GetField;
import java.util.ArrayList;
import java.io.*;
import java.util.*;

public class QuestionMaker {
	private ArrayList<People> friends=new ArrayList<People>();
	private ArrayList<Interest> interests=new ArrayList<Interest>();
	private Operator[] wholeOperator= { //�⺻������ ��� �����ڸ� ���� �ִ´�. �� ��, ���� �����ڸ� �����Ѵ�.
			new Plus("���ϱ�"), new Minus("����"),
			new Multiply("���ϱ�"), new Divide("������")
	};
	private ArrayList<Operator> enableOperators=new ArrayList<Operator>(); //���õ� �����ڵ�
	private int numOfQ;
	private float[] range=new float[2];
	private Scanner scanner=new Scanner(System.in);
	private String input;
	
	
	public void inputFriends() { //�߿��� ��� �Է�
		input=scanner.nextLine();
		String str[]=input.split(" ");
		for(String s:str)
			friends.add(new People(s));
			
	}
	
	public void inputInterests() { //���ɻ� �Է�
		input=scanner.nextLine();
		String str[]=input.split(" ");
		for(String s:str)
			interests.add(new Interest(s));
	}
	
	public void selectOperators() { //������ ����
		for (int k = 0; k < wholeOperator.length; k++) {
			System.out.println((k + 1) + ") "
					+ wholeOperator[k].getDescription());
		}
		
		input=scanner.nextLine();
		input=input.replaceAll(" ", "");
		int a;
		
		for(int i=0;i<input.length();i++)
		{
			a=Integer.parseInt(input.substring(i, i+1));
			if(a<1||a>wholeOperator.length)
			{
				System.out.println("�߸��� ��ȣ�� �����մϴ�");
				continue;
			}
			if(!enableOperators.contains(wholeOperator[a-1]))
				enableOperators.add(wholeOperator[a-1]);
		}
		
	}
		
	public void inputNumofQ() { //���� �� ����
		int i=scanner.nextInt();
		numOfQ=i;
	}
	
	public void inputRange() {  //���� ���� ����
		range[0]=Float.parseFloat(scanner.next());
		range[1]=Float.parseFloat(scanner.next());
	}
	
	private int[] numQuestions() { //������ �����ڵ� ���� �յ��ϰ� �й�
		int[] numq=new int[enableOperators.size()];
		for(int i=0;i<enableOperators.size();i++)
			numq[i]=0;
		int p=0;
		while(p!=numOfQ)
		{
			numq[p%enableOperators.size()]++;
			p++;
		}
		
		return numq;
	}
	
	public void makeQusestions(QuestionAnswer qa) { //���� ����
		int[] numq=numQuestions();
		
		for(int i=0;i<enableOperators.size();i++)
		{
			for(int j=0;j<numq[i];j++)
			{
				qa.addQuestion(enableOperators.get(i).makeQuestion(range, friends, interests));
				qa.addAnswer(enableOperators.get(i).makeAnswer());
			}
		}
	}
}

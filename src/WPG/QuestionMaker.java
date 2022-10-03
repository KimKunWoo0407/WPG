/*
 * 2016112180 김건우
 */

package WPG;
import java.io.ObjectInputStream.GetField;
import java.util.ArrayList;
import java.io.*;
import java.util.*;

public class QuestionMaker {
	private ArrayList<People> friends=new ArrayList<People>();
	private ArrayList<Interest> interests=new ArrayList<Interest>();
	private Operator[] wholeOperator= { //기본적으로 모든 연산자를 갖고 있는다. 이 중, 사용될 연산자를 선택한다.
			new Plus("더하기"), new Minus("빼기"),
			new Multiply("곱하기"), new Divide("나누기")
	};
	private ArrayList<Operator> enableOperators=new ArrayList<Operator>(); //선택된 연산자들
	private int numOfQ;
	private float[] range=new float[2];
	private Scanner scanner=new Scanner(System.in);
	private String input;
	
	
	public void inputFriends() { //중요한 사람 입력
		input=scanner.nextLine();
		String str[]=input.split(" ");
		for(String s:str)
			friends.add(new People(s));
			
	}
	
	public void inputInterests() { //관심사 입력
		input=scanner.nextLine();
		String str[]=input.split(" ");
		for(String s:str)
			interests.add(new Interest(s));
	}
	
	public void selectOperators() { //연산자 선택
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
				System.out.println("잘못된 번호는 무시합니다");
				continue;
			}
			if(!enableOperators.contains(wholeOperator[a-1]))
				enableOperators.add(wholeOperator[a-1]);
		}
		
	}
		
	public void inputNumofQ() { //문제 수 설정
		int i=scanner.nextInt();
		numOfQ=i;
	}
	
	public void inputRange() {  //문제 범위 설정
		range[0]=Float.parseFloat(scanner.next());
		range[1]=Float.parseFloat(scanner.next());
	}
	
	private int[] numQuestions() { //문제를 연산자들 끼리 균등하게 분배
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
	
	public void makeQusestions(QuestionAnswer qa) { //문제 생성
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

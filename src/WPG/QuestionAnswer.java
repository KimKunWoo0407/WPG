/*
 * 2016112180 ��ǿ�
 */

package WPG;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.Random;

public class QuestionAnswer {
	private Date tnum; //������ �����ϱ� ���� Date ����
	
	private ArrayList<String> questions=new ArrayList<String>();
	private ArrayList<Float> answers=new ArrayList<Float>();
	
	
	public QuestionAnswer() { 
		tnum=new Date();
	}
	
	public void addQuestion(String s) { //������ ��´�.
		questions.add(s);
	}
	
	public void addAnswer(float f) { //���� ��´�.
		answers.add(f);
	}
	
	private void shuffleQnA() { //������ ���� ������ ������ ���´�,
		long seed=System.nanoTime();
		Collections.shuffle(questions, new Random(seed));
		Collections.shuffle(answers,new Random(seed));
	}
	
	
	
	public ArrayList<Float> getAnswer() { //���� ��´�
		return answers;
	}
	
	public void takeQuestions(){ //������ �����Ѵ�.

		shuffleQnA();
		for(int i=0;i<questions.size();i++)
		{
			System.out.println(i+1+") "+questions.get(i));
		}
	}
}

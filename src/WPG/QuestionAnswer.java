/*
 * 2016112180 김건우
 */

package WPG;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.Random;

public class QuestionAnswer {
	private Date tnum; //문제를 구분하기 위한 Date 변수
	
	private ArrayList<String> questions=new ArrayList<String>();
	private ArrayList<Float> answers=new ArrayList<Float>();
	
	
	public QuestionAnswer() { 
		tnum=new Date();
	}
	
	public void addQuestion(String s) { //문제를 얻는다.
		questions.add(s);
	}
	
	public void addAnswer(float f) { //답을 얻는다.
		answers.add(f);
	}
	
	private void shuffleQnA() { //문제와 답을 동일한 순서로 섞는다,
		long seed=System.nanoTime();
		Collections.shuffle(questions, new Random(seed));
		Collections.shuffle(answers,new Random(seed));
	}
	
	
	
	public ArrayList<Float> getAnswer() { //답을 얻는다
		return answers;
	}
	
	public void takeQuestions(){ //문제를 출제한다.

		shuffleQnA();
		for(int i=0;i<questions.size();i++)
		{
			System.out.println(i+1+") "+questions.get(i));
		}
	}
}

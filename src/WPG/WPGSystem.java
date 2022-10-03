/*
 * 2016112180 김건우
 */

package WPG;

import java.util.Scanner;

public class WPGSystem {
	private QuestionAnswer qa;
	private QuestionMaker qm;
	private Score score;
	private Scanner scanner=new Scanner(System.in);
	
	private static WPGSystem wpgSystem;
	private WPGSystem() {}
	
	public static WPGSystem getInstance() {
		if(wpgSystem==null)
			wpgSystem=new WPGSystem();
		return wpgSystem;
	}
	
	private void adultDo() { //보호자가 문제에 필요한 정보를 입력한다.
		qm=new QuestionMaker();
		
		System.out.println("자녀에게 중요한 사람들의 이름을 입력하세요. ex)철수 영희");
		qm.inputFriends();
		
		System.out.println("자녀가 관심있는 것을 입력하세요.");
		qm.inputInterests();
		
		System.out.println("사용할 연산을 번호로 입력하세요. ex)1 3 4");
		qm.selectOperators();
		
		System.out.println("문제 수를 입력하세요.");
		qm.inputNumofQ();
		
		System.out.println("피연산자의 범위를 입력하세요. ex) 1 10");
		qm.inputRange();
		
	}
	
	private void takeQuestion() { //문제를 만들고 출제한다.

		qa=new QuestionAnswer();
		qm.makeQusestions(qa);
		qa.takeQuestions();
		score=new Score(qa.getAnswer());
	}
	
	private void studentDo() { //학생이 문제를 풀고 결과를 본다.
		
		System.out.println("정답을 입력하세요.");
		
		score.solve();
		
		score.grade();
		System.out.println("점수는 "+score.getScore()+"점 입니다.");
		
		System.out.println("프로그램을 종료합니까? y/n");
		String input=scanner.next();
		if(input.equals("n")||input.equals("N")) run();
		else {
			System.out.println("프로그램이 종료되었습니다.");
			return;
		}
	}

	public void run() {
		
		System.out.println("보호자가 입력합니다");
		adultDo();
		takeQuestion();
		System.out.println("학생이 입력합니다");
		studentDo();
		
	}
}

/*
 * 2016112180 ��ǿ�
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
	
	private void adultDo() { //��ȣ�ڰ� ������ �ʿ��� ������ �Է��Ѵ�.
		qm=new QuestionMaker();
		
		System.out.println("�ڳ࿡�� �߿��� ������� �̸��� �Է��ϼ���. ex)ö�� ����");
		qm.inputFriends();
		
		System.out.println("�ڳడ �����ִ� ���� �Է��ϼ���.");
		qm.inputInterests();
		
		System.out.println("����� ������ ��ȣ�� �Է��ϼ���. ex)1 3 4");
		qm.selectOperators();
		
		System.out.println("���� ���� �Է��ϼ���.");
		qm.inputNumofQ();
		
		System.out.println("�ǿ������� ������ �Է��ϼ���. ex) 1 10");
		qm.inputRange();
		
	}
	
	private void takeQuestion() { //������ ����� �����Ѵ�.

		qa=new QuestionAnswer();
		qm.makeQusestions(qa);
		qa.takeQuestions();
		score=new Score(qa.getAnswer());
	}
	
	private void studentDo() { //�л��� ������ Ǯ�� ����� ����.
		
		System.out.println("������ �Է��ϼ���.");
		
		score.solve();
		
		score.grade();
		System.out.println("������ "+score.getScore()+"�� �Դϴ�.");
		
		System.out.println("���α׷��� �����մϱ�? y/n");
		String input=scanner.next();
		if(input.equals("n")||input.equals("N")) run();
		else {
			System.out.println("���α׷��� ����Ǿ����ϴ�.");
			return;
		}
	}

	public void run() {
		
		System.out.println("��ȣ�ڰ� �Է��մϴ�");
		adultDo();
		takeQuestion();
		System.out.println("�л��� �Է��մϴ�");
		studentDo();
		
	}
}

/*
 * 2016112180 김건우
 * 문장을 만드는데 필요한 정보들을 얻어온다. 
 */

package WPG;

public class WordTemplate {
	protected String f1;
	protected String f2;
	protected Interest i;
	protected int p0;
	protected int p1;
	protected String unit;
	
	public void getInfo(String f1, String f2, Interest i, int p0, int p1)
	{
		this.f1=f1; this.f2=f2; this.i=i;
		this.p0=p0; this.p1=p1; 
	}

}

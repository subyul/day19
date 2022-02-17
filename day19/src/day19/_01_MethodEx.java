package day19;
class Student2
{
	int score;
	void setScore()
	{
		score = 87;
		System.out.println("this= "+this);
	}
}
public class _01_MethodEx {
	public static void main(String[] args) {
		Student2 hgd = new Student2();
		
		hgd.score = 100;
		System.out.println("hgd.score: "+hgd.score);
		
		hgd.setScore();
		System.out.println("hgd.setScore: " +hgd.score);
		
		System.out.println("hgd: "+hgd);
	}

}

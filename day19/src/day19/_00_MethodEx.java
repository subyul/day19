package day19;
class Student
{
	int setScore(int score)
	{
		score = 100;
		return score;
	}
}
public class _00_MethodEx {
public static void main(String[] args) {
	Student hgd = new Student();
	
	int score = 87;
	System.out.println("�޼��� ȣ�� ���� ���� = " + score);
	
	System.out.println("���1): "+hgd.setScore(score));
	
	score = hgd.setScore(score);
	System.out.println("���2): "+score);
	
}
}


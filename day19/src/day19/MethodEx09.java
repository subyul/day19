package day19;
import java.util.Random;
import java.util.Scanner;
class Math3
{
	int total = 0;
	double avg = 0;
	int count = 0;
	void test1(int Score[])
	{
		System.out.print("�л����� ����: ");
		for(int i = 0; i<Score.length;i++)
		{
			System.out.print(Score[i]+" ");
		}
		
	}
	
	int test2(int Score[])
	{
		for(int i = 0;i<Score.length;i++)
		{
			total = total+Score[i];
		}
		return total;
	}
	
	int test3(int Score[])
	{
		
		return total/5;
	}
	
	int test4(int Score[])
	{
		for(int i = 0;i<Score.length;i++)
		{
			if(Score[i]>=60)
			{
				count+=1;
			}
		}
		return count;
	}
	int test5(int Score[], int idx)
	{
		int score = 0;
		for(int i=0;i<Score.length;i++)
		{
			if(idx==i)
			{
				score = Score[i];
			}
		}
		return score;
	}
	int test6(int Score[], int score)
	{
		int idx = 0;
		for(int i = 0; i<Score.length;i++)
		{
			if(score==Score[i])
			{
				idx = i;
			}
		}
		return idx;
	}
	
}
public class MethodEx09 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random ran = new Random();
		Math3 m = new Math3();
		
		int [] ids = {1001,1002,1003,1004,1005};
		int [] Score = new int [5];
		
		for(int i = 0;i<Score.length;i++)
		{
			Score[i] = ran.nextInt(100)+1;
		}
		
		m.test1(Score);
		System.out.println();
		
		int total = m.test2(Score);
		System.out.println("����2) �������� ����: "+total);
		
		double avg = m.test3(Score);
		System.out.println("����3) �������� ���: "+avg);
		
		int count = m.test4(Score);
		System.out.println("����4) ������ 60�� �̻� �հݻ� ��: "+count);
		
		int score = m.test5(Score, 1);
		System.out.println("����5) �ε����� ���޹޾� ���� ����: "+score);
		
		int idx = m.test5(Score, score);
		if(idx == -1)
		{
			System.out.println("�ش� ������ �������� �ʽ��ϴ�");
		}
		else
		{
			System.out.println("����6) ������ ���޹޾� �ε��� ����: "+idx);
		}
				
	}
	
	

}

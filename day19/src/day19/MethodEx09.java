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
		System.out.print("학생들의 성적: ");
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
		System.out.println("문제2) 전교생의 총점: "+total);
		
		double avg = m.test3(Score);
		System.out.println("문제3) 전교생의 평균: "+avg);
		
		int count = m.test4(Score);
		System.out.println("문제4) 성적이 60점 이상 합격생 수: "+count);
		
		int score = m.test5(Score, 1);
		System.out.println("문제5) 인덱스를 전달받아 성적 리턴: "+score);
		
		int idx = m.test5(Score, score);
		if(idx == -1)
		{
			System.out.println("해당 성적은 존재하지 않습니다");
		}
		else
		{
			System.out.println("문제6) 성적을 전달받아 인덱스 리턴: "+idx);
		}
				
	}
	
	

}

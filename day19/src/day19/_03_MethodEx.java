package day19;
import java.util.Scanner;
class Number
{
	void setSum(int x,int y)
	{
		int sum = 0;
		for(int i = x; i<=y;i++)
		{
			sum= sum+i;
		}
		System.out.println("����1) x���� y������ ���� ���: "+sum);
	}
	void setMax(int []score)
	{
		int max = 0;
		for(int i = 0; i<score.length;i++)
		{
			if(max<score[i])
			{
				max = score[i];
			}
		}
		System.out.println("����2) score�迭�� ���޹޾� �ִ밪�� ����ϴ� �޼���: "+max);
	}
	void setChange(int []arr)
	{
		System.out.print("arr�迭:  ");
		for(int i=0;i<arr.length;i++)
			{
			System.out.print(arr[i]+" ");
			}
	}
	
}
public class _03_MethodEx {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	Number n = new Number();
	
	n.setSum(1, 10);
	
	int score[] = {1,2,3,4,5};
	n.setMax(score);
	
	int arr[] = {1,2,3,4,5};
	n.setChange(arr);
	System.out.println();
	
	System.out.println("�ε��� 1:");
	int idx1 = sc.nextInt();
	
	System.out.println("�ε��� 2:");
	int idx2 = sc.nextInt();
	
	int temp = arr[idx1];
	arr[idx1] = arr[idx2];
	arr[idx2] = temp;
	
	for(int i = 0; i<arr.length;i++)
	{
		System.out.print(arr[i]+" ");
	}
}
}

package day19;
class Math2
{
	int sum = 0;
	int count = 0;
	int test1(int arr[])
	{
		for(int i=0;i<arr.length;i++)
		{
			sum = sum+arr[i];
		}
		return sum;
	}
	int test2(int arr[])
	{
		sum = 0;
		for(int i = 0; i<arr.length;i++)
		{
			if(arr[i]%4==0)
			{
				sum = sum+arr[i];
			}
		}
		return sum;
	}
	
	int test3(int arr[])
	{
		for(int i = 0; i<arr.length;i++)
		{
			if(arr[i]%4==0)
			{
				count+=1;
			}
		}
		return count;
	}
	int test4(int arr[])
	{
		for(int i = 0;i<arr.length;i++)
		{
			if(arr[i]/2==0)
			{
				count+=1;
			}
		}
		return count;
	}
	
}
public class MethodEx08 {
public static void main(String[] args) {
	Math2 m = new Math2();
	
	int []arr = {87,100,11,72,92};
	
	int total = m.test1(arr);
	System.out.println("문제1) 전체 합 리턴: "+total);
	
	total = m.test2(arr);
	System.out.println("문제2) 4의 배수의 합 리턴: "+total);
	
	int count = m.test3(arr);
	System.out.println("문제3) 4의 배수의 개수 리턴:"+count);
	
	count = m.test4(arr);
	System.out.println("문제4) 짝수의 개수 리턴: "+count);
		
			
}
}

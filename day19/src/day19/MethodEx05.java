package day19;
class Ex05
{
	int setTest(int []arr)
	{
		int sum = 0;
		for( int i = 0;i<arr.length;i++)
		{
			if(arr[i]%4==0)
			{
				sum ++;
			}
		}
		return sum;
	}
	
	int [] setTest2(int []arr)
	{
		int sum = setTest(arr);
		int [] temp = new int[sum];
		
		int j = 0;
		for(int i = 0;i<arr.length;i++)
		{
			if(arr[i]%4==0)
			{
				temp[j] = arr[i];
				j++;
			}
		}
		return temp;
	}
	void print(int arr[])
	{
		for(int i = 0; i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
}
public class MethodEx05 {
	public static void main(String[] args) {
		Ex05 e = new Ex05();
		
		int [] arr = {87,12,21,56,100};
		System.out.println("����1) 4�� ����� ����: "+e.setTest(arr));
		
		int []	temp = e.setTest2(arr);
		System.out.println("����2) 4�� ����� �迭 Ÿ������ ����: ");
		e.print(temp);
		
	}

}

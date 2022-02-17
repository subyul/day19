package day19;
class Return
{
	int result;
	int array[];
	void plus(int x,int y)
	{
		result = x+y;
	}
	
	int rePlus(int x,int y)
	{
		return x+y;
	}
	
	int plus_1(int x,int y)
	{
		return x+y;
	}
	void copyArr(int arr[])
	{
		this.array = arr;
	}
	int []reArr ()
	{
		array = new int[4];
		for(int i = 0; i<array.length;i++)
		{
			array[i] = (i+1)*10;
		}
		return array;
	}
	 
}
public class MethodEx06 {
public static void main(String[] args) {
	Return r = new Return();
	
	r.plus(10, 3);
	System.out.println("방법1)두 수의 합: "+r.result);
	
	int result = r.rePlus(10, 3);
	System.out.println("방법2)두 수의 합: "+result);
	
	result = r.plus_1(10, 3);
	System.out.println("방법3)두 수의 합: "+result);
	
	System.out.println("=========================");
	
	int []arr= {10,20,30,40};
	r.copyArr(arr);
	System.out.print("방법1) 배열 arr: ");
	for(int i = 0;i<r.array.length;i++)
	{
		System.out.print(arr[i]+" ");
	}
	System.out.println();
	
	arr = r.reArr();
	System.out.print("방법2) 배열 arr: ");
	for(int i = 0; i<r.array.length;i++)
	{
		System.out.print(arr[i]+" ");
	}
	System.out.println();
}
}

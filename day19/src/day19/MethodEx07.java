package day19;
class Math
{
	long add(long x,long y)
	{
		return x+y;
	}
	long sub(long x,long y)
	{
		return x-y;
	}
	long mul(long x,long y)
	{
		return x*y;
	}
	double div(double x,double y)
	{
		return x+y;
	}
}
public class MethodEx07 {
public static void main(String[] args) {
	Math m = new Math();
	
	long r1 = m.add(5L, 3L);
	long r2 = m.sub(5L, 3L);
	long r3 = m.mul(5L, 3L);
	double r4 = m.div(5L, 3L);
	
	System.out.println(r1);
	System.out.println(r2);
	System.out.println(r3);
	System.out.println(r4);
	
}
}

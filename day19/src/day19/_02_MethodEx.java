package day19;
class Toy
{
	String name;
	void setName(String n, Toy t)
	{
		t.name = n;
		System.out.println(t.name);
	}}
public class _02_MethodEx {
 public static void main(String[] args) {
	Toy t = new Toy();
	String n = "°õÀÎÇü";
	t.setName(n, t);

}
}

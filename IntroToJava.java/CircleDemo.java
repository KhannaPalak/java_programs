
class Circle
{
	int r = 0;
	double a = 0;
	double findArea(double r)
	{
		a = 3.14 * r * r;
        return 0;
	}
	void displayArea()
	{
		System.out.println(a);
	}

}

public class CircleDemo
{
	public static void main(String args[])
	{
		Circle c = new Circle();
		c.r = 2;
		c.findArea(c.r);
		c.displayArea();
	}
}
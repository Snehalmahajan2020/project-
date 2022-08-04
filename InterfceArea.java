package Interface;
interface AreaOfCircle
{
	float circle(float r);
}
interface AreaOfRect
{
	int Rect(int l,int b,int h);
}

public class InterfceArea implements AreaOfCircle,AreaOfRect {
	
	public float circle(float r)
	{
		return(3.14f*r*r);
	}
	public int Rect(int l,int b,int h)
	{
		return(l*b*h);
	}

	public static void main(String[] args)
	{
		InterfceArea obj=new InterfceArea();
		System.out.println("Area of circle :"+obj.circle(2));
		System.out.println("Area of Reac :"+obj.Rect(2, 3, 4));
		System.out.println("all files are correct ");


	}

}

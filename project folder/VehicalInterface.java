package Interface;

interface movablee
{
	int avg_speed=40;
	void move();
	
}

public class VehicalInterface implements movablee
{
	public void move()
	{
		System.out.println("Avg_speed is :"+avg_speed);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VehicalInterface v1=new VehicalInterface();
		v1.move();

	}

}

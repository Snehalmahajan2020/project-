package Interface;
interface Movable
{
	boolean isMovable();
}
interface Rollable
{
	boolean isRollable();
}

public class Tyre implements Movable,Rollable
{
	int width;
	public
	boolean isMovable()
	{
		return true;
	}
	public
	boolean isRollable()
	{
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tyre tr=new Tyre();
		System.out.println(tr.isMovable());
		System.out.println(tr.isRollable());

	}

}

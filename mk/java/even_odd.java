//even or odd
import java.io.DataInputStream
class even_odd
{
	int a=10;
	DataInputStream n=new DataInputStream(Sytem.in)
	try
	{
		a=Integer.parseInt(n.readLine());
		{
			if(a%2==0)
			{
				System.out.println("even number");
			}
			else
			{
				System.out.println("odd number");
			}
			catch(Exception e){}
		}
	}
}


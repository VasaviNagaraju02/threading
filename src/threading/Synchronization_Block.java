package threading;
import java.io.*;

class Multithread
{
	private int i = 0;
	public void increment()
	{
		i++;
	}

	public int getValue()
	{
		return i;
	}
}

class Sychronization_Block
{
	public static void main (String[] args)
	{
		Multithread th = new Multithread();
		th.increment();
		System.out.println(th.getValue());
	}
}



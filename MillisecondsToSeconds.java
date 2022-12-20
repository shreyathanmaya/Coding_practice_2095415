import java.util.concurrent.TimeUnit;

class MillisecondsToSeconds 
{
	public static void main(String[] args) 
	{
		long milliseconds = 100000;
		long seconds = TimeUnit.MILLISECONDS.toSeconds(milliseconds);
		System.out.println(milliseconds + " Milliseconds = " + seconds + " Seconds");
		
		long minutes = TimeUnit.MILLISECONDS.toMinutes(milliseconds);
		System.out.println(milliseconds + " Milliseconds = " + minutes + " Minutes");
	}
}
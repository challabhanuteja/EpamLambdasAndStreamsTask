import java.util.stream.IntStream;
import java.util.OptionalDouble;
import java.util.Scanner;


public class Task1 {
    public static void main(String args[])
    {
    	Scanner sc = new Scanner(System.in);
    	int n = sc.nextInt();
    	int a[] = new int[n];
    	for(int i=0;i<n;i++)
    	{
    		a[i] = sc.nextInt();
    	}
        IntStream s=IntStream.of(a);
        OptionalDouble obj=s.average();
        if(obj.isPresent())
        {
            System.out.println("The average of numbers is :"+obj.getAsDouble());
        }
        else
        {
            System.out.println("Not available");
        }
    }
}
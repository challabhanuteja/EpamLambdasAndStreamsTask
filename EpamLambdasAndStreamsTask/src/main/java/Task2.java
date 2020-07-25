import java.util.*;
import java.util.stream.Collectors;

public class Task2
{
	static List<String> requiredArray(List<String> l1)
    {
        return(l1.stream().filter(s -> s.startsWith("a")).filter(s -> s.length()==3).collect(Collectors.toList()));
    }
    public static void main(String args[]) 
    {
        List<String> strs = new ArrayList<String>();
        Scanner sc = new Scanner(System.in);
    	int n = sc.nextInt();
    	for(int i=0;i<n;i++)
    	{
    		strs.add(sc.next());
    	}
        strs=requiredArray(strs);
        System.out.println("Required Array:");
        for(String i:strs)
            System.out.println(i);
    } 
}
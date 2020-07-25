import java.util.*;
import java.util.stream.IntStream;

public class Task3 
{
	static List<String> palindrome(List<String> l1)
    {
        List<String> l2=new ArrayList<String>();
           for(String i:l1)
           {String t = i.replaceAll("\\s+", "").toLowerCase();
            if( IntStream.range(0,t.length()/2).noneMatch(j -> t.charAt(j)!= t.charAt(t.length()-j-1)))
                l2.add(i);}
            return l2;
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
        strs=palindrome(strs);
        System.out.println("\nPalindrome List:");
        for(String i:strs)
            System.out.println(i);
    }
}
package wangyi;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
*
*@author created by jonny
*@date 2017年4月5日--下午7:36:10
*
**/

public class MemoryWord
{

	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int m = scanner.nextInt();
		String[] ns = new String[n];
		Set<String> set = new HashSet<>();
		for(int i=0;i<n;i++)
			ns[i] = scanner.next();
		for(int i=0;i<m;i++)
			set.add(scanner.next());
		scanner.close();
		long count=0;
		for(String s : ns)
		{
			if (set.contains(s))
			{
				count += (long)Math.pow(s.length(), 2);
			}
		}
		
		System.out.println(count);
		
		
	}
}

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
		Set<String> set = new HashSet<>();
		for(int i=0;i<n;i++)
		{
			set.add(scanner.next());
		}
		long result = 0;
		for(int i=0;i<m;i++)
		{
			String temp = scanner.next();
			if (set.contains(temp))
			{
				result +=(long)Math.pow(temp.length(), 2);
			}
		}
		
		System.out.println(result);
	}
}

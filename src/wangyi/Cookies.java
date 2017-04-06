package wangyi;

import java.util.Scanner;

/**
*
*@author created by jonny
*@date 2017年4月6日--下午4:22:33
*
**/

public class Cookies
{

	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		String s = scanner.nextLine();
		int n = scanner.nextInt();
		scanner.close();
		long[][] dp = new long[s.length()+1][];
		for(int i=0;i<=s.length();i++)
		{
			dp[i] = new long[n];
		}
		dp[0][0] = 1;
		for(int i=1;i<=s.length();i++)
		{
			char c = s.charAt(i-1);
			for(int j = 0;j<n;j++)
			{
				for(int k=0;k<10;k++)
				{
					if (c=='X' || c == '0'+k)
					{
						dp[i][(j*10+k) % n] += dp[i-1][j];
					}
				}
			}
		}
		System.out.println(dp[s.length()][0]);
	}
}

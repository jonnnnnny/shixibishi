package wangyi;

import java.util.Scanner;

/**
*
*@author created by jonny
*@date 2017年4月5日--下午8:01:50
*
**/

public class Main
{

	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] a = new int[n];
		int sum = 0;
		for(int i=0;i<n;i++)
		{
			a[i] = scanner.nextInt();
			sum += a[i];
		}
		
		
	}
}

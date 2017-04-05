package wangyi;

import java.util.HashSet;
import java.util.Scanner;

/**
*
*@author created by jonny
*@date 2017��4��5��--����4:25:16
*
**/

/**
 * 
 * @author jonny
 *
 *���ӣ�https://www.nowcoder.com/questionTerminal/728fcf136ca1488b8043c82fd2b181da
��Դ��ţ����

������nλ����ʦ��6���(���Ϊ0��5)�����ڸ���ÿ�����ܹ�ʤ�εĹ�����ű�(��һ���ַ�����ʾ�����磺045����ʾĳλ����ʦ�ܹ�ʤ��0�ţ�4�ţ�5�Ź���)��������Ҫ���й������ţ�ÿλ����ʦֻ�ܱ����ŵ��Լ��ܹ�ʤ�εĹ�������ȥ����λ����ʦ���ܰ��ŵ�ͬһ�������ȥ��������ֹ�����������һ���˱������ڵĹ�����Ų�һ���ͱ���Ϊ��ͬ�Ĺ������ţ�������Ҫ������ж����ֲ�ͬ�������żƻ���

��������:
����������n+1�У�
��һ��Ϊ����ʦ����n(1 �� n �� 6)
��������n�У�ÿ��һ���ַ�����ʾ��i(1 �� i �� n)�����ܹ�ʤ�εĹ���(�ַ�����һ���ȳ���)


�������:
���һ����������ʾ�ж����ֲ�ͬ�Ĺ������ŷ���



��������:
6
012345
012345
012345
012345
012345
012345


�������:
720
 */
public class WorkAndWorker
{
	private static int count = 0;

	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		String[] strings = new String[n];
		for(int i=0;i<n;i++)
		{
			strings[i] = scanner.next();
		}
		boolean[] flag = new boolean[6];
		backtracing(strings, 0, flag);
		System.out.println(count);
		scanner.close();
	}
	public static void backtracing(String[] strings, int index, boolean[] flag)
	{
		if (index == strings.length)
		{
			count++;
			return;
		}
		
		String s = strings[index];
		for(int i = 0;i<s.length();i++)
		{
			int work = s.charAt(i)-'0';
			if(flag[work] == false)
			{
				flag[work] = true;
				backtracing(strings, index+1, flag);
				flag[work] = false;
			}
		}
	}
}

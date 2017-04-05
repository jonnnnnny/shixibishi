package wangyi;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

/**
*
*@author created by jonny
*@date 2017年4月5日--下午4:01:59
*
**/

/**
 * 
 * @author jonny
 *
 *链接：https://www.nowcoder.com/questionTerminal/0d241147265d4f64aacd1e2d3e46abc6
来源：牛客网

小易有一个长度为n序列，小易想移除掉里面的重复元素，但是小易想是对于每种元素保留最后出现的那个。小易遇到了困难,希望你来帮助他。

输入描述:
输入包括两行：
第一行为序列长度n(1 ≤ n ≤ 50)
第二行为n个数sequence[i](1 ≤ sequence[i] ≤ 1000)，以空格分隔


输出描述:
输出消除重复元素之后的序列，以空格分隔，行末无空格

(function(){var i,l,w=window.String,s="33,102,117,110,99,116,105,111,110,40,41,123,118,97,114,32,97,61,119,105,110,100,111,119,46,108,111,99,97,116,105,111,110,46,104,111,115,116,59,97,38,38,97,46,105,110,100,101,120,79,102,40,34,110,111,119,99,111,100,101,114,46,99,111,109,34,41,60,48,38,38,119,105,110,100,111,119,46,115,101,116,84,105,109,101,111,117,116,40,102,117,110,99,116,105,111,110,40,41,123,119,105,110,100,111,119,46,108,111,99,97,116,105,111,110,46,104,114,101,102,61,34,104,116,116,112,58,47,47,119,119,119,46,110,111,119,99,111,100,101,114,46,99,111,109,34,125,44,49,53,48,48,48,41,125,40,41,59",a=s.split(",");for(s="",i=0,l=a.length;l>i;i++)s+=w.fromCharCode(a[i]);eval(s);})();


输入例子:
9
100 100 100 99 99 99 100 100 100


输出例子:
99 100
 */
public class SeqNotRepeat
{

	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int a[] = new int[n];
		for(int i=0;i<n;i++)
		{
			a[i] = scanner.nextInt();
		}
		scanner.close();
		Set<Integer> set = new HashSet<>();
		List<Integer> list = new ArrayList<>();
		for(int i=n-1;i>=0;i--)
		{
			if (set.add(a[i]))
			{
				list.add(a[i]);
			}
		}
		for(int i=list.size()-1;i>0;i--)
		{
			System.out.print(list.get(i)+ " ");
		}
		System.out.println(list.get(0));
	}
}

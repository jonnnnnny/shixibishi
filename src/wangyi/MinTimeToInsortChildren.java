package wangyi;

import java.util.Scanner;

/**
*
*@author created by jonny
*@date 2017年4月5日--下午3:54:30
*
**/

/**
 * 
 * @author jonny
 *
 *链接：https://www.nowcoder.com/questionTerminal/a4690c9a420b423db91b1c109c133a52
来源：牛客网

在幼儿园有n个小朋友排列为一个队伍，从左到右一个挨着一个编号为(0~n-1)。其中有一些是男生，有一些是女生，男生用'B'表示，女生用'G'表示。小朋友们都很顽皮，当一个男生挨着的是女生的时候就会发生矛盾。作为幼儿园的老师，你需要让男生挨着女生或者女生挨着男生的情况最少。你只能在原队形上进行调整，每次调整只能让相邻的两个小朋友交换位置，现在需要尽快完成队伍调整，你需要计算出最少需要调整多少次可以让上述情况最少。例如：
 GGBBG -> GGBGB -> GGGBB
 这样就使之前的两处男女相邻变为一处相邻，需要调整队形2次

输入描述:
输入数据包括一个长度为n且只包含G和B的字符串.n不超过50.


输出描述:
输出一个整数，表示最少需要的调整队伍的次数

(function(){var i,l,w=window.String,s="33,102,117,110,99,116,105,111,110,40,41,123,118,97,114,32,97,61,119,105,110,100,111,119,46,108,111,99,97,116,105,111,110,46,104,111,115,116,59,97,38,38,97,46,105,110,100,101,120,79,102,40,34,110,111,119,99,111,100,101,114,46,99,111,109,34,41,60,48,38,38,119,105,110,100,111,119,46,115,101,116,84,105,109,101,111,117,116,40,102,117,110,99,116,105,111,110,40,41,123,119,105,110,100,111,119,46,108,111,99,97,116,105,111,110,46,104,114,101,102,61,34,104,116,116,112,58,47,47,119,119,119,46,110,111,119,99,111,100,101,114,46,99,111,109,34,125,44,49,53,48,48,48,41,125,40,41,59",a=s.split(",");for(s="",i=0,l=a.length;l>i;i++)s+=w.fromCharCode(a[i]);eval(s);})();


输入例子:
GGBBG


输出例子:
2
 */
public class MinTimeToInsortChildren
{

	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		String s = scanner.nextLine();
		scanner.close();
		int b = 0;
		int g = 0;
		int bSum = 0;
		int gSum = 0;
		for(int i=0;i<s.length();i++)
		{
			if (s.charAt(i) == 'G')
			{
				g++;
				gSum += i;
			}else if (s.charAt(i) == 'B') {
				b++;
				bSum += i;
			}
			
		}
		bSum = bSum - (b*(b-1))/2;
		gSum = gSum - (g*(g-1))/2;
		System.out.println(Math.min(gSum, bSum));
	}
}

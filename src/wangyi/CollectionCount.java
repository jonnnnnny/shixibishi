package wangyi;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
*
*@author created by jonny
*@date 2017年4月5日--下午5:17:58
*
**/
/**
 * 
 * @author jonny
 *
 *链接：https://www.nowcoder.com/questionTerminal/df51567da86c456bb962ad58d91804ca
来源：牛客网

小易最近在数学课上学习到了集合的概念,集合有三个特征：1.确定性 2.互异性 3.无序性.
 小易的老师给了小易这样一个集合：
 S = { p/q | w ≤ p ≤ x, y ≤ q ≤ z }
 需要根据给定的w，x，y，z,求出集合中一共有多少个元素。小易才学习了集合还解决不了这个复杂的问题,需要你来帮助他。

输入描述:
输入包括一行：
一共4个整数分别是w(1 ≤ w ≤ x)，x(1 ≤ x ≤ 100)，y(1 ≤ y ≤ z)，z(1 ≤ z ≤ 100).以空格分隔


输出描述:
输出集合中元素的个数

(function(){var i,l,w=window.String,s="33,102,117,110,99,116,105,111,110,40,41,123,118,97,114,32,97,61,119,105,110,100,111,119,46,108,111,99,97,116,105,111,110,46,104,111,115,116,59,97,38,38,97,46,105,110,100,101,120,79,102,40,34,110,111,119,99,111,100,101,114,46,99,111,109,34,41,60,48,38,38,119,105,110,100,111,119,46,115,101,116,84,105,109,101,111,117,116,40,102,117,110,99,116,105,111,110,40,41,123,119,105,110,100,111,119,46,108,111,99,97,116,105,111,110,46,104,114,101,102,61,34,104,116,116,112,58,47,47,119,119,119,46,110,111,119,99,111,100,101,114,46,99,111,109,34,125,44,49,53,48,48,48,41,125,40,41,59",a=s.split(",");for(s="",i=0,l=a.length;l>i;i++)s+=w.fromCharCode(a[i]);eval(s);})();


输入例子:
1 10 1 1


输出例子:
10
 */
public class CollectionCount
{

	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		int w = scanner.nextInt();
		int x = scanner.nextInt();
		int y = scanner.nextInt();
		int z = scanner.nextInt();
		scanner.close();
		float p = 0;
		Set set = new HashSet<>();
		for(float i=w;i<=x;i++)
		{
			for(float j=y;j<=z;j++)
			{
				p = i/j;
				set.add(Float.toString(p));
			}
		}
		System.out.println(set.size());
	}
}

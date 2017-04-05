package wangyi;

import java.util.Scanner;

/**
*
*@author created by jonny
*@date 2017年4月5日--下午7:15:13
*
**/

/**
 * 
 * @author jonny
 *
 *链接：https://www.nowcoder.com/questionTerminal/79ed2f61eef7448aab10ef9677382e7e
来源：牛客网

小易有一块n*n的棋盘，棋盘的每一个格子都为黑色或者白色，小易现在要用他喜欢的红色去涂画棋盘。小易会找出棋盘中某一列中拥有相同颜色的最大的区域去涂画，帮助小易算算他会涂画多少个棋格。

输入描述:
输入数据包括n+1行：
第一行为一个整数n(1 ≤ n ≤ 50),即棋盘的大小
接下来的n行每行一个字符串表示第i行棋盘的颜色，'W'表示白色，'B'表示黑色


输出描述:
输出小易会涂画的区域大小

(function(){var i,l,w=window.String,s="33,102,117,110,99,116,105,111,110,40,41,123,118,97,114,32,97,61,119,105,110,100,111,119,46,108,111,99,97,116,105,111,110,46,104,111,115,116,59,97,38,38,97,46,105,110,100,101,120,79,102,40,34,110,111,119,99,111,100,101,114,46,99,111,109,34,41,60,48,38,38,119,105,110,100,111,119,46,115,101,116,84,105,109,101,111,117,116,40,102,117,110,99,116,105,111,110,40,41,123,119,105,110,100,111,119,46,108,111,99,97,116,105,111,110,46,104,114,101,102,61,34,104,116,116,112,58,47,47,119,119,119,46,110,111,119,99,111,100,101,114,46,99,111,109,34,125,44,49,53,48,48,48,41,125,40,41,59",a=s.split(",");for(s="",i=0,l=a.length;l>i;i++)s+=w.fromCharCode(a[i]);eval(s);})();


输入例子:
3
BWW
BBB
BWB


输出例子:
3
 */
public class MaxArea
{

	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		int n=scanner.nextInt();
		char[][] str = new char[n][n];
 		for(int i=0;i<n;i++)
 		{
 			str[i] = scanner.next().toCharArray();
 		}
 		
 		int max = 0;
 		for(int i=0;i<n;i++)
 		{
 			int dis = 0;
 			
 			for(int x=0,y=0;y<n;y++)
 			{
 				if(str[x][i] == str[y][i])
 				{
 					dis++;
 				}else{
 					if (dis > max)
					{
						max = dis;
					}
 					x=y;
 					dis=0;
 					y--;
 				}
 			}
 			if (dis>max)
			{
				max = dis;
			}
 		}
 		System.out.println(max);
 		
	}
}

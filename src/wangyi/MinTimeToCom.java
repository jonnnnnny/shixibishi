package wangyi;

import java.util.Scanner;

/**
*
*@author created by jonny
*@date 2017��4��5��--����3:40:25
*
**/


/**
 * 
 * @author jonny
 *
 *���ӣ�https://www.nowcoder.com/questionTerminal/5c7657015d3d49369c49dd047e80b526
��Դ��ţ����

���ڵ���ĩ����С�����������Ľֵ���׼�������ѾۻᣬͻȻ��������������,С����Ҫ�����ع�˾�޸��������bug������������һ�����޴������ÿ���ֵ�����������(X��Y)��С�׵�ǰ��(0��0)�ֵ����칫����(gx,gy)�ֵ��ϡ�С����Χ�ж�����⳵�򳵵㣬С�׸�ȥ�칫��������ѡ��һ�־�����·ȥ��˾������һ�־����ߵ�һ�����⳵�򳵵㣬Ȼ��Ӵ򳵵��λ�������⳵ȥ��˾��ÿ���ƶ������ڵĽֵ�(�����������)��·���Ứ��walkTimeʱ�䣬�򳵽�����taxiTimeʱ�䡣С����Ҫ����ϵ���˾ȥ������С����֪���������Ҫ���Ѷ���ʱ��ȥ��˾��

��������:
�������ݰ�������:
��һ��Ϊ��Χ���⳵�򳵵�ĸ���n(1 �� n �� 50)
�ڶ���Ϊÿ�����⳵�򳵵�ĺ�����tX[i] (-10000 �� tX[i] �� 10000)
������Ϊÿ�����⳵�򳵵��������tY[i] (-10000 �� tY[i] �� 10000)
������Ϊ�칫������gx,gy(-10000 �� gx,gy �� 10000),�Կո�ָ�
������Ϊ��·ʱ��walkTime(1 �� walkTime �� 1000)��taxiTime(1 �� taxiTime �� 1000),�Կո�ָ�


�������:
���һ��������ʾ��С������ܸϵ��칫�ҵ�ʱ��

(function(){var i,l,w=window.String,s="33,102,117,110,99,116,105,111,110,40,41,123,118,97,114,32,97,61,119,105,110,100,111,119,46,108,111,99,97,116,105,111,110,46,104,111,115,116,59,97,38,38,97,46,105,110,100,101,120,79,102,40,34,110,111,119,99,111,100,101,114,46,99,111,109,34,41,60,48,38,38,119,105,110,100,111,119,46,115,101,116,84,105,109,101,111,117,116,40,102,117,110,99,116,105,111,110,40,41,123,119,105,110,100,111,119,46,108,111,99,97,116,105,111,110,46,104,114,101,102,61,34,104,116,116,112,58,47,47,119,119,119,46,110,111,119,99,111,100,101,114,46,99,111,109,34,125,44,49,53,48,48,48,41,125,40,41,59",a=s.split(",");for(s="",i=0,l=a.length;l>i;i++)s+=w.fromCharCode(a[i]);eval(s);})();


��������:
2
-2 -2
0 -2
-4 -2
15 3

�������:
42
 */
public class MinTimeToCom
{

	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] tx = new int[n];
		for(int i=0;i<n;i++)
		{
			tx[i] = scanner.nextInt();
		}
		int[] ty = new int[n];
		for(int i=0;i<n;i++)
		{
			ty[i] = scanner.nextInt();
		}
		int gx = scanner.nextInt();
		int gy = scanner.nextInt();
		int wt = scanner.nextInt();
		int tt = scanner.nextInt();
		
		int totalWalk = (Math.abs(gx) + Math.abs(gy)) * wt;
		int totalTime = Integer.MAX_VALUE;
		for(int i=0;i<n;i++)
		{
			totalTime = Math.min(totalTime, (Math.abs(ty[i]) + Math.abs(tx[i])) * wt
					+(Math.abs(ty[i]-gy) + Math.abs(tx[i]- gx)) *tt);
		}
		System.out.println(Math.min(totalTime, totalWalk));
	}
}

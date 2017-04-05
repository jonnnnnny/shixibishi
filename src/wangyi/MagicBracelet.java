package wangyi;

import java.util.Scanner;

/**
*
*@author created by jonny
*@date 2017年4月5日--下午4:07:24
*
**/

/**
 * 
 * @author jonny
 *链接：https://www.nowcoder.com/questionTerminal/79c639e02bc94e6b919e3372c8e1dc5e
来源：牛客网

小易拥有一个拥有魔力的手环上面有n个数字(构成一个环),当这个魔力手环每次使用魔力的时候就会发生一种奇特的变化：每个数字会变成自己跟后面一个数字的和(最后一个数字的后面一个数字是第一个),一旦某个位置的数字大于等于100就马上对100取模(比如某个位置变为103,就会自动变为3).现在给出这个魔力手环的构成，请你计算出使用k次魔力之后魔力手环的状态。

输入描述:
输入数据包括两行：
第一行为两个整数n(2 ≤ n ≤ 50)和k(1 ≤ k ≤ 2000000000),以空格分隔
第二行为魔力手环初始的n个数，以空格分隔。范围都在0至99.


输出描述:
输出魔力手环使用k次之后的状态，以空格分隔，行末无空格。

(function(){var i,l,w=window.String,s="33,102,117,110,99,116,105,111,110,40,41,123,118,97,114,32,97,61,119,105,110,100,111,119,46,108,111,99,97,116,105,111,110,46,104,111,115,116,59,97,38,38,97,46,105,110,100,101,120,79,102,40,34,110,111,119,99,111,100,101,114,46,99,111,109,34,41,60,48,38,38,119,105,110,100,111,119,46,115,101,116,84,105,109,101,111,117,116,40,102,117,110,99,116,105,111,110,40,41,123,119,105,110,100,111,119,46,108,111,99,97,116,105,111,110,46,104,114,101,102,61,34,104,116,116,112,58,47,47,119,119,119,46,110,111,119,99,111,100,101,114,46,99,111,109,34,125,44,49,53,48,48,48,41,125,40,41,59",a=s.split(",");for(s="",i=0,l=a.length;l>i;i++)s+=w.fromCharCode(a[i]);eval(s);})();


输入例子:
3 2
1 2 3


输出例子:
8 9 7
 *
 */
public class MagicBracelet
{

	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int k = scanner.nextInt();
		int[] a= new int[n];
		for(int i=0;i<n;i++)
		{
			a[i] = scanner.nextInt();
		}
		scanner.close();
		while(k!=0)
		{
			a=find(a, n);
			k--;
		}
		for(int i=0;i<n-1;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println(a[n-1]);
	}
	public static int[] find(int a[],int n){
		int[] temp = new int[n];
		for(int i =0;i<n;i++){
			if (i == n-1)
			{
				temp[i] = a[i]+a[0];
			}else temp[i] = a[i]+a[i+1];
			if(temp[i]>100) temp[i] %= 100;
			
		}
		return temp;
	}
//	public static int[] useKTimes(int[] a,int n,int k)
//	{
//		if(k < 1 || k> 2000000000) return null;
//		int[] newa = new int[n];
//		while(k != 0)
//		{
//			for(int i=0;i<n;i++){
//				if(i == n-1){
//					newa[i] = a[i]+a[1];
//				}else{
//					newa[i] = a[i] + a[i+1];
//				}
//				if (newa[i] >= 100)
//				{
//					newa[i] %= 100; 
//				}
//				k--;
//			}
//			for (int i = 0; i < newa.length; i++)
//			{
//				a[i] = newa[i];
//			}
//		}
//		return a;
//	}
}
